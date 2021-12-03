/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CauHoi;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class QLCauHoiController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static ArrayList<CauHoi> layKhoDe() {
        String sql = "SELECT * FROM CAUHOI "
                + "WHERE MaBKT IS NULL";
        return ConnectToSQLServer.layData_BangCauHoi_KhoDe(sql);
    }

    public static boolean themCauHoi(String noiDung, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung, String doKho) {
        String sql = "INSERT INTO CAUHOI(MaBKT, NoiDung, A, B, C, D, DapAn, DoKho) "
                + "VALUES(null, N'" + noiDung + "', N'" + dapAnA + "', N'" + dapAnB + "', N'"
                + dapAnC + "', N'" + dapAnD + "', '" + dapAnDung + "', N'" + doKho + "')";
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }

    public static boolean suaCauHoi(int maCH, String noiDung, String dapAnA, String dapAnB, String dapAnC, String dapAnD, String dapAnDung, String doKho) {
        String sql = "UPDATE CAUHOI "
                + "SET NoiDung = N'" + noiDung + "', A = N'" + dapAnA + "', B = N'" + dapAnB + "', C = N'" + dapAnC
                + "', D = N'" + dapAnD + "', DapAn = N'" + dapAnDung + "', DoKho = N'" + doKho + "' "
                + "WHERE MaCH = " + maCH;
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }

    public static boolean xoaCauHoi(int maCH) {
        String sql = "DELETE CAUHOI WHERE MaCH =" + maCH;
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }
}
