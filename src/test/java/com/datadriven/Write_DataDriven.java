package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_DataDriven {
	
	private static void write_Datas() throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\MavenProj\\Excel\\EXCEL.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Sheet3").createRow(0).createCell(0).setCellValue("Name");
		
		wb.getSheet("Sheet3").getRow(0).createCell(1).setCellValue("Subject");
		
		wb.getSheet("Sheet3").createRow(1).createCell(0).setCellValue("MS.Dhoni");
		
		wb.getSheet("Sheet3").getRow(1).createCell(1).setCellValue("Cricket");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Run Sucessfuly");
		
		
		
		
		

	}
	
	public static void main(String[] args) throws IOException {
		
		write_Datas();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
