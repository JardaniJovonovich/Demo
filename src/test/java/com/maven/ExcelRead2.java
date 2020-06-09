package com.maven;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Ashstarr\\Downloads\\Excel\\stats.xlsx");
		FileInputStream loc = new FileInputStream(f);
		Workbook wor = new XSSFWorkbook(loc);
		Sheet s = wor.getSheet("power");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row roww = s.getRow(i);
for (int j = 0; j < roww.getPhysicalNumberOfCells(); j++) {
	Cell x = roww.getCell(j);
	int z = x.getCellType();
	System.out.println(z);
	if (x.getCellType()==1) {
		String ab = x.getStringCellValue();
		System.out.println(ab);
	}else if (x.getCellType()==0) {
		double cd = x.getNumericCellValue();
		System.out.println(cd);
		wor.close();
	}
	
}			
		}
	}

}
