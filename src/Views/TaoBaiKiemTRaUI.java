/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.CacControllerKhac;
import Controllers.TaoBaiKiemTraController;
import Models.CauHoi;
import Models.Lop;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class TaoBaiKiemTRaUI extends javax.swing.JFrame {

    //Connection connection = ConnectToSQLServer.ketNoiCSDL();
    ArrayList<Lop> danhSachLop = new ArrayList<>();
    static ArrayList<CauHoi> danhSachCauHoi = new ArrayList<>();

    /**
     * Creates new form GDTaoDe
     */
    public TaoBaiKiemTRaUI() {
        initComponents();
        layDanhSachLop_JCombox();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup_DoKhoBaiKiemTra = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        cboSoCau = new javax.swing.JComboBox<>();
        rdDe80 = new javax.swing.JRadioButton();
        rdDe70 = new javax.swing.JRadioButton();
        rdDe50 = new javax.swing.JRadioButton();
        txtHan = new javax.swing.JTextField();
        btnTao = new javax.swing.JButton();
        btnQLBKT = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_ChonLop = new javax.swing.JComboBox<>();
        jSpinner_ThoiGianLam = new javax.swing.JSpinner();
        jButton_TroLai = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TẠO BÀI KIỂM TRA");

        jLabel2.setText("Mã đề :");

        jLabel3.setText("Tên đề :");

        jLabel4.setText("Độ khó :");

        jLabel5.setText("Thời gian làm :");

        jLabel6.setText("Số câu :");

        jLabel7.setText("Hạn nộp :");

        cboSoCau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));

        buttonGroup_DoKhoBaiKiemTra.add(rdDe80);
        rdDe80.setText("80% Dễ");
        rdDe80.setActionCommand("80");

        buttonGroup_DoKhoBaiKiemTra.add(rdDe70);
        rdDe70.setText("70% Dễ");
        rdDe70.setActionCommand("70");

        buttonGroup_DoKhoBaiKiemTra.add(rdDe50);
        rdDe50.setText("50% Dễ");
        rdDe50.setActionCommand("50");

        txtHan.setForeground(new java.awt.Color(204, 204, 204));
        txtHan.setText("Năm-Tháng-Ngày Giờ:Phút");
        txtHan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHanFocusLost(evt);
            }
        });

        btnTao.setText("Tạo");
        btnTao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoMouseClicked(evt);
            }
        });

        btnQLBKT.setText("Quản lí câu hỏi");
        btnQLBKT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLBKTMouseClicked(evt);
            }
        });

        jLabel9.setText("Câu hỏi:");

        jLabel8.setText("Lớp:");

        jComboBox_ChonLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSpinner_ThoiGianLam.setModel(new javax.swing.SpinnerNumberModel(45, 1, 90, 1));

        jButton_TroLai.setText("Trở lại");
        jButton_TroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TroLaiActionPerformed(evt);
            }
        });

        jLabel10.setText("phút");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jButton_TroLai))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinner_ThoiGianLam, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboSoCau, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdDe80, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(rdDe70, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(rdDe50, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                .addComponent(txtMa))))
                    .addComponent(jComboBox_ChonLop, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLBKT)
                    .addComponent(txtHan, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboSoCau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner_ThoiGianLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdDe80)
                    .addComponent(rdDe70)
                    .addComponent(rdDe50))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLBKT)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox_ChonLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTao)
                    .addComponent(jButton_TroLai))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLBKTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLBKTMouseClicked
        try {
            int doKho = Integer.parseInt(buttonGroup_DoKhoBaiKiemTra.getSelection().getActionCommand());
            int soCau = Integer.parseInt(cboSoCau.getSelectedItem().toString());
            new QuanLyCauHoiUI(soCau, doKho).setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn độ khó cho bài kiểm tra");
        }
    }//GEN-LAST:event_btnQLBKTMouseClicked

    private void btnTaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoMouseClicked
        if (txtMa.getText().equals("") || txtTen.getText().equals("") || txtHan.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn chưa điền đầy đủ thông tin", "LỖI", JOptionPane.ERROR_MESSAGE);
        } else {
            if (danhSachCauHoi.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Bạn chưa tạo câu hỏi cho bài kiểm tra");
                return;
            }
            try {
                String maBKT = txtMa.getText();
                String tenBKT = txtTen.getText();
                int thoiGianLam = Integer.parseInt(jSpinner_ThoiGianLam.getValue().toString());
                String hanNop = txtHan.getText();
                String doKho = "Dễ " + buttonGroup_DoKhoBaiKiemTra.getSelection().getActionCommand();
                int tongSoCau = Integer.parseInt(cboSoCau.getSelectedItem().toString());
                String maLop = jComboBox_ChonLop.getSelectedItem().toString();

                boolean check = TaoBaiKiemTraController.taoBaiKiemTra(maBKT, tenBKT, doKho, thoiGianLam, hanNop, tongSoCau, maLop);

                if (check) {
                    Iterator<CauHoi> it = danhSachCauHoi.iterator();
                    while (it.hasNext()) {
                        CauHoi cauHoi = it.next();
                        TaoBaiKiemTraController.taoCauHoiChoBaiKiemTra(maBKT, cauHoi);
                    }
                    TaoBaiKiemTraController.taoBaiKiemTra_Lop(maBKT, maLop);
                    JOptionPane.showMessageDialog(null, "Tạo bài kiểm tra mới thành công");

                    new MainMenuGiangVien(MainMenuGiangVien.giangVien.getTaiKhoan().getTenDangNhap()).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Bạn hãy kiểm tra lại thời hạn nộp bài hoặc mã bài kiểm tra");
                }
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Bạn hãy kiểm tra lại thời hạn nộp bài hoặc mã bài kiểm tra", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btnTaoMouseClicked

    private void jButton_TroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TroLaiActionPerformed
        // TODO add your handling code here:
        new MainMenuGiangVien(MainMenuGiangVien.giangVien.getTaiKhoan().getTenDangNhap()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_TroLaiActionPerformed

    private void txtHanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHanFocusGained
        // TODO add your handling code here:
        if (txtHan.getText().equals("Năm-Tháng-Ngày Giờ:Phút")) {
            txtHan.setText("");
            txtHan.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtHanFocusGained

    private void txtHanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHanFocusLost
        // TODO add your handling code here:
        if (txtHan.getText().equals("")) {
            txtHan.setText("Năm-Tháng-Ngày Giờ:Phút");
            txtHan.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtHanFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TaoBaiKiemTRaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoBaiKiemTRaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoBaiKiemTRaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoBaiKiemTRaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoBaiKiemTRaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLBKT;
    private javax.swing.JButton btnTao;
    private javax.swing.ButtonGroup buttonGroup_DoKhoBaiKiemTra;
    private javax.swing.JComboBox<String> cboSoCau;
    private javax.swing.JButton jButton_TroLai;
    private javax.swing.JComboBox<String> jComboBox_ChonLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_ThoiGianLam;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdDe50;
    private javax.swing.JRadioButton rdDe70;
    private javax.swing.JRadioButton rdDe80;
    private javax.swing.JTextField txtHan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void layDanhSachLop_JCombox() {
        ArrayList<String> danhSachMaLop = CacControllerKhac.layDanhSachMaLop(MainMenuGiangVien.giangVien.getMaGV());

        jComboBox_ChonLop.setModel(new DefaultComboBoxModel(danhSachMaLop.toArray()));
    }
}