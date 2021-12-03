/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CT_SV_BKT;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class CreateExcel {

    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    public void TaoFileDiem(ArrayList<CT_SV_BKT> danhSach, String tenFile) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Diem kiem tra");

        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // MaSV
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã sinh viên");
        cell.setCellStyle(style);
        // TenSV
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên sinh viên");
        cell.setCellStyle(style);
        // Diem
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Điểm");
        cell.setCellStyle(style);

        // Data
        for (CT_SV_BKT temp : danhSach) {
            rownum++;
            row = sheet.createRow(rownum);

            // Ma sinh vien (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(temp.getSinhVien().getMaSV());
            // Ten sinh vien (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(temp.getSinhVien().getTenSV());
            //  Diem(C)
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(temp.getDiem());
        }
        File file = new File(tenFile);
        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("File đã tạo: " + file.getAbsolutePath());

    }

}
