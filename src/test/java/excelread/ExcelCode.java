package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
  static FileInputStream fileinput;
  static XSSFWorkbook wrkbk; 
  static XSSFSheet sheet;
  
  public static String readStringData(int row,int col) throws IOException 
  {
	  fileinput=new FileInputStream("C:\\Users\\USER\\Desktop\\Excel\\Book1.xlsx");
	  wrkbk=new XSSFWorkbook(fileinput);
	  sheet=wrkbk.getSheet("Sheet1");
	  Row r=sheet.getRow(row);
	  Cell c=r.getCell(col);
	  return c.getStringCellValue();
	  
  }
  public static String readIntegerData(int row,int col) throws IOException 
  {
	  fileinput=new FileInputStream("C:\\Users\\USER\\Desktop\\Excel\\Book1.xlsx");
	  wrkbk=new XSSFWorkbook(fileinput);//FileInputStream,XSSFWorkbook are class
	  sheet=wrkbk.getSheet("Sheet1");
	  Row r=sheet.getRow(row);//here Row and Cell(below) are interface
	  Cell c=r.getCell(col);
	  int val=(int) c.getNumericCellValue();
	  return String.valueOf(val);
  }
  
}
