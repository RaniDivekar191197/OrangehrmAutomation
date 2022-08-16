package com.OrangeHRM_Automation1;

import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook wb;
		Sheet sheet;
		Row row;
		Cell cell;
		String filePath ="C:\\\\Users\\\\ranid\\\\eclipse-workspace\\\\TestData.xlsx";
		try {
			//take control to the excel file
			FileInputStream input = new FileInputStream(filePath);
			//find t=he File extension
			
			String extension = filePath.substring(filePath.indexOf("."));
			System.out.println(extension);
			//create Instance of workbook based on the extension
			if(extension.equals(".xlsx")) {
				wb= new XSSFWorkbook(input);
				
			}else {
				wb= new HSSFWorkbook(input);
			}
			//get control of sheet from the workBook instance
			sheet = wb.getSheet("Sheet1");
			//find total num of rows
			int totalRow =sheet.getPhysicalNumberOfRows();
			System.out.println("total rows :" +totalRow);
			Row row2 = sheet.getRow(0);
			//find total num of columns
			int totalColumn =sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("total columns :" +totalColumn);
			//iterate through each row and its cell to get the value
			for(int i=1;i<totalRow;i++) {
				//get the control of row based on the i (index) value
				row=sheet.getRow(i);
				for(int j=0;j<totalColumn;j++) {
					//get the cell control
					cell = row .getCell(j);
					System.out.println(cell.getStringCellValue()+ " ");	
				}
				System.out.println();
				
			}
			wb.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
