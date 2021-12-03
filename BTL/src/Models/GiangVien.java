/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Jonan
 */
public class GiangVien {
    String maGV;
    String tenGV;
    TaiKhoan taiKhoan;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, TaiKhoan taiKhoan) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.taiKhoan = taiKhoan;
        taiKhoan.setLoaiTaiKhoan("Giảng viên");
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

}
