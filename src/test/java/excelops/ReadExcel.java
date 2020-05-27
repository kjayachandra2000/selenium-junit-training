package excelops;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    @Test
    public void readExcelTest() throws IOException, InvalidFormatException {
        String filePath = "src/test/java/excelops/demo.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(new File(filePath));
        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rows = sheet.iterator();
        while (rows.hasNext()) {
            Row row = rows.next();
            Iterator<Cell> cells = row.cellIterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                if (cell.getCellType().equals(CellType.NUMERIC)) {
                    System.out.println(cell.getNumericCellValue());
                } else if (cell.getCellType().equals(CellType.STRING)) {
                    System.out.println(cell.getStringCellValue());
                }
            }
        }
        workbook.close();
    }
}
