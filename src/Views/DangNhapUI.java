
package Views;

import Controllers.CacControllerKhac;
import Controllers.DangKyController;
import Controllers.DangNhapController;
import Models.Lop;
import Models.SinhVien;
import Models.TaiKhoan;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

public class DangNhapUI extends javax.swing.JFrame {
    ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();
    ArrayList<Lop> danhSachLop = new ArrayList<>();
    ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    
    int count = 0;
    static String sql;
    
    Border borderError = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 0, 0));
    Border border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(204, 204, 204));

    public DangNhapUI() {
        initComponents();
        jPanel_Logo.setVisible(true);
        jPanel_DangKy.setVisible(false);
        jPanel_DangNhap.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TieuDe = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel_DangNhap = new javax.swing.JLabel();
        jLabel_DangKy = new javax.swing.JLabel();
        jPanel_DangNhap = new javax.swing.JPanel();
        jLabel_DangNhap_Username = new javax.swing.JLabel();
        jLabel_DangNhap_Password = new javax.swing.JLabel();
        jLabel_DangNhap_LoaiTaiKhoan = new javax.swing.JLabel();
        jButton_DangNhap = new javax.swing.JButton();
        jTextField_DangNhap_TenDangNhap = new javax.swing.JTextField();
        jComboBox_DangNhap_LoaiTaiKhoan = new javax.swing.JComboBox<>();
        jTextField_DangNhap_MatKhau = new javax.swing.JPasswordField();
        jPanel_DangKy = new javax.swing.JPanel();
        jLabel_DangKy_Username = new javax.swing.JLabel();
        jLabel_DangKy_StudentCode = new javax.swing.JLabel();
        jLabel_StudentName = new javax.swing.JLabel();
        jLabel_DangKy_Password = new javax.swing.JLabel();
        jLabel_DangKy_ConfirmPassword = new javax.swing.JLabel();
        jLabel_DangKy_ClassCode = new javax.swing.JLabel();
        jButton_DangKy = new javax.swing.JButton();
        jTextField_DangKy_TenDangNhap = new javax.swing.JTextField();
        jTextField_DangKy_MaSinhVien = new javax.swing.JTextField();
        jTextField_DangKy_TenSinhVien = new javax.swing.JTextField();
        jTextField_DangKy_MatKhau = new javax.swing.JTextField();
        jTextField_DangKy_XacNhanMatKhau = new javax.swing.JTextField();
        jComboBox_ChonLop = new javax.swing.JComboBox<>();
        jPanel_Logo = new javax.swing.JPanel();
        jLabel_BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel_TieuDe.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TieuDe.setText("PHẦN MỀM TRẮC NGIỆM");
        jLabel_TieuDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);

        jLabel_DangNhap.setBackground(new java.awt.Color(42, 187, 155));
        jLabel_DangNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DangNhap.setText("Đăng nhập");
        jLabel_DangNhap.setOpaque(true);
        jLabel_DangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DangNhapMouseClicked(evt);
            }
        });

        jLabel_DangKy.setBackground(new java.awt.Color(42, 187, 155));
        jLabel_DangKy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DangKy.setText("Đăng ký");
        jLabel_DangKy.setOpaque(true);
        jLabel_DangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_DangKyMouseClicked(evt);
            }
        });

        jPanel_DangNhap.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_DangNhap_Username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangNhap_Username.setText("Tài khoản:");

        jLabel_DangNhap_Password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangNhap_Password.setText("Mật khẩu:");

        jLabel_DangNhap_LoaiTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangNhap_LoaiTaiKhoan.setText("Loại tài khoản:");

        jButton_DangNhap.setBackground(new java.awt.Color(255, 204, 102));
        jButton_DangNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_DangNhap.setText("Đăng nhập");
        jButton_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangNhapActionPerformed(evt);
            }
        });

        jTextField_DangNhap_TenDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jComboBox_DangNhap_LoaiTaiKhoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox_DangNhap_LoaiTaiKhoan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giảng viên", "Sinh viên" }));

        jTextField_DangNhap_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_DangNhap_MatKhau.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel_DangNhapLayout = new javax.swing.GroupLayout(jPanel_DangNhap);
        jPanel_DangNhap.setLayout(jPanel_DangNhapLayout);
        jPanel_DangNhapLayout.setHorizontalGroup(
            jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                                .addComponent(jLabel_DangNhap_LoaiTaiKhoan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_DangNhap_LoaiTaiKhoan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_DangNhap_Username)
                                    .addComponent(jLabel_DangNhap_Password))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_DangNhap_TenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(jTextField_DangNhap_MatKhau)))))
                    .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton_DangNhap)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel_DangNhapLayout.setVerticalGroup(
            jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangNhap_Username)
                    .addComponent(jTextField_DangNhap_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_DangNhap_Password)
                            .addComponent(jTextField_DangNhap_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel_DangNhap_LoaiTaiKhoan))
                    .addGroup(jPanel_DangNhapLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jComboBox_DangNhap_LoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton_DangNhap)
                .addGap(36, 36, 36))
        );

        jPanel_DangKy.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_DangKy_Username.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangKy_Username.setText("Tên đăng nhập:");

        jLabel_DangKy_StudentCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangKy_StudentCode.setText("Mã sinh viên:");

        jLabel_StudentName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_StudentName.setText("Tên sinh viên:");

        jLabel_DangKy_Password.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangKy_Password.setText("Mật khẩu:");

        jLabel_DangKy_ConfirmPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangKy_ConfirmPassword.setText("Xác nhận mật khẩu:");

        jLabel_DangKy_ClassCode.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel_DangKy_ClassCode.setText("Mã lớp:");

        jButton_DangKy.setBackground(new java.awt.Color(255, 204, 102));
        jButton_DangKy.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton_DangKy.setText("Đăng ký");
        jButton_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangKyActionPerformed(evt);
            }
        });

        jTextField_DangKy_TenDangNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_DangKy_MaSinhVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_DangKy_TenSinhVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_DangKy_MatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jTextField_DangKy_XacNhanMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jComboBox_ChonLop.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox_ChonLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel_DangKyLayout = new javax.swing.GroupLayout(jPanel_DangKy);
        jPanel_DangKy.setLayout(jPanel_DangKyLayout);
        jPanel_DangKyLayout.setHorizontalGroup(
            jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DangKy_ConfirmPassword)
                            .addComponent(jLabel_DangKy_ClassCode)
                            .addComponent(jLabel_DangKy_Username)
                            .addComponent(jLabel_DangKy_StudentCode)
                            .addComponent(jLabel_StudentName)
                            .addComponent(jLabel_DangKy_Password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_DangKy_MatKhau)
                            .addComponent(jTextField_DangKy_XacNhanMatKhau)
                            .addComponent(jComboBox_ChonLop, 0, 185, Short.MAX_VALUE)
                            .addComponent(jTextField_DangKy_MaSinhVien)
                            .addComponent(jTextField_DangKy_TenSinhVien)
                            .addComponent(jTextField_DangKy_TenDangNhap)))
                    .addGroup(jPanel_DangKyLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel_DangKyLayout.setVerticalGroup(
            jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_DangKyLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangKy_Username)
                    .addComponent(jTextField_DangKy_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangKy_StudentCode)
                    .addComponent(jTextField_DangKy_MaSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_StudentName)
                    .addComponent(jTextField_DangKy_TenSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangKy_Password)
                    .addComponent(jTextField_DangKy_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangKy_ConfirmPassword)
                    .addComponent(jTextField_DangKy_XacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel_DangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_DangKy_ClassCode)
                    .addComponent(jComboBox_ChonLop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Logo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_BackgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/HaUI.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_LogoLayout = new javax.swing.GroupLayout(jPanel_Logo);
        jPanel_Logo.setLayout(jPanel_LogoLayout);
        jPanel_LogoLayout.setHorizontalGroup(
            jPanel_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_BackgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel_LogoLayout.setVerticalGroup(
            jPanel_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_BackgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(jLabel_DangNhap, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel_DangKy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel_DangNhap, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel_DangKy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel_Logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLabel_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_DangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_DangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_DangKy, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jLabel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addComponent(jPanel_DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 65, Short.MAX_VALUE)
                    .addComponent(jPanel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_DangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangNhapMouseClicked
        // TODO add your handling code here:
        jLabel_DangNhap.setBackground(Color.white);
        jLabel_DangNhap.setForeground(Color.black);
        
        jLabel_DangKy.setBackground(new Color(42, 187, 155));
        jLabel_DangKy.setForeground(Color.white);
        
        jTextField_DangNhap_TenDangNhap.setBorder(border);
        jTextField_DangNhap_MatKhau.setBorder(border);
        jTextField_DangNhap_TenDangNhap.setText("");
        jTextField_DangNhap_MatKhau.setText("");
        
        jPanel_Logo.setVisible(false);
        jPanel_DangKy.setVisible(false);
        jPanel_DangNhap.setVisible(true);
        
    }//GEN-LAST:event_jLabel_DangNhapMouseClicked

    private void jLabel_DangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_DangKyMouseClicked
        // TODO add your handling code here:
        jLabel_DangKy.setBackground(Color.white);
        jLabel_DangKy.setForeground(Color.black);
        
        jLabel_DangNhap.setBackground(new Color(42, 187, 155));
        jLabel_DangNhap.setForeground(Color.white);
        
        jTextField_DangKy_TenDangNhap.setBorder(border);
        jTextField_DangKy_MaSinhVien.setBorder(border);
        jTextField_DangKy_TenSinhVien.setBorder(border);
        jTextField_DangKy_MatKhau.setBorder(border);
        jTextField_DangKy_XacNhanMatKhau.setBorder(border);
        
        
        jTextField_DangKy_TenDangNhap.setText("");
        jTextField_DangKy_MaSinhVien.setText("");
        jTextField_DangKy_XacNhanMatKhau.setText("");
        jTextField_DangKy_MaSinhVien.setText("");
        jTextField_DangKy_TenSinhVien.setText("");
        
        hienThi_DanhSachLop_JCombox();
        
        jPanel_Logo.setVisible(false);
        jPanel_DangNhap.setVisible(false);
        jPanel_DangKy.setVisible(true);
    }//GEN-LAST:event_jLabel_DangKyMouseClicked

    private void jButton_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangNhapActionPerformed
        StringBuilder sb = new StringBuilder();
        String tenDN = new String(jTextField_DangNhap_TenDangNhap.getText());
        String matKhau = new String(jTextField_DangNhap_MatKhau.getPassword());
        String loaiTK = jComboBox_DangNhap_LoaiTaiKhoan.getSelectedItem().toString();

        try{
            if(count > 2){
                JOptionPane.showMessageDialog(this, "\nNhập sai tối đa 3 lần\n");
            }
            else{
                if(tenDN.equals("")){
                    sb.append("\nTên tài khoản không hợp lệ\n");
                    jTextField_DangNhap_TenDangNhap.setBorder(borderError);
                }
                else{
                    jTextField_DangNhap_TenDangNhap.setBorder(border);
                }

                if(matKhau.equals("")){
                    sb.append("\nMật khẩu không hợp lệ\n");
                    jTextField_DangNhap_MatKhau.setBorder(borderError);
                }
                else{
                    jTextField_DangNhap_MatKhau.setBorder(border);
                }

                if(sb.length() > 0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                    return;
                }
                else{
                    if(loaiTK.equals("Giảng viên")){
                        
                        danhSachTaiKhoan = DangNhapController.layBangTaiKhoan(tenDN, matKhau, "Giảng viên");
                    }
                    else{
                        
                        danhSachTaiKhoan = DangNhapController.layBangTaiKhoan(tenDN, matKhau, "Sinh viên");
                    }
                } 

                if(danhSachTaiKhoan.isEmpty()){
                    count++;
                    JOptionPane.showMessageDialog(this, "\nTài khoản, mật khẩu hoặc loại tài khoản không đúng\n");
                }               
                else{
                    if(loaiTK.equals("Giảng viên")){
                        new MainMenuGiangVien(tenDN).setVisible(true);
                        this.setVisible(false);
                    }
                    else
                    {
                       new MainSinhVien(tenDN).setVisible(true);
                       this.setVisible(false);
                    }
                }
            }  
        } 
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "\nĐăng nhập thất bại\n" + "Lỗi: " + ex.toString());
        }
    }//GEN-LAST:event_jButton_DangNhapActionPerformed

    private void jButton_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangKyActionPerformed
        StringBuilder sb = new StringBuilder();
        String tenDN = new String(jTextField_DangKy_TenDangNhap.getText());
        String maSV = new String(jTextField_DangKy_MaSinhVien.getText());
        String tenSV = new String(jTextField_DangKy_TenSinhVien.getText());
        String matKhau = new String(jTextField_DangKy_MatKhau.getText());
        String xacThuc = new String(jTextField_DangKy_XacNhanMatKhau.getText());
        String maLop = new String(jComboBox_ChonLop.getSelectedItem().toString());

        try{
            if(tenDN.equals("")){
                sb.append("\nTên tài khoản không hợp lệ\n");
                jTextField_DangKy_TenDangNhap.setBorder(borderError);
            }
            else{
                jTextField_DangKy_TenDangNhap.setBorder(border);
            }

            if(matKhau.equals("")){
                sb.append("\nMật khẩu không hợp lệ\n");
                jTextField_DangKy_MaSinhVien.setBorder(borderError);
            }
            else{
                jTextField_DangKy_MaSinhVien.setBorder(border);
            }

            if(!xacThuc.equals(matKhau)){
                sb.append("\nMật khẩu xác thực không trùng khớp\n");
                jTextField_DangKy_XacNhanMatKhau.setBorder(borderError);
            }
            else{
                jTextField_DangKy_XacNhanMatKhau.setBorder(border);  
            }

            if(sb.length() > 0){
                JOptionPane.showMessageDialog(this, sb.toString());
            }
            else{
                if(kiemTraTaiKhoanDaTonTai(tenDN))
                {
                    jTextField_DangKy_TenDangNhap.setBorder(borderError);
                    JOptionPane.showMessageDialog(this, "\nTên tài khoản đã tồn tại\n");
                } 
                else if(kiemTraSinhVienDaTonTai(maSV))
                {
                    jTextField_DangKy_MaSinhVien.setBorder(borderError);
                    JOptionPane.showMessageDialog(this, "\nSinh viên này đã có tài khoản\n");
                }
                else
                {
                    if(DangKyController.themSinhVien(tenDN, maSV, tenSV, maLop, matKhau)){
                        JOptionPane.showMessageDialog(this, "\nĐăng ký hoàn tất\n");
                        jTextField_DangKy_TenDangNhap.setText("");
                        jTextField_DangKy_MaSinhVien.setText("");
                        jTextField_DangKy_MatKhau.setText("");
                        jTextField_DangKy_XacNhanMatKhau.setText("");
                        jTextField_DangKy_TenSinhVien.setText("");
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "\nĐăng ký thất bại\n");
                    }
                }
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "\nĐăng ký thất bại\n" + "Lỗi: " + ex.toString());
        }
    }//GEN-LAST:event_jButton_DangKyActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangKy;
    private javax.swing.JButton jButton_DangNhap;
    private javax.swing.JComboBox<String> jComboBox_ChonLop;
    private javax.swing.JComboBox<String> jComboBox_DangNhap_LoaiTaiKhoan;
    private javax.swing.JLabel jLabel_BackgroundImage;
    private javax.swing.JLabel jLabel_DangKy;
    private javax.swing.JLabel jLabel_DangKy_ClassCode;
    private javax.swing.JLabel jLabel_DangKy_ConfirmPassword;
    private javax.swing.JLabel jLabel_DangKy_Password;
    private javax.swing.JLabel jLabel_DangKy_StudentCode;
    private javax.swing.JLabel jLabel_DangKy_Username;
    private javax.swing.JLabel jLabel_DangNhap;
    private javax.swing.JLabel jLabel_DangNhap_LoaiTaiKhoan;
    private javax.swing.JLabel jLabel_DangNhap_Password;
    private javax.swing.JLabel jLabel_DangNhap_Username;
    private javax.swing.JLabel jLabel_StudentName;
    private javax.swing.JLabel jLabel_TieuDe;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel_DangKy;
    private javax.swing.JPanel jPanel_DangNhap;
    private javax.swing.JPanel jPanel_Logo;
    private javax.swing.JTextField jTextField_DangKy_MaSinhVien;
    private javax.swing.JTextField jTextField_DangKy_MatKhau;
    private javax.swing.JTextField jTextField_DangKy_TenDangNhap;
    private javax.swing.JTextField jTextField_DangKy_TenSinhVien;
    private javax.swing.JTextField jTextField_DangKy_XacNhanMatKhau;
    private javax.swing.JPasswordField jTextField_DangNhap_MatKhau;
    private javax.swing.JTextField jTextField_DangNhap_TenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void hienThi_DanhSachLop_JCombox() {
        ArrayList<String> danhSachMaLop = CacControllerKhac.layDanhSachMaLop_FULL();

        jComboBox_ChonLop.setModel(new DefaultComboBoxModel(danhSachMaLop.toArray()));
    }

    private boolean kiemTraTaiKhoanDaTonTai(String tenDN) {
        return CacControllerKhac.kiemTraTaiKhoanDaTonTai(tenDN);
    }

    private boolean kiemTraSinhVienDaTonTai(String maSV) {
        return CacControllerKhac.kiemTraSinhVienDaTonTai(maSV);
    }
}
