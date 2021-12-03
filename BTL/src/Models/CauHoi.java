/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Admin
 */
public class CauHoi {
    private int maCH;
    private BaiKiemTra baiKiemTra;
    private String noiDung;
    private String a, b, c, d, dapAn;
    private String doKho;

    public CauHoi() {
    }

    public CauHoi(int maCH, BaiKiemTra baiKiemTra, String noiDung, String a, String b, String c, String d, String dapAn, String doKho) {
        this.maCH = maCH;
        this.baiKiemTra = baiKiemTra;
        this.noiDung = noiDung;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.dapAn = dapAn;
        this.doKho = doKho;
    }

    public int getMaCH() {
        return maCH;
    }

    public void setMaCH(int maCH) {
        this.maCH = maCH;
    }

    public BaiKiemTra getBaiKiemTra() {
        return baiKiemTra;
    }

    public void setBaiKiemTra(BaiKiemTra baiKiemTra) {
        this.baiKiemTra = baiKiemTra;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getDapAn() {
        return dapAn;
    }

    public void setDapAn(String dapAn) {
        this.dapAn = dapAn;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    
}
