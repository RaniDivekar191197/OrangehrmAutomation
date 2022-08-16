package com.OrangeHRM_Automation1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtil1 {
	Workbook wb;
	Sheet sheet;
	Row row;
	Cell cell;
//find the extension of the file given in method param
public String getFileExtension(String filepath) {
	return filepath.substring(filepath.indexOf("."));
}

public void getWorkBookInstance(String filePath) {
//take control of the excel file
	FileInputStream input;
	try {
		input = new FileInputStream(filePath);
// find the file extension
		String extension  = getFileExtension(filePath);
// create Instance 0f workbook based on the extension
		if (extension.equals(".xlsx")) {
			wb = new XSSFWorkbook(input);
		}else {
			wb = new HSSFWorkbook(input);
		}
	}catch (IOException e) {
		e.printStackTrace();
	}
}
//get the control on the provided sheet by name
public void getSheetInstance(String sheetName) {
	sheet =wb.getSheet(sheetName);
	if (Objects.isNull(sheet)) {

		sheet = wb.createSheet(sheetName);
	}
}
public Object[][]getExcelData(String filePath,String sheetName) throws IOException {
getWorkBookInstance(filePath);
getSheetInstance(sheetName);
int totalRow = sheet.getPhysicalNumberOfRows();
System.out.println("total rows :" + totalRow);
//find total num of columns
int totalColumn = sheet.getRow(0).getPhysicalNumberOfCells();
System.out.println("total columns :" + totalColumn);
Object[][] data = new Objects [totalRow][totalColumn];
//iterate through each row and its cell to get the value
for (int i = 1; i < totalRow; i++) {
	//get the control of row based on the i (index) value
	row = sheet.getRow(i);
for	(int j = 0; j<totalColumn; j++){
	// get the cell control 
	cell = row.getCell(j);
	data[i][j] = getCellData();
}
}
wb.close();
return data;
}

// this method will set the value in cells based on the provided index
public void setExcelData(String filePath, String sheetName,int rowIndex,int cellIndex,String value) throws IOException {
	getWorkBookInstance(filePath);
	getSheetInstance(sheetName);
	int totalRows = sheet.getPhysicalNumberOfRows();
	if (totalRows == 0) {
		cell = sheet.createRow(rowIndex).createCell(totalRows);
		cell.setCellValue(value);
	}else {
		cell = sheet.getRow(rowIndex).getCell(cellIndex);
		cell.setCellValue(value);
	}
	FileOutputStream  output = new FileOutputStream(filePath);
	wb.write(output);
	wb.close();

	}
public Object getCellData() {
	switch (cell.getCellType()) {
	case STRING :
		return cell.getStringCellValue();
	case NUMERIC:
		return cell.getNumericCellValue();
	case BOOLEAN:
		return cell.getBooleanCellValue();
	case _NONE:
		return null;
	case ERROR:
		return cell.getErrorCellValue();
	case BLANK:
		return null;
	case FORMULA:
		return cell.getCellFormula();
		default:
			System.out.println("NOne of the case match with cell type");
			return null;
	}
}
}



