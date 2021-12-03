/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.GiangVien;
import Models.Lop;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class XoaLopController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static ArrayList<Lop> layDanhSachLop(GiangVien giangVien) {
        
        String query = "SELECT * FROM LOP INNER JOIN GIANGVIEN ON LOP.MaGV = GIANGVIEN.MaGV "
                + "WHERE GIANGVIEN.MaGV = '" + giangVien.getMaGV() + "'";
        return ConnectToSQLServer.layData_BangLop(query);
    }

    public static void xoaLop(String maLop) {
        String query = "DELETE dbo.[LOP] WHERE MaLop= '" + maLop + "'";
        ConnectToSQLServer.thucHienLenhSQL(query);
    }
}
