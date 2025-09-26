package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode { 
	  
 	static FileInputStream f;  //FileInputStream is used to read excel files in our laptop
 	static XSSFWorkbook w;     //XSSFWorkbook is used to represent entire Excel Workbook
 	static XSSFSheet sh;       //XSSFSheet is used to represent a single sheet of the Excel Workbook
  
 	public static String readStringData(int row, int col) throws IOException   { //A static method with data type String to read string data
 		f = new FileInputStream("C:\\Users\\VEENA S\\git\\JavaPrograms\\MavenProject1\\src\\main\\resources\\Obsqura.xlsx"); //This line is used to open the excel file in this location
 		w = new XSSFWorkbook(f);                             //with the help of ApachePOIdependency(in pom.xml), load the excel file to memory 
 		sh = w.getSheet("Sheet1");                           //Sheet1 is the sheet name in the excel workbook. This line means to select the data to Select1.     
 		XSSFRow r = sh.getRow(row);                          //XSSFRow-To get the rows based on given row number
 		XSSFCell c = r.getCell(col);                         //XSSFCell-To get the cell based on given row and column
 		return c.getStringCellValue();                       //To get data in above step to text/string format from number pattern
  
 	} 
  
 	public static String readIntegerData(int row, int col) throws IOException  { //A static method with data type int to read integer data
 		f = new FileInputStream("C:\\Users\\VEENA S\\git\\JavaPrograms\\MavenProject1\\src\\main\\resources\\Obsqura.xlsx"); //This line is used to open the excel file in this location
 		w = new XSSFWorkbook(f);                              //with the help of ApachePOIdependency(in pom.xml), load the excel file to memory 
 		sh = w.getSheet("Sheet1");                            //Sheet1 is the sheet name in the excel workbook. This line means to select the data to Sheet1.    
 		XSSFRow r = sh.getRow(row);                           //XSSFRow-To get the rows based on given row number
 		XSSFCell c = r.getCell(col);                          //XSSFCell-To get the cell based on given row and column
 		int val =   (int) c.getNumericCellValue();            //convert double(cells data is get in decimal values) to int using typecasting 
 		return String.valueOf(val);                           //convert int to string using valueOf() method 
 		//return val; 
 	 
 	} 
  
 }
