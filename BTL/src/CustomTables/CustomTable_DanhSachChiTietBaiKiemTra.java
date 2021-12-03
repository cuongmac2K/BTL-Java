/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTables;

import Models.CT_SV_BKT;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonan
 */
public class CustomTable_DanhSachChiTietBaiKiemTra extends AbstractTableModel{
    String[] tenCot = {"Mã sinh viên", "Tên sinh viên", "Điểm", "Số câu đúng", "Thời gian làm", "Trạng thái"};
    Class[] kieuDuLieu = {String.class, String.class, Float.class, String.class, Integer.class, String.class};
    
    ArrayList<CT_SV_BKT> ds = new ArrayList<>();

    public CustomTable_DanhSachChiTietBaiKiemTra() {
    }
    
    public CustomTable_DanhSachChiTietBaiKiemTra(ArrayList<CT_SV_BKT> ds) {
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
            case 0: return ds.get(rowIndex).getSinhVien().getMaSV();
            case 1: return ds.get(rowIndex).getSinhVien().getTenSV();
            case 2: return ds.get(rowIndex).getDiem();
            case 3: return ds.get(rowIndex).getSoCauDung();
            case 4: return ds.get(rowIndex).getTongThoiGianLam();
            case 5: return ds.get(rowIndex).getTrangThai();
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

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
        if(this.getColumnName(columnIndex).equals("Điểm"))
        {
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
        CT_SV_BKT result = ds.get(rowIndex);
        if(columnIndex == 2)
        {
            try {
                result.setDiem((float)aValue);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Lỗi : "+ ex.getMessage());
            }
        }
    }
    
    
}
