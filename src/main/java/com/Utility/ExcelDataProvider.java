package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() throws IOException {
		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\Framework_BatchFive\\TestData\\TestData_1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
}
	
	public String getStringTestData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public String getNumericData(String sheetname,int row,int cell) {
		 double data=wb.getSheet(null).getRow(0).getCell(0).getNumericCellValue();
		 String Data1=Double.toString(data).replace(".0", "");
		 return Data1;
	}
}
