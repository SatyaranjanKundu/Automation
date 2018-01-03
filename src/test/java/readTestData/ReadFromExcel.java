package readTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		File source = new File("F:\\ExcelData\\TestData.xlsx");
        FileInputStream fs = new FileInputStream(source);
        XSSFWorkbook wb = new XSSFWorkbook(fs);
        //HSSFWorkbook wb = new HSSFWorkbook(fs); Use this for .xls files
        XSSFSheet sheet1 = wb.getSheetAt(0);
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data0);
        System.out.println(sheet1.getLastRowNum());
        wb.close();
	}

}
