/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CT_SV_BKT;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class SuaDiemController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static ArrayList<CT_SV_BKT> layChiTietBaiKiemTra(String maBKT) {
        String query = "SELECT * "
                + "FROM dbo.[CT_SV_BKT] INNER JOIN dbo.[SINHVIEN] ON CT_SV_BKT.MaSV = SINHVIEN.MaSV  "
                + "INNER JOIN dbo.[BAIKIEMTRA] ON CT_SV_BKT.MaBKT = BAIKIEMTRA.MaBKT "
                + "WHERE BAIKIEMTRA.MaBKT='" + maBKT + "'";
        return ConnectToSQLServer.layData_BangCT_SV_BKT(query);
    }

    public static boolean capNhatDiem(String maSV, String maBKT, float diem) {
        String sql = "UPDATE CT_SV_BKT SET Diem=" + diem
                + "WHERE MaSV='" + maSV + "' AND MaBKT='" + maBKT + "'";
        return ConnectToSQLServer.thucHienLenhSQL(sql);
    }
}
