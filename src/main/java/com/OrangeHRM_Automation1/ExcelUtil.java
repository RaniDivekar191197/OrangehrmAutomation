package com.OrangeHRM_Automation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.attribute.standard.SheetCollate;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtil {
	static Workbook wb;
	static Sheet sheet;
	static Row row;
	static Cell cell;
public static String getFileExtenstion(String filePath) {
	return filePath.substring(filePath.indexOf("."));
}
	public static void WorkBookInstance(String filePath) {
		FileInputStream input;
		try {
			input =new FileInputStream(filePath);
			String extension=getFileExtenstion(filePath);
			if (extension.equals(".xlsx")) {
				wb=new XSSFWorkbook(input);
			}else {
				wb=new HSSFWorkbook(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	public static void getSheetInstance(String sheetName) {
		sheet=wb.getSheet(sheetName);
	}
	public static void main(String[] args) {
		String filePath="C:\\Users\\ranid\\eclipse-workspace\\TestData.xlsx";
		try {
			WorkBookInstance(filePath);
			getSheetInstance("Sheet1");
		int totalRow=sheet.getPhysicalNumberOfRows();
		System.out.println("total row :"+totalRow);
		int totalColumn=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("toatal column :"+totalColumn);
		for(int i=0;i<totalRow;i++) {
			row=sheet.getRow(i);
			String username=row.getCell(0).getStringCellValue();
			String password=row.getCell(1).getStringCellValue();
			System.out.println(username+"  "+password);
		}
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
