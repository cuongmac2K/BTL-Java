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
public class CT_SV_BKT {
    SinhVien sinhVien;
    BaiKiemTra baiKiemTra;
    float diem;
    int soCauDung;
    int tongThoiGianLam; // tinh bang phut
    String trangThai; // 0 chua lam 1 hoan thanh

    public CT_SV_BKT() {
    }

    public CT_SV_BKT(SinhVien sinhVien, BaiKiemTra baiKiemTra, float diem, int soCauDung, int tongThoiGianLam, String trangThai) {
        this.sinhVien = sinhVien;
        this.baiKiemTra = baiKiemTra;
        this.diem = diem;
        this.soCauDung = soCauDung;
        this.tongThoiGianLam = tongThoiGianLam;
        this.trangThai = trangThai;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public BaiKiemTra getBaiKiemTra() {
        return baiKiemTra;
    }

    public void setBaiKiemTra(BaiKiemTra baiKiemTra) {
        this.baiKiemTra = baiKiemTra;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) throws Exception {
        if(diem < 0 || diem > 10)
        {
            throw new Exception("Điểm nhập không hợp lệ");
        }
        this.diem = diem;
    }

    public int getSoCauDung() {
        return soCauDung;
    }

    public void setSoCauDung(int soCauDung) {
        this.soCauDung = soCauDung;
    }

    public int getTongThoiGianLam() {
        return tongThoiGianLam;
    }

    public void setTongThoiGianLam(int tongThoiGianLam) {
        this.tongThoiGianLam = tongThoiGianLam;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
