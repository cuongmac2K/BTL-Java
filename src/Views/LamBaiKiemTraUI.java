/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Cuong
 */
import Controllers.LamBaiKiemTraController;
import Models.CT_SV_BKT;
import Models.CauHoi;
import Models.SinhVien;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class LamBaiKiemTraUI extends javax.swing.JFrame {

    //Connection connection = ConnectToSQLServer.ketNoiCSDL();
    String maBKT;
    String maSV;

    ArrayList<CauHoi> listCauHoi = new ArrayList<>();

    // sinh vien dang lam bai kiem tra
    SinhVien sinhVien = new SinhVien();

    // bai kiem tra dang duoc lam
    CT_SV_BKT chiTietBaiKiemTraDangLam = new CT_SV_BKT();

    // thoi gian lam bai   
    int hanThoiGianLamBai;
    static int interval;
    static Timer timer;
    boolean flag = true;
    
    //size cau hoi
    int sizelistCauHoi;
    
    // danh sach cac dap an cua tung cau
    
    String dapAnHsChon[];
    
    //phan tu thu i trong danh sach cau hoi
    int i = 0;
    
    //so cau tra loi dung cua sinh vien
    int soCauSinhVienLamDung = 0;

    /**
     * Creates new form LamBaiKiemTra
     */
    public LamBaiKiemTraUI() {

        initComponents();
        // A.setText("ok");
        setLocationRelativeTo(null);
        runtime();
        // laydulieulenlist();
        hamtao();

        System.out.println(" size lis cau hoi" + sizelistCauHoi);
    }

    public LamBaiKiemTraUI(String maBKT, String maSV) {
        initComponents();
        // A.setText("ok");
        //setLocationRelativeTo(null);
        this.maBKT = maBKT;
        this.maSV = maSV;

        layThongTinSinhVienDangLamBKT();
        runtime();
        // laydulieulenlist();
        hamtao();

        System.out.println(" size lis cau hoi" + sizelistCauHoi);
    }

    void layDanhSachCauHoi() {
        listCauHoi =  LamBaiKiemTraController.layDanhSachCauHoi(maBKT);
    }

    void hamtao() {

        // lay cau hoi trong sql
        layDanhSachCauHoi();
        
        hienCauHoi();
        sizelistCauHoi = listCauHoi.size();
        dapAnHsChon = new String[sizelistCauHoi + 1];
    }

    public void runtime() {
        int delay = 1000;
        int period = 1000;
        timer = new Timer();

        interval = hanThoiGianLamBai * 60;
        System.out.println(interval);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());
                phut.setText(String.valueOf(interval / 60));
                giay.setText(String.valueOf(interval % 60));
                if (interval == 0) {
                    flag = false;
                }
                check();
            }
        }, delay, period);
    }

    private final int setInterval() {
        if (interval == 1) {
            timer.cancel();
        }
        return --interval;
    }

    public void check() {
        if (flag == false) {
            JOptionPane.showMessageDialog(rootPane, " het gio");
            nopbai();
        }
    }

    // sau lay dap an luu vao dapAnHs[]
    void layDapAn() {
        if(buttonGroup1.getSelection().getActionCommand() == null)
        {
            dapAnHsChon[i] = "0";
            System.out.println("Khong chon dap an");
            return;
        }
        dapAnHsChon[i] = buttonGroup1.getSelection().getActionCommand();

        System.out.println(" dap an la " + dapAnHsChon[i]);
    }

    void deleteRadioButon() {
        buttonGroup1.clearSelection();

    }

    void hienCauHoi() {
        CauHoi e = listCauHoi.get(i);
        ndCauHoi.setText(e.getNoiDung());
        A.setText("A. " + e.getA());
        B.setText("B. " + e.getB());
        C.setText("C. " + e.getC());
        D.setText("D. " + e.getD());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tenBaiKiemTra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soCau = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        ndCauHoi = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();
        jButton_Next = new javax.swing.JButton();
        jButton_NopBai = new javax.swing.JButton();
        phut = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        giay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("B??i Ki???m Tra");

        tenBaiKiemTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenBaiKiemTra.setText("thu 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Th???i gian c??n l???i");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("C??u :");

        soCau.setText("1");

        buttonGroup1.add(A);
        A.setActionCommand("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        buttonGroup1.add(B);
        B.setActionCommand("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });

        buttonGroup1.add(C);
        C.setActionCommand("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        buttonGroup1.add(D);
        D.setActionCommand("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });

        ndCauHoi.setText("noi dung cau hoi");

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jButton_Next.setText("Next");
        jButton_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NextActionPerformed(evt);
            }
        });

        jButton_NopBai.setText("N???p B??i");
        jButton_NopBai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NopBaiActionPerformed(evt);
            }
        });

        phut.setForeground(new java.awt.Color(255, 0, 0));
        phut.setText("phut");

        jLabel9.setText(":");

        giay.setText("giay");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soCau, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ndCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(tenBaiKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Back)
                                .addGap(71, 71, 71)
                                .addComponent(jButton_Next)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_NopBai))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(giay, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                            .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tenBaiKiemTra)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(giay, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phut, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(soCau)
                    .addComponent(ndCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(A)
                .addGap(18, 18, 18)
                .addComponent(B)
                .addGap(18, 18, 18)
                .addComponent(C)
                .addGap(22, 22, 22)
                .addComponent(D)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Back)
                    .addComponent(jButton_Next)
                    .addComponent(jButton_NopBai))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
        layDapAn();
    }//GEN-LAST:event_AMouseClicked

    private void jButton_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NextActionPerformed

        if (i < sizelistCauHoi - 1) {
            i++;
            System.out.println("i da duoc +");
            deleteRadioButon();
            hienSoCau();
            hienCauHoi();
            hiendapAnDaChon();
        } else {
            System.out.println("i k duoc +");
        }

    }//GEN-LAST:event_jButton_NextActionPerformed
    void hienSoCau() {
        soCau.setText(String.valueOf(i + 1));
    }

    void hiendapAnDaChon() {
        int l = dapAnHsChon.length;
        if (l != 0) {
            if ("A".equals(dapAnHsChon[i])) {
                A.setSelected(true);
            } else {
                if ("B".equals(dapAnHsChon[i])) {
                    B.setSelected(true);
                } else {
                    if ("C".equals(dapAnHsChon[i])) {
                        C.setSelected(true);
                    } else {
                        if ("D".equals(dapAnHsChon[i])) {
                            D.setSelected(true);
                        }
                    }
                }
            }
        } else {
            System.out.println("cau nay chua dc chon");
        }
    }

//    boolean checkRong() {
//        if (buttonGroup1.getSelection() == null) {
//            JOptionPane.showMessageDialog(rootPane, "chon dap an xong moi dc chuyen cau");
//            return false;
//        } else {
//            return true;
//        }
//    }
    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed

        if (i >= 1) {
            i--;
            deleteRadioButon();
            hienCauHoi();
            hienSoCau();
            hiendapAnDaChon();
            System.out.println("i da --");
        } else {
            System.out.println("i k dc --");
        }
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

    }//GEN-LAST:event_AActionPerformed

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        layDapAn();
    }//GEN-LAST:event_BMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        layDapAn();
    }//GEN-LAST:event_CMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        layDapAn();
    }//GEN-LAST:event_DMouseClicked



    int tinhThoiGianLam() {
        int result = (hanThoiGianLamBai * 60 - interval)/60 + 1;
        if(result > hanThoiGianLamBai)
        {
            result = hanThoiGianLamBai;
        }

        return result;
    }
    private void jButton_NopBaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NopBaiActionPerformed
        nopbai();
    }//GEN-LAST:event_jButton_NopBaiActionPerformed
    void nopbai() {
        int n = 0;
        int sizeDA = dapAnHsChon.length;
        System.out.println("cac dap an da chon la :");

        while (dapAnHsChon[n] != null) {
            String dapan = listCauHoi.get(n).getDapAn();
            if (dapAnHsChon[n].equals(dapan)) {
                soCauSinhVienLamDung++;
            }
            if (n < (sizeDA)) {
                n++;
            } else {
                break;
            }

            System.out.println(n + " lan lap ");
        }

        System.out.println("count la " + soCauSinhVienLamDung);
        double diem = (double) soCauSinhVienLamDung * (10 / (double) sizelistCauHoi);
        int soCauSVLamDc = (int) soCauSinhVienLamDung;
        
        String trangThai = "Ho??n th??nh";
        int thoiGianLam = tinhThoiGianLam();
        System.out.println(tinhThoiGianLam());
        
        
        if (LamBaiKiemTraController.luuKetQua(maSV, maBKT, diem, soCauSVLamDc, thoiGianLam, trangThai)) {
            timer.cancel();
            JOptionPane.showMessageDialog(rootPane, " ban da hoan thanh bai kiem tra");
            new MainSinhVien(sinhVien.getTaiKhoan().getTenDangNhap()).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "them that bai");
        }

    }

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
            java.util.logging.Logger.getLogger(LamBaiKiemTraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LamBaiKiemTraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LamBaiKiemTraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LamBaiKiemTraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LamBaiKiemTraUI("11", "SV1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel giay;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jButton_Next;
    private javax.swing.JButton jButton_NopBai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel ndCauHoi;
    private javax.swing.JLabel phut;
    private javax.swing.JLabel soCau;
    private javax.swing.JLabel tenBaiKiemTra;
    // End of variables declaration//GEN-END:variables

    private void layThongTinSinhVienDangLamBKT() {

        sinhVien = LamBaiKiemTraController.layThongTinSinhVien(maSV);
        
        chiTietBaiKiemTraDangLam = LamBaiKiemTraController.layThongTinBaiKiemTra(maSV, maBKT);
        
        hanThoiGianLamBai = chiTietBaiKiemTraDangLam.getBaiKiemTra().getThoiGianLam();
    }
}
