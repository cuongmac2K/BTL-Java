package CustomTables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Models.Lop;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jonan
 */
public class CustomTable_DanhSachLop extends AbstractTableModel{
    String[] tenCot = {"Mã lớp", "Tên lớp", "Số sinh viên"};
    Class[] kieuDuLieu = {String.class, String.class, Integer.class};
    
    ArrayList<Lop> ds = new ArrayList<>();

    public CustomTable_DanhSachLop() {
    }
    
    public CustomTable_DanhSachLop(ArrayList<Lop> ds) {
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
            case 0: return ds.get(rowIndex).getMaLop();
            case 1: return ds.get(rowIndex).getTenLop();
            case 2: return ds.get(rowIndex).getSoLuongSV();
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
