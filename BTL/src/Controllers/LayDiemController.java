/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BaiKiemTra;
import Models.CT_SV_BKT;
import Models.Lop;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class LayDiemController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static ArrayList<BaiKiemTra> layDanhSachBaiKiemTra(String maLop) {
        String query = "SELECT * FROM dbo.[BAIKIEMTRA] INNER JOIN dbo.[LOP] ON BAIKIEMTRA.MaLop = LOP.MaLop "
                + "WHERE BaiKiemTra.MaLop = '" + maLop + "'";
        return ConnectToSQLServer.layData_BangBaiKiemTra(query);
    }

    public static ArrayList<CT_SV_BKT> layChiTietBaiKiemTra(String maBKT) {
        String query = "SELECT * "
                + "FROM dbo.[CT_SV_BKT] INNER JOIN dbo.[SINHVIEN] ON CT_SV_BKT.MaSV = SINHVIEN.MaSV  "
                + "INNER JOIN dbo.[BAIKIEMTRA] ON CT_SV_BKT.MaBKT = BAIKIEMTRA.MaBKT "
                + "WHERE BAIKIEMTRA.MaBKT='" + maBKT + "'";
        return ConnectToSQLServer.layData_BangCT_SV_BKT(query);
    }
}
