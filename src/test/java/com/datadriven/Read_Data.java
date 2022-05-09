package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static void read_One_Data() throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\MavenProj\\Excel\\EXCEL.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(2);
		
		CellType cellType = cell.getCellType();
		
		
		if (cellType.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			
			System.out.println(stringCellValue);
			
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int data = (int) numericCellValue ;
			
			System.out.println(data);
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		read_One_Data();
	}
		
	}


