/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTables;

import Models.BaiKiemTra;
import Models.CT_SV_BKT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonan
 */
public class CustomTable_DanhSachBaiKiemTra_Diem extends AbstractTableModel{
    String[] tenCot = {"Mã bài kiểm tra", "Tên bài kiểm tra", "Điểm", "Hoàn thành bài trong(phút)", "Thời gian làm bài(phút)", "Hạn nộp", "Trạng thái"};
    Class[] kieuDuLieu = {String.class, String.class, Float.class, Integer.class, Integer.class, String.class, String.class};
    
//    ArrayList<BaiKiemTra> danhSachBaiKiemTra = new ArrayList<>();
    ArrayList<CT_SV_BKT> danhSachChiTietBaiKiemTra = new ArrayList<>();

    public CustomTable_DanhSachBaiKiemTra_Diem() {
    }

    public CustomTable_DanhSachBaiKiemTra_Diem(ArrayList<CT_SV_BKT> ds) {
        this.danhSachChiTietBaiKiemTra = ds;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return danhSachChiTietBaiKiemTra.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tenCot.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex)
        {
            case 0: return danhSachChiTietBaiKiemTra.get(rowIndex).getBaiKiemTra().getMaBKT();
            case 1: return danhSachChiTietBaiKiemTra.get(rowIndex).getBaiKiemTra().getTenBKT();
            case 2: return danhSachChiTietBaiKiemTra.get(rowIndex).getDiem();
            case 3: return danhSachChiTietBaiKiemTra.get(rowIndex).getTongThoiGianLam();
            case 4: return danhSachChiTietBaiKiemTra.get(rowIndex).getBaiKiemTra().getThoiGianLam();
            case 5: return danhSachChiTietBaiKiemTra.get(rowIndex).getBaiKiemTra().getHanNop();
            case 6: return danhSachChiTietBaiKiemTra.get(rowIndex).getTrangThai();
            default: return null;
        }
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return kieuDuLieu[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return tenCot[column];
    }
    
}
