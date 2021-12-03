/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.BaiKiemTra;
import Models.CT_SV_BKT;
import Models.CauHoi;
import Models.GiangVien;
import Models.Lop;
import Models.SinhVien;
import Models.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class ConnectToSQLServer {

    static Connection connection = null;

    public static Connection ketNoiCSDL() {
        try {
            var server = "TA_CUONG\\SQLEXPRESS";
            var user = "sa";
            var password = "123123123";
            var db = "PHANMEMTRACNGHIEM";
            var port = 1433;
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser(user);
            ds.setPassword(password);
            ds.setDatabaseName(db);
            ds.setServerName(server);
            ds.setPortNumber(port);

            connection = ds.getConnection();
            System.out.println("Ket noi thanh cong voi sql server");
            System.out.println(connection.getCatalog());
        } catch (SQLException ex) {
            System.out.println("KHÔNG THỂ KẾT NỐI CƠ SỞ DỮ LIỆU");
        }
        return connection;
    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<TaiKhoan> layData_BangTaiKhoan(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan temp = new TaiKhoan(rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"), rs.getString("LoaiTaiKhoan"));
                System.out.println(temp);
                danhSachTaiKhoan.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachTaiKhoan;
    }

    public static ArrayList<Lop> layData_BangLop(String sql) {
        ConnectToSQLServer.ketNoiCSDL();

        ArrayList<Lop> danhSachLop = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                GiangVien giangVien = new GiangVien(rs.getString("MaGV"), rs.getString("TenGV"), taiKhoan);
                Lop temp = new Lop(rs.getString("MaLop"), rs.getString("TenLop"), giangVien, rs.getInt("SoSV"));
                danhSachLop.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachLop;
    }

    public static ArrayList<GiangVien> layData_BangGiangVien(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<GiangVien> danhSachGiangVien = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenDangNhap(rs.getString("TenDangNhap"));
                GiangVien temp = new GiangVien(rs.getString("MaGV"), rs.getString("TenGV"), taiKhoan);
                danhSachGiangVien.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachGiangVien;
    }

    public static ArrayList<SinhVien> layData_BangSinhVien(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenDangNhap(rs.getString("TenDangNhap"));
                GiangVien giangVien = new GiangVien();
                Lop lop = new Lop(rs.getString("MaLop"), rs.getString("TenLop"), giangVien, rs.getInt("SoSV"));
                SinhVien temp = new SinhVien(rs.getString("MaSV"), rs.getString("TenSV"), lop, taiKhoan);
                danhSachSinhVien.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachSinhVien;
    }

    public static ArrayList<BaiKiemTra> layData_BangBaiKiemTra(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<BaiKiemTra> danhSachBaiKiemTra = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lop lop = new Lop();
                lop.setTenLop(rs.getString("TenLop"));

                BaiKiemTra temp = new BaiKiemTra(rs.getString("MaBKT"), rs.getString("TenBKT"), lop,
                        rs.getString("DoKho"), rs.getInt("ThoiGianLam"), rs.getString("HanNop"), rs.getInt("TongSoCau"));
                danhSachBaiKiemTra.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }
        return danhSachBaiKiemTra;
    }

    public static ArrayList<CT_SV_BKT> layData_BangCT_SV_BKT(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<CT_SV_BKT> result = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //do du lieu ra danhSachBaiKiemTra
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMaSV(rs.getString("MaSV"));
                sinhVien.setTenSV(rs.getString("TenSV"));

                BaiKiemTra baiKiemTra = new BaiKiemTra();
                baiKiemTra.setMaBKT(rs.getString("MaBKT"));
                baiKiemTra.setTenBKT(rs.getString("TenBKT"));
                baiKiemTra.setHanNop(rs.getString("HanNop"));
                baiKiemTra.setThoiGianLam(rs.getInt("ThoiGianLam"));

                CT_SV_BKT temp = new CT_SV_BKT(sinhVien, baiKiemTra, rs.getFloat("Diem"),
                        rs.getInt("SoCauDung"), rs.getInt("TongThoiGianLam"), rs.getString("TrangThai"));
                result.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }

        return result;
    }

    public static ArrayList<CauHoi> layData_BangCauHoi(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<CauHoi> result = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //do du lieu ra danhSachBaiKiemTra
            while (rs.next()) {
                BaiKiemTra baiKiemTra = new BaiKiemTra();
                baiKiemTra.setMaBKT(rs.getString("MaBKT"));
                baiKiemTra.setTenBKT(rs.getString("TenBKT"));
                baiKiemTra.setThoiGianLam(rs.getInt("ThoiGianLam"));
                baiKiemTra.setTongSoCauHoi(rs.getInt("TongSoCau"));

                CauHoi temp = new CauHoi(rs.getInt("MaCH"), baiKiemTra, rs.getString("NoiDung"),
                        rs.getString("A"), rs.getString("B"), rs.getString("C"), rs.getString("D"),
                        rs.getString("DapAn"), rs.getString("DoKho"));
                result.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }

        return result;
    }

    public static ArrayList<CauHoi> layData_BangCauHoi_KhoDe(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        ArrayList<CauHoi> result = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //do du lieu ra danhSachBaiKiemTra
            while (rs.next()) {
                CauHoi temp = new CauHoi(rs.getInt("MaCH"), null, rs.getString("NoiDung"),
                        rs.getString("A"), rs.getString("B"), rs.getString("C"), rs.getString("D"),
                        rs.getString("DapAn"), rs.getString("DoKho"));
                result.add(temp);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay du lieu " + ex.toString());
            return null;
        }

        return result;
    }

    public static boolean thucHienLenhSQL(String sql) {
        ConnectToSQLServer.ketNoiCSDL();
        try {
            Statement stm = connection.createStatement();
            stm.execute(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("Khong thuc hien duoc cau lẹnh SQL: " + sql);
            return false;
        }
    }

}
