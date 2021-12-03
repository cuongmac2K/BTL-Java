/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;

/**
 *
 * @author Jonan
 */
public class DangKyController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static boolean themSinhVien(String tenDN, String maSV, String tenSV, String maLop, String matKhau) {
        String sql_1 = "INSERT INTO TAIKHOAN VALUES('" + tenDN + "', '" + matKhau + "', 'Sinh viên')";
        String sql_2 = "INSERT INTO SINHVIEN VALUES ('" + maSV + "', N'" + tenSV + "', '" + maLop + "', N'" + tenDN + "')";

        return ConnectToSQLServer.thucHienLenhSQL(sql_1) && ConnectToSQLServer.thucHienLenhSQL(sql_2);
    }
}
