/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CT_SV_BKT;
import Models.CauHoi;
import Models.SinhVien;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class LamBaiKiemTraController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static SinhVien layThongTinSinhVien(String maSV) {
        String sql = "SELECT * FROM SINHVIEN INNER JOIN LOP ON SINHVIEN.MaLop = LOP.MaLop "
                + "INNER JOIN TAIKHOAN ON SINHVIEN.TenDangNhap = TAIKHOAN.TenDangNhap "
                + "WHERE MaSV = '" + maSV + "'";

        ArrayList<SinhVien> listSinhVien = ConnectToSQLServer.layData_BangSinhVien(sql);
        return listSinhVien.get(0);
    }

    public static CT_SV_BKT layThongTinBaiKiemTra(String maSV, String maBKT) {
        String sql = "SELECT * FROM CT_SV_BKT INNER JOIN SINHVIEN ON SINHVIEN.MaSV = CT_SV_BKT.MaSV "
                + "INNER JOIN BAIKIEMTRA ON CT_SV_BKT.MaBKT = BAIKIEMTRA.MaBKT "
                + "WHERE SINHVIEN.MaSV = '" + maSV + "' AND BAIKIEMTRA.MaBKT ='" + maBKT + "'";

        ArrayList<CT_SV_BKT> listBKT = ConnectToSQLServer.layData_BangCT_SV_BKT(sql);
        return listBKT.get(0);
    }

    public static ArrayList<CauHoi> layDanhSachCauHoi(String maBKT) {
        String sql = "SELECT * FROM CAUHOI INNER JOIN BAIKIEMTRA ON CAUHOI.MaBKT = BAIKIEMTRA.MaBKT "
                + "WHERE CAUHOI.MaBKT ='" + maBKT + "'";
        return ConnectToSQLServer.layData_BangCauHoi(sql);
    }

    public static boolean luuKetQua(String maSV, String maBKT, double diem, int soCauSVLamDc, int thoiGianLam, String trangThai) {
        String sql = "UPDATE CT_SV_BKT "
                + "SET Diem = " + diem + ", SoCauDung = " + soCauSVLamDc
                + ", TongThoiGianLam = " + thoiGianLam + ", TrangThai = '" + trangThai + "'"
                + "WHERE MaSV ='" + maSV + "' AND MaBKT = '" + maBKT + "'";
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }
}
