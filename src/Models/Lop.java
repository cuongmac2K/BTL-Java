/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.swing.JButton;

/**
 *
 * @author Jonan
 */
public class Lop {
    String MaLop;
    String TenLop;
    GiangVien giangVien;
    int soLuongSV;

    public Lop() {
    }

    public Lop(String MaLop, String TenLop, GiangVien giangVien, int soLuongSV) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.giangVien = giangVien;
        this.soLuongSV = soLuongSV;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    
}
