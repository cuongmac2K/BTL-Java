/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.TaiKhoan;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class DangNhapController {

    Connection connection = ConnectToSQLServer.ketNoiCSDL();

    public static ArrayList<TaiKhoan> layBangTaiKhoan(String tenDN, String matKhau, String loaiTK) {
        String sql = "SELECT * FROM TAIKHOAN WHERE TenDangNhap='" + tenDN + "' and MatKhau='" + matKhau + "' and LoaiTaiKhoan=N'" + loaiTK + "'";
        return ConnectToSQLServer.layData_BangTaiKhoan(sql);
    }
}
