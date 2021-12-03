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
public class SinhVien {
    String maSV;
    String tenSV;
    Lop lop;
    TaiKhoan taiKhoan;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, Lop lop, TaiKhoan taiKhoan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.taiKhoan = taiKhoan;
        taiKhoan.setLoaiTaiKhoan("Sinh viên");
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
    
    
}
