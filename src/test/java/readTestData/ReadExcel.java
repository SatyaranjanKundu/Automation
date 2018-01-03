package readTestData;

import projectLib.ExcelDataConfig;

public class ReadExcel {

	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("F:\\ExcelData\\TestData.xlsx");
		//System.out.println(excel.getData(1, 2, 0));
		//System.out.println(excel.getRowCount(0));
		
		int rc = excel.getRowCount(0);
		
		for(int i = 0; i < rc; i++){
			System.out.println(excel.getData(0, i, 0)+"   "+excel.getData(0, i, 1));
			//System.out.println(excel.getData(0, i, 1));
		}

	}

}
