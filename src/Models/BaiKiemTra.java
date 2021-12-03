/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Jonan
 */
public class BaiKiemTra {
    String maBKT;
    String tenBKT;
    Lop lop;
    String doKho;
    int thoiGianLam; // tinh bang phut
    String hanNop;
    int tongSoCauHoi;

    public BaiKiemTra() {
    }

    public BaiKiemTra(String maBKT, String tenBKT, Lop lop, String doKho, int thoiGianLam, String hanNop, int tongSoCauHoi) {
        this.maBKT = maBKT;
        this.tenBKT = tenBKT;
        this.lop = lop;
        this.doKho = doKho;
        this.thoiGianLam = thoiGianLam;
        this.hanNop = hanNop;
        this.tongSoCauHoi = tongSoCauHoi;
    }

    public String getMaBKT() {
        return maBKT;
    }

    public void setMaBKT(String maBKT) {
        this.maBKT = maBKT;
    }

    public String getTenBKT() {
        return tenBKT;
    }

    public void setTenBKT(String tenBKT) {
        this.tenBKT = tenBKT;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    public int getThoiGianLam() {
        return thoiGianLam;
    }

    public void setThoiGianLam(int thoiGianLam) {
        this.thoiGianLam = thoiGianLam;
    }

    public String getHanNop() {
        return hanNop;
    }

    public void setHanNop(String hanNop) {
        this.hanNop = hanNop;
    }

    public int getTongSoCauHoi() {
        return tongSoCauHoi;
    }

    public void setTongSoCauHoi(int tongSoCauHoi) {
        this.tongSoCauHoi = tongSoCauHoi;
    }


}
