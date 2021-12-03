/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BaiKiemTra;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class SuaBaiKiemTraController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static BaiKiemTra layThongTinBaiKiemTra(String maBKT) {
        String sql = "SELECT * FROM BAIKIEMTRA INNER JOIN LOP ON BAIKIEMTRA.MaLop = LOP.MaLop "
                + "WHERE MaBKT = '" + maBKT + "'";
        ArrayList<BaiKiemTra> danhSachBaiKiemTra = ConnectToSQLServer.layData_BangBaiKiemTra(sql);
        return danhSachBaiKiemTra.get(0);
    }

    public static boolean capNhatBaiKiemTra(String maBKT, String tenBKT, int thoiGianLam, String hanNop) {
        String sql = "UPDATE BAIKIEMTRA "
                + "SET TenBKT ='" + tenBKT + "', ThoiGianLam =" + thoiGianLam + ", hanNop = '" + hanNop + "' "
                + "WHERE MaBKT = '" + maBKT + "'";
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }
}
