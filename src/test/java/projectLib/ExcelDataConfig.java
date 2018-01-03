package projectLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String XLPath){
		try {
			File source = new File(XLPath);
			FileInputStream fs = new FileInputStream(source);
			wb = new XSSFWorkbook(fs);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public String getData(int sheetNo, int row, int col){
		sheet1 = wb.getSheetAt(sheetNo);
		String data = sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int getRowCount(int sheetIndex){
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		return row+1;
	}

}
