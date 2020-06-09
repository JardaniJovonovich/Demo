package com.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Write {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Ashstarr\\Downloads\\Excel\\Tsukoyomi.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet S = w.createSheet("Madara Uchiha");
		Row R = S.createRow(0);
		Cell C = R.createCell(0);
		C.setCellValue("I MADARA UCHIHA DECLARE YOU THE STRONGEST");
		FileOutputStream f2 = new FileOutputStream(f);
		w.write(f2);
		System.out.println("DONE");
		w.close();
	}

}
