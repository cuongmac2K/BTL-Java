/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CT_SV_BKT;
import Models.GiangVien;
import Models.Lop;
import Models.SinhVien;
import Models.TaiKhoan;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jonan
 */
public class CacControllerKhac {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static SinhVien layThongTinSinhVien(String tenDangNhap) {
        String sql = "SELECT * FROM SINHVIEN "
                + "INNER JOIN LOP ON SINHVIEN.MaLop = LOP.MaLop "
                + "WHERE TenDangNhap='" + tenDangNhap + "'";
        ArrayList<SinhVien> danhSachSinhVien = ConnectToSQLServer.layData_BangSinhVien(sql);

        return danhSachSinhVien.get(0);
    }

    public static boolean kiemTraTaiKhoanDaTonTai(String tenDN) {
        String sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap='" + tenDN + "'";
        ArrayList<TaiKhoan> danhSachTaiKhoan = ConnectToSQLServer.layData_BangTaiKhoan(sql);

        return !danhSachTaiKhoan.isEmpty();
    }

    public static boolean kiemTraSinhVienDaTonTai(String maSV) {
        String sql = "SELECT * FROM SINHVIEN "
                + "INNER JOIN LOP ON SINHVIEN.MaLop = LOP.MaLop "
                + "WHERE MaSV='" + maSV + "'";
        ArrayList<SinhVien> danhSachSinhVien = ConnectToSQLServer.layData_BangSinhVien(sql);

        return !danhSachSinhVien.isEmpty();
    }

    public static ArrayList<CT_SV_BKT> layDanhSachBaiKiemTra_Lop(String maSV, String maLop) {
        String sql = "SELECT * FROM dbo.[CT_SV_BKT] INNER JOIN dbo.[SINHVIEN] ON CT_SV_BKT.MaSV = SINHVIEN.MaSV  "
                + "INNER JOIN dbo.[BAIKIEMTRA] ON CT_SV_BKT.MaBKT = BAIKIEMTRA.MaBKT "
                + "WHERE BAIKIEMTRA.MaLop='" + maLop + "' AND SinhVien.MaSV = '" + maSV + "'";
        return ConnectToSQLServer.layData_BangCT_SV_BKT(sql);
    }

    public static GiangVien layThongTinGiangVien(String tenDN) {
        String sql = "SELECT * FROM GIANGVIEN INNER JOIN TAIKHOAN ON GIANGVIEN.TenDangNhap = TAIKHOAN.TenDangNhap "
                + "WHERE GIANGVIEN.TenDangNhap = '" + tenDN + "'";
        ArrayList<GiangVien> temp = ConnectToSQLServer.layData_BangGiangVien(sql);

        return temp.get(0);
    }

    //Cap nhat so luong sinh vien ma giang vien dang dang nhap tren he thong
    public static void capNhatSoLuongSinhVien(String maGV) {
        String query = "SELECT * FROM LOP INNER JOIN GIANGVIEN ON LOP.MaGV = GIANGVIEN.MaGV "
                + "WHERE GIANGVIEN.MaGV = '" + maGV + "'";
        ArrayList<Lop> danhSachLop = ConnectToSQLServer.layData_BangLop(query);

        Iterator<Lop> it = danhSachLop.iterator();
        while (it.hasNext()) {
            Lop temp = it.next();
            String sql = "UPDATE LOP "
                    + "SET LOP.SoSV = (SELECT COUNT(*) FROM LOP INNER JOIN SINHVIEN ON LOP.MaLop = SINHVIEN.MaLop WHERE SINHVIEN.MaLop = '" + temp.getMaLop() + "')"
                    + "WHERE LOP.MaLop  = '" + temp.getMaLop() + "'";
            ConnectToSQLServer.thucHienLenhSQL(sql);
        }
    }

    public static ArrayList<String> layDanhSachMaLop(String maGV) {
        String sql = "SELECT * FROM LOP INNER JOIN GIANGVIEN ON Lop.MaGV = GIANGVIEN.MaGV "
                + "WHERE GIANGVIEN.MaGV = '" + maGV + "'";
        ArrayList<Lop> danhSachLop = ConnectToSQLServer.layData_BangLop(sql);
        
        ArrayList<String> danhSachMaLop = new ArrayList<>();
        Iterator<Lop> it = danhSachLop.iterator();
        while (it.hasNext()) {
            danhSachMaLop.add(it.next().getMaLop());
        }
        
        return danhSachMaLop;
    }

    public static ArrayList<String> layDanhSachMaLop_FULL() {
        String sql = "SELECT * FROM Lop INNER JOIN GIANGVIEN ON Lop.MaGV = GIANGVIEN.MaGV";
        ArrayList<Lop> danhSachLop = ConnectToSQLServer.layData_BangLop(sql);

        ArrayList<String> danhSachMaLop = new ArrayList<>();
        Iterator<Lop> it = danhSachLop.iterator();
        while (it.hasNext()) {
            danhSachMaLop.add(it.next().getMaLop());
        }

        return danhSachMaLop;
    }
}
