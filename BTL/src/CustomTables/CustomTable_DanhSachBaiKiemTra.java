/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTables;

import Models.BaiKiemTra;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonan
 */
public class CustomTable_DanhSachBaiKiemTra extends AbstractTableModel{
    String[] tenCot = {"Mã bài kiểm tra", "Tên bài kiểm tra", "Tên lớp", "Độ khó", "Thời gian làm(phút)", "Hạn nộp", "Tổng số câu"};
    Class[] kieuDuLieu = {String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.class};
    
    ArrayList<BaiKiemTra> ds = new ArrayList<>();

    public CustomTable_DanhSachBaiKiemTra() {
    }
    
    public CustomTable_DanhSachBaiKiemTra(ArrayList<BaiKiemTra> ds) {
        this.ds = ds;
    }

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
        return tenCot.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0: return ds.get(rowIndex).getMaBKT();
            case 1: return ds.get(rowIndex).getTenBKT();
            case 2: return ds.get(rowIndex).getLop().getTenLop();
            case 3: return ds.get(rowIndex).getDoKho();
            case 4: return ds.get(rowIndex).getThoiGianLam();
            case 5: return ds.get(rowIndex).getHanNop();
            case 6: return ds.get(rowIndex).getTongSoCauHoi();
            default: return "Lỗi";
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
