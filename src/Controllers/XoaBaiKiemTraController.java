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
public class XoaBaiKiemTraController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static ArrayList<BaiKiemTra> layDanhSachBaiKiemTra(String maLop) {
        String query = "SELECT * FROM dbo.[BAIKIEMTRA] INNER JOIN dbo.[LOP] ON BAIKIEMTRA.MaLop = LOP.MaLop "
                + "WHERE BaiKiemTra.MaLop = '" + maLop + "'";
        return ConnectToSQLServer.layData_BangBaiKiemTra(query);
    }

    public static void xoaBaiKiemTra(String maBKT) {
        String query = "DELETE dbo.[BaiKiemTra] WHERE MaBKT= '" + maBKT + "'";
        ConnectToSQLServer.thucHienLenhSQL(query);
    }
}
