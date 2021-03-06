package ui.SystemSetup;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import dao.EmployeeDAO;
import dao.RepertoryDAO;
import entity.Employee;
import entity.Repertory;
import entity.Supplier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class FrmEmployeeInfor extends JFrame {


    private JPanel contentPane;
    private JTable table;
    private JTextField txtName;
    private JTextField txtBZ;
    private JTextField txtTel;
    private JComboBox comZW;
    private JButton btnDelete;
    private JButton btnAdd;
    private JButton btnUpdate;
    private JTextField txtFindName;
    private JTextField txtFindTel;
    private JComboBox comFindZhiWu;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmEmployeeInfor frame = new FrmEmployeeInfor();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public FrmEmployeeInfor() {
        setVisible(true);
        setIconImage(new ImageIcon("src/images/????????????.png").getImage());
        setTitle("????????????");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1156, 720);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setLocation(254, 249);//????????????
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 204));
        panel_1.setBorder(new EmptyBorder(10, 5, 10, 5));
        //panel_1.setBorder(new TitledBorder(null, "????????????", TitledBorder.LEADING, TitledBorder.TOP, new Font("??????", Font.PLAIN, 20), null));
        panel.add(panel_1, BorderLayout.NORTH);
        panel_1.setLayout(new GridLayout(4, 0, 0, 20));

        JPanel panel_4 = new JPanel();
        panel_1.add(panel_4);
        panel_4.setLayout(new GridLayout(1, 2, 0, 0));

        JPanel panel_8 = new JPanel();
        panel_8.setBackground(new Color(255, 255, 204));
        panel_8.setBorder(new EmptyBorder(0, 0, 0, 80));
        panel_4.add(panel_8);
        panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));

        JLabel label = new JLabel("???????????????");
        label.setFont(new Font("??????", Font.PLAIN, 20));
        panel_8.add(label);

        txtName = new JTextField();
        txtName.setFont(new Font("??????", Font.PLAIN, 20));
        txtName.setColumns(10);
        panel_8.add(txtName);

        JPanel panel_9 = new JPanel();
        panel_9.setBackground(new Color(255, 255, 204));
        panel_9.setBorder(new EmptyBorder(0, 0, 0, 80));
        panel_4.add(panel_9);
        panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.X_AXIS));

        JLabel label_1 = new JLabel("???????????????");
        label_1.setFont(new Font("??????", Font.PLAIN, 20));
        panel_9.add(label_1);

        comZW = new JComboBox();
        comZW.setModel(new DefaultComboBoxModel(new String[]{"?????????", "?????????", "??????", "??????"}));
        comZW.setFont(new Font("??????", Font.PLAIN, 20));
        comZW.setBackground(Color.WHITE);
        panel_9.add(comZW);

        JPanel panel_5 = new JPanel();
        panel_1.add(panel_5);
        panel_5.setLayout(new GridLayout(0, 2, 0, 0));

        JPanel panel_10 = new JPanel();
        panel_10.setBackground(new Color(255, 255, 204));
        panel_10.setBorder(new EmptyBorder(0, 0, 0, 80));
        panel_5.add(panel_10);
        panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));

        JLabel label_2 = new JLabel("???????????????");
        label_2.setFont(new Font("??????", Font.PLAIN, 20));
        panel_10.add(label_2);

        txtTel = new JTextField();
        txtTel.setFont(new Font("??????", Font.PLAIN, 20));
        txtTel.setColumns(10);
        panel_10.add(txtTel);

        JPanel panel_11 = new JPanel();
        panel_11.setBackground(new Color(255, 255, 204));
        panel_11.setBorder(new EmptyBorder(0, 0, 0, 80));
        panel_5.add(panel_11);
        panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.X_AXIS));

        JLabel label_3 = new JLabel("???????????????");
        label_3.setFont(new Font("??????", Font.PLAIN, 20));
        panel_11.add(label_3);

        JRadioButton radioYes = new JRadioButton("??????");
        radioYes.setFocusPainted(false);
        radioYes.setContentAreaFilled(false);
        radioYes.setFont(new Font("??????", Font.PLAIN, 20));
        panel_11.add(radioYes);

        Component horizontalStrut_3 = Box.createHorizontalStrut(100);
        panel_11.add(horizontalStrut_3);

        JRadioButton radioNo = new JRadioButton("??????");
        radioNo.setFocusPainted(false);
        radioNo.setFont(new Font("??????", Font.PLAIN, 20));
        radioNo.setContentAreaFilled(false);
        panel_11.add(radioNo);

        //??????????????????????????????
        radioYes.setSelected(true);
        ButtonGroup gp = new ButtonGroup();
        gp.add(radioYes);
        gp.add(radioNo);

        JPanel panel_6 = new JPanel();
        panel_6.setBackground(new Color(255, 255, 204));
        panel_1.add(panel_6);
        panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));

        JLabel label_4 = new JLabel("???    ??????");
        label_4.setFont(new Font("??????", Font.PLAIN, 20));
        panel_6.add(label_4);

        txtBZ = new JTextField();
        txtBZ.setFont(new Font("??????", Font.PLAIN, 20));
        txtBZ.setColumns(10);
        panel_6.add(txtBZ);


        Component horizontalStrut = Box.createHorizontalStrut(80);
        panel_6.add(horizontalStrut);


        JPanel panel_12 = new JPanel();
        panel_12.setBackground(new Color(204, 255, 204));
        panel_1.add(panel_12);
        //?????????????????????????????????????????????????????????????????????????????????
        JButton btnSure = new JButton("????????????");
        btnSure.setIcon(new ImageIcon(FrmEmployeeInfor.class.getResource("/images/????????????.png")));
        btnSure.setFocusPainted(false);
        btnSure.setVisible(false);
        btnSure.setBackground(new Color(153, 153, 255));
        btnSure.setFont(new Font("??????", Font.PLAIN, 20));
        panel_12.add(btnSure);


        //???????????????????????????
        txtTel.addKeyListener(new KeyAdapter() {
            int keycode = 0;

            @Override
            public void keyTyped(KeyEvent e) {
                if (keycode >= 48 && keycode <= 57 || keycode == 81) {
                    System.out.println("?????????????????????");
                } else {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //??????keyPressed???????????????????????????
                keycode = e.getKeyCode();
                System.out.println(keycode + "??????");
            }
        });

        btnAdd = new JButton("????????????");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = txtName.getText().trim();//??????
                if (name.length() == 0) {
                    JOptionPane.showMessageDialog(null, "?????????????????????");
                    return;
                }
                System.out.println("??????" + name);
                String zhiWu = comZW.getSelectedItem().toString();//??????
                String tel = txtTel.getText().trim();//??????
                if (tel.length() == 0) {
                    JOptionPane.showMessageDialog(null, "???????????????????????????");
                    return;
                }
                System.out.println("?????????" + tel);
                //String zt=comZhuangTai.getSelectedItem().toString();//??????
                String bz = txtBZ.getText().trim();//??????
                //????????????
                if (name.length() < 2 || name.length() > 18) {
                    JOptionPane.showMessageDialog(null, "???????????????????????????");
                    return;
                }
                if (tel.length() != 11 || !tel.startsWith("1")) {
                    JOptionPane.showMessageDialog(null, "??????????????????????????????");
                    return;
                }

                EmployeeDAO dao = new EmployeeDAO();
                Employee emo = new Employee();
                emo.setPname(name);
                emo.setPlphone(tel);
                java.util.Date aDate = new java.util.Date();//????????????????????????
                long time = aDate.getTime();//??????long??????
                String time2 = time + "";
                time2 = time2.substring(5, 11);//??????????????????4??????
                System.out.println(time2);
                emo.setPpwd(time2);
                emo.setPplace(zhiWu);
                if (radioYes.isSelected()) {
                    emo.setPstatu(true);
                } else if (radioNo.isSelected()) {
                    emo.setPstatu(false);
                }
                emo.setPbz(bz);
                int Id = dao.doCreate(emo);
                System.out.println(Id);
                if (Id > 0) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    //????????????
                    model.setRowCount(0);
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(null, "????????????");
                }
                //??????????????????????????????
                txtName.setText("");
                txtTel.setText("");
                txtBZ.setText("");
                comZW.setSelectedIndex(0);
            }
        });
        btnAdd.setBackground(new Color(204, 255, 255));
        btnAdd.setFocusPainted(false);
        btnAdd.setIcon(new ImageIcon(FrmEmployeeInfor.class.getResource("/images/????????????22.png")));
        btnAdd.setFont(new Font("??????", Font.PLAIN, 20));
        panel_12.add(btnAdd);

        Component horizontalStrut_1 = Box.createHorizontalStrut(40);
        panel_12.add(horizontalStrut_1);

        btnUpdate = new JButton("????????????");
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1???????????????????????????
                int rowIndex = table.getSelectedRow();
                //2?????????????????????
                if (rowIndex == -1) {
                    JOptionPane.showMessageDialog(null, "?????????????????????????????????");
                    return;
                }
                //3???????????????????????????
                //??????????????????,????????????????????????
                String[] row = new String[table.getColumnCount()];
                for (int i = 0; i < table.getColumnCount(); i++) {
                    //??????????????????----?????????????????????
                    //??????????????????----?????????????????????
                    //????????????????????????
                    row[i] = table.getValueAt(rowIndex, i).toString();
                }


                txtName.setText(row[0]);
                comZW.setSelectedItem(row[1]);
                txtTel.setText(row[2]);
                String zt = row[3];
                //comZhuangTai.setSelectedItem(row[3]);
                if ("??????".equals(zt)) {
                    radioYes.setSelected(true);
                } else if ("??????".equals(zt)) {
                    radioNo.setSelected(true);
                }
                txtBZ.setText(row[4]);

                //???????????????????????????????????????
                btnAdd.setVisible(false);
                btnDelete.setVisible(false);
                btnSure.setVisible(true);
                btnSure.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //????????????????????????
                        String uname = txtName.getText().trim();
                        String uZW = comZW.getSelectedItem().toString();//??????
                        String utel = txtTel.getText().trim();
                        //String uZT=comZhuangTai.getSelectedItem().toString();//????????????
                        String uBZ = txtBZ.getText().trim();

                        EmployeeDAO dao = new EmployeeDAO();
                        Employee employee = new Employee();
                        List<Employee> list = dao.selectID(row[0]);//??????????????????????????????????????????????????????????????????????????????????????????
                        for (Employee e1 : list) {
                            int id = e1.getPsid();//???????????????????????????
                            employee.setPsid(id);
                        }
                        employee.setPname(uname);
                        employee.setPplace(uZW);
                        employee.setPlphone(utel);
                        if (radioYes.isSelected()) {
                            employee.setPstatu(true);
                        } else if (radioNo.isSelected()) {
                            employee.setPstatu(true);
                        }
                        employee.setPbz(uBZ);
                        boolean flag = dao.doUpdate(employee);
                        if (flag) {
                            DefaultTableModel model = (DefaultTableModel) table.getModel();
                            //????????????
                            model.setRowCount(0);
                            loadData();

                        } else {
                            JOptionPane.showMessageDialog(null, "????????????");
                        }
                        //??????????????????????????????
                        btnSure.setVisible(false);
                        txtName.setText("");
                        txtTel.setText("");
                        txtBZ.setText("");
                        comZW.setSelectedIndex(0);
                        //?????????????????????????????????
                        btnAdd.setVisible(true);
                        btnDelete.setVisible(true);
                    }
                });
            }
        });

        btnUpdate.setBackground(new Color(204, 255, 255));
        btnUpdate.setFocusPainted(false);
        btnUpdate.setIcon(new ImageIcon(FrmEmployeeInfor.class.getResource("/images/????????????22.png")));
        btnUpdate.setFont(new Font("??????", Font.PLAIN, 20));
        panel_12.add(btnUpdate);

        Component horizontalStrut_2 = Box.createHorizontalStrut(40);
        panel_12.add(horizontalStrut_2);

        btnDelete = new JButton("????????????");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1???????????????????????????
                int rowIndex = table.getSelectedRow();
                if (rowIndex == -1) {
                    JOptionPane.showMessageDialog(null, "???????????????????????????.");
                    return;
                }
                if (rowIndex >= 1) {
                    JOptionPane.showMessageDialog(null, "??????????????????????????????(??????????????????????????????????????????)");
                }
                String[] row = new String[table.getColumnCount()];
                for (int i = 0; i < table.getColumnCount(); i++) {
                    //??????????????????----?????????????????????
                    //??????????????????----?????????????????????
                    //????????????????????????
                    row[i] = table.getValueAt(rowIndex, i).toString();
                }
                //2?????????????????????????????????
                String name = table.getValueAt(rowIndex, 0).toString();
                //3?????????DAO??????????????????,?????????????????????????????????????????????----??????
                Employee employee = new Employee();
                EmployeeDAO dao = new EmployeeDAO();
                Boolean zt = false;
                employee.setPname(row[0]);
                employee.setPstatu(zt);
                boolean flag = dao.doUpdateZt(employee);
                if (flag) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    //????????????
                    model.setRowCount(0);
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(null, "????????????");
                }
            }

        });
        btnDelete.setBackground(new Color(204, 255, 255));
        btnDelete.setFocusPainted(false);
        btnDelete.setIcon(new ImageIcon(FrmEmployeeInfor.class.getResource("/images/??? ?????????22 .png")));
        btnDelete.setFont(new Font("??????", Font.PLAIN, 20));
        panel_12.add(btnDelete);

        JPanel panel_2 = new JPanel();
        panel.add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        panel_2.add(scrollPane, BorderLayout.CENTER);

        table = new JTable() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;//????????????
            }
        };
        table.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "\u5458\u5DE5\u59D3\u540D", "\u804C\u52A1", "\u8054\u7CFB\u7535\u8BDD", "\u5458\u5DE5\u72B6\u6001", "\u5907\u6CE8"
                }
        ));
        {
            //????????????
            table.setRowHeight(30);
            //??????????????????
            JTableHeader hh = table.getTableHeader();
            hh.setBorder(BorderFactory.createLineBorder(new Color(120, 192, 110)));// ??????
            hh.setBackground(new Color(120, 192, 110));// ????????????
            hh.setFont(new Font("??????", Font.BOLD, 19));// ??????
            //hh.setBackground(SystemColor.inactiveCaptionBorder);// ????????????
            hh.setBackground(new Color(255, 255, 240));
            hh.setPreferredSize(new Dimension(hh.getWidth(), (40)));//40 ????????????????????????
            table.setTableHeader(hh);
            //????????????????????????
            DefaultTableCellRenderer render = new DefaultTableCellRenderer();
            render.setHorizontalAlignment(SwingConstants.CENTER);
            table.setDefaultRenderer(Object.class, render);
            table.setFont(new Font("????????????", Font.PLAIN, 19));
        }
        scrollPane.setViewportView(table);

        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel_3.setBackground(new Color(204, 255, 204));
        panel_2.add(panel_3, BorderLayout.NORTH);
        panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));

        Component horizontalStrut_7 = Box.createHorizontalStrut(20);
        panel_3.add(horizontalStrut_7);

        JLabel label_7 = new JLabel("???????????????");
        label_7.setFont(new Font("??????", Font.PLAIN, 20));
        panel_3.add(label_7);

        txtFindName = new JTextField();
        txtFindName.setFont(new Font("??????", Font.PLAIN, 20));
        panel_3.add(txtFindName);
        txtFindName.setColumns(13);

        Component horizontalStrut_4 = Box.createHorizontalStrut(40);
        panel_3.add(horizontalStrut_4);

        JLabel label_6 = new JLabel("?????????");
        label_6.setFont(new Font("??????", Font.PLAIN, 20));
        panel_3.add(label_6);

        comFindZhiWu = new JComboBox();
        comFindZhiWu.setBackground(Color.WHITE);
        comFindZhiWu.setModel(new DefaultComboBoxModel(new String[]{"?????????", "?????????", "??????", "??????", ""}));
        comFindZhiWu.setFont(new Font("??????", Font.PLAIN, 20));
        panel_3.add(comFindZhiWu);

        Component horizontalStrut_5 = Box.createHorizontalStrut(40);
        panel_3.add(horizontalStrut_5);

        JLabel lblNewLabel = new JLabel("???????????????");
        lblNewLabel.setFont(new Font("??????", Font.PLAIN, 20));
        panel_3.add(lblNewLabel);

        txtFindTel = new JTextField();
        txtFindTel.setFont(new Font("??????", Font.PLAIN, 20));
        txtFindTel.setColumns(18);
        panel_3.add(txtFindTel);

        Component horizontalStrut_6 = Box.createHorizontalStrut(40);
        panel_3.add(horizontalStrut_6);

        JButton btnChaXun = new JButton("??????");
        btnChaXun.setIcon(new ImageIcon(FrmEmployeeInfor.class.getResource("/images/??????22.png")));
        btnChaXun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moHu();
            }
        });
        btnChaXun.setFocusPainted(false);
        btnChaXun.setBackground(new Color(135, 206, 250));
        btnChaXun.setFont(new Font("??????", Font.PLAIN, 20));
        panel_3.add(btnChaXun);

        //???????????????????????????
        loadData();
    }

    //????????????
    public void moHu() {
        String names = txtFindName.getText().trim();
        String posts = comFindZhiWu.getSelectedItem().toString();
        String tels = txtFindTel.getText().trim();
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.selectByWord(names, posts, tels);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        if (list == null || list.isEmpty()) {
            return;
        }
        //???????????????????????????
        for (Employee e : list) {
            Object[] row = {
                    e.getPname(),
                    e.getPplace(),
                    e.getPlphone(),
                    e.getPstatu() ? "??????" : "??????",//	   >0??????true
                    e.getPbz()
            };
            model.addRow(row);
        }
    }

    //????????????????????????
    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //????????????
        model.setRowCount(0);
        ///?????????DAO???
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> list = dao.selectAll();//??????????????????????????????????????????????????????????????????????????????????????????
        for (Employee e : list) {
            Object[] row = {
                    e.getPname(),
                    e.getPplace(),
                    e.getPlphone(),
                    e.getPstatu() ? "??????" : "??????",
                    e.getPbz()
            };
            model.addRow(row);
        }
        fitColumn();
    }

    private void fitColumn() {//????????????????????????????????????????????????????????????????????????????????????????????????
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JTableHeader headers = table.getTableHeader();
        int rowCount = table.getRowCount();
        Enumeration columns = table.getColumnModel().getColumns();
        while (columns.hasMoreElements()) {
            TableColumn column = (TableColumn) columns.nextElement();
            int col = headers.getColumnModel().getColumnIndex(column.getIdentifier());
            int width = (int) headers.getDefaultRenderer().getTableCellRendererComponent
                    (table, column.getIdentifier(), false, false, -1, col).getPreferredSize().getWidth();
            for (int row = 0; row < rowCount; row++) {
                int preferedWidth = (int) table.getCellRenderer(row, col).getTableCellRendererComponent
                        (table, table.getValueAt(row, col), false, false, row, col).getPreferredSize().getWidth();
                width = Math.max(width, preferedWidth);
            }
            headers.setResizingColumn(column); // ???????????????
            column.setWidth(width + table.getIntercellSpacing().width);
        }
    }
}
