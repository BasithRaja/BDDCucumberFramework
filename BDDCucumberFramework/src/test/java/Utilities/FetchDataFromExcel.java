package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.ConstantsData;

public class FetchDataFromExcel {
	
	public static String readData(int x,int y) throws IOException
	{
		FileInputStream fs=new FileInputStream(ConstantsData.EXCEL_PATH);
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFCell val=sheet.getRow(x).getCell(y);
		String URL=val.toString();
		return URL;
		
		
		
	}

	public static void writeData(int i, int j, String custID) throws IOException {
		FileInputStream fis = new FileInputStream(ConstantsData.EXCEL_PATH);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		 // Create row if not exists
	    if (sheet.getRow(1) == null) {
	        sheet.createRow(1);
	    }

	    // Create cell if not exists
	    if (sheet.getRow(1).getCell(1) == null) {
	        sheet.getRow(1).createCell(1);
	    }

	    // Set value
	    sheet.getRow(1).getCell(1).setCellValue(custID);

	    // Close input stream BEFORE writing
	    fis.close();

	    // Save file
	    FileOutputStream fos = new FileOutputStream(ConstantsData.EXCEL_PATH);
	    workbook.write(fos);

	    // Properly close everything
	    fos.close();
	    workbook.close();

	    System.out.println("Excel updated successfully");
	
	}
	
	public static void writeData2(int i, int j, String acctID) throws IOException {
		FileInputStream fis = new FileInputStream(ConstantsData.EXCEL_PATH);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		 // Create row if not exists
	    if (sheet.getRow(1) == null) {
	        sheet.createRow(1);
	    }

	    // Create cell if not exists
	    if (sheet.getRow(1).getCell(2) == null) {
	        sheet.getRow(1).createCell(2);
	    }

	    // Set value
	    sheet.getRow(1).getCell(2).setCellValue(acctID);

	    // Close input stream BEFORE writing
	    fis.close();

	    // Save file
	    FileOutputStream fos = new FileOutputStream(ConstantsData.EXCEL_PATH);
	    workbook.write(fos);

	    // Properly close everything
	    fos.close();
	    workbook.close();

	    System.out.println("Excel updated successfully");
	
	}
	

}



