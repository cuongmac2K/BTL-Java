/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CauHoi;
import Models.SinhVien;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jonan
 */
public class TaoBaiKiemTraController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static boolean taoBaiKiemTra(String maBKT, String tenBKT, String doKho, int thoiGianLam, String hanNop, int tongSoCau, String maLop) {
        String sql = "INSERT INTO BaiKiemTra(MaBKT, TenBKT, DoKho, ThoiGianLam, HanNop, TongSoCau, MaLop)"
                + "VALUES('" + maBKT + "', N'" + tenBKT + "', N'" + doKho + "', "
                + thoiGianLam + ", '" + hanNop + "', " + tongSoCau
                + ", '" + maLop + "')";
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }

    public static void taoCauHoiChoBaiKiemTra(String maBKT, CauHoi temp) {
        String sql = "INSERT INTO CAUHOI(MaBKT, NoiDung, A, B, C, D, DapAn, DoKho) "
                + "VALUES('" + maBKT + "', N'" + temp.getNoiDung() + "', N'" + temp.getA() + "', N'" + temp.getB()
                + "', N'" + temp.getC() + "', N'" + temp.getD() + "', N'" + temp.getDapAn() + "', N'" + temp.getDoKho() + "')";
        ConnectToSQLServer.thucHienLenhSQL(sql);
    }

    public static void taoBaiKiemTra_Lop(String maBKT, String maLop) {
        String sql = "SELECT * FROM SINHVIEN INNER JOIN TAIKHOAN ON SINHVIEN.TenDangNhap = TAIKHOAN.TenDangNhap "
                + "INNER JOIN LOP ON SINHVIEN.MaLop = LOP.MaLop "
                + "WHERE SINHVIEN.MaLop ='" + maLop + "'";
        ArrayList<SinhVien> danhSachSinhVien = ConnectToSQLServer.layData_BangSinhVien(sql);

        Iterator<SinhVien> it = danhSachSinhVien.iterator();
        while (it.hasNext()) {
            sql = "INSERT INTO CT_SV_BKT(MaBKT, MaSV, TrangThai) VALUES('" + maBKT + "', '" + it.next().getMaSV() + "', 'Chưa làm')";
            ConnectToSQLServer.thucHienLenhSQL(sql);
        }
    }
}
