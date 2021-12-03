/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Lop;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class TaoLopContronller {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static boolean themLop(String maLop, String tenLop, String maGV) {
        String sql = "INSERT INTO LOP(MaLop, TenLop, MaGV) VALUES('" + maLop
                + "', '" + tenLop + "', '" + maGV + "' )";
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }

    public static boolean kiemTraLopDaTonTai(String maLop) {
        String sql = "SELECT * FROM LOP INNER JOIN GIANGVIEN ON LOP.MaGV = GIANGVIEN.MaGV "
                + " WHERE MaLop='" + maLop + "'";
        ArrayList<Lop> danhSachLop = ConnectToSQLServer.layData_BangLop(sql);

        return !danhSachLop.isEmpty();
    }
}
