package com.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Update {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Ashstarr\\Downloads\\Excel\\stats.xlsx");
		FileInputStream loc = new FileInputStream(f);
		Workbook wor = new XSSFWorkbook(loc);
		Sheet s = wor.getSheet("power");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String x = c.getStringCellValue();
		if (x.equals("Naruto")) {
			c.setCellValue("Naruto Uzumaki");
		}
		FileOutputStream fout = new FileOutputStream(f);
		wor.write(fout);
		System.out.println("Done");
		wor.close();
		
	}

}
