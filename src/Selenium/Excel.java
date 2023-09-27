package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	 public static void main(String[] args) {
// Specifying Excel file paths
	        String inputFilePath = "F://EDUBRIDGE/login.xlsx"; // Input file
	        String outputFilePath = "F://EDUBRIDGE/authentication.xlsx";      // Output file

// Reading Excel file
	        try {
	            FileInputStream fileInputStream = new FileInputStream(inputFilePath);
	            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
	            XSSFSheet sheet = workbook.getSheetAt(0);
	        
// Creating & writing in Excel file
	            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);

// Getting Input from the user
	        	Scanner sc= new Scanner(System.in);
	        	System.out.println("Username: ");
	        	String str1= sc.nextLine();
	        	System.out.println("Password: ");
	        	String str2= sc.nextLine();

// Create a new workbook and sheet
			       XSSFWorkbook newWorkbook = new XSSFWorkbook();
			       XSSFSheet newSheet = newWorkbook.createSheet("Sheet1");
// Read data from cell A1
	           int lastnum = sheet.getLastRowNum(); 
	           for(int i=1; i<=lastnum; i++) {
	           //System.out.println(lastnum);
	            XSSFRow rowname = sheet.getRow(i);
	            XSSFCell cellname = rowname.getCell(0);
	            String name = cellname.getStringCellValue();
	            int compName= name.compareTo (str1);
	            
	            XSSFRow rowpass = sheet.getRow(i);
	            XSSFCell cellpass = rowpass.getCell(1);
	            String password = cellpass.getStringCellValue();
	            int compPass= password.compareTo(str2);

            
	            if(compName==0 && compPass==0) {
// Create a new row and cell
		        XSSFRow newRow = newSheet.createRow(0);
		        XSSFCell newCell = newRow.createCell(0);

// Set a value in cell A1
		        newCell.setCellValue("Login Successful !");

// Write the new workbook to the output file
	            newWorkbook.write(fileOutputStream);
	            }
	            }

//Create a new row and cell
		       XSSFRow newRow = newSheet.createRow(0);
		       XSSFCell newCell = newRow.createCell(0);

// Set a value in cell A1
		        newCell.setCellValue("Login failed");
		        
// Write the new workbook to the output file
	            newWorkbook.write(fileOutputStream);

// Close input and output streams
	            fileInputStream.close();
	            fileOutputStream.close();
	            
 System.out.println("Data written to " + outputFilePath);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
