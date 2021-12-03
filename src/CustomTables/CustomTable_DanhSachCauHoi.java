/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTables;

import Models.CauHoi;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonan
 */
public class CustomTable_DanhSachCauHoi extends AbstractTableModel{
    String[] tenCot = {"Mã câu hỏi", "Nội dung", "Đáp án A", "Đáp án B", "Đáp án C", "Đáp án D", "Câu trả lời đúng", "Độ khó"};
    Class[] kieuDuLieu = {Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    
//    ArrayList<BaiKiemTra> danhSachBaiKiemTra = new ArrayList<>();
    ArrayList<CauHoi> danhSachCauHoi = new ArrayList<>();

    public CustomTable_DanhSachCauHoi() {
    }

    public CustomTable_DanhSachCauHoi(ArrayList<CauHoi> ds) {
        this.danhSachCauHoi = ds;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return danhSachCauHoi.size();
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
            case 0: return danhSachCauHoi.get(rowIndex).getMaCH();
            case 1: return danhSachCauHoi.get(rowIndex).getNoiDung();
            case 2: return danhSachCauHoi.get(rowIndex).getA();
            case 3: return danhSachCauHoi.get(rowIndex).getB();
            case 4: return danhSachCauHoi.get(rowIndex).getC();
            case 5: return danhSachCauHoi.get(rowIndex).getD();
            case 6: return danhSachCauHoi.get(rowIndex).getDapAn();
            case 7: return danhSachCauHoi.get(rowIndex).getDoKho();
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
