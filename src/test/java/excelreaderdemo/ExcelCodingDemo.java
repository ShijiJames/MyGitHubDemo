package excelreaderdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCodingDemo {
	
	
	XSSFSheet sheet;
	
	
	public ExcelCodingDemo() throws IOException
	{
		FileInputStream fileinput=new FileInputStream("C:\\Users\\USER\\Desktop\\Excel\\Book1.xlsx");
		XSSFWorkbook wrkbk=new XSSFWorkbook(fileinput);
		  sheet=wrkbk.getSheet("Sheet1");
	}
	
	public String readExcel(int row,int col)
	{
		  
		  Row r=sheet.getRow(row);
		  Cell c=r.getCell(col);
		  int celltype=c.getCellType();
		  
		  switch(celltype)
		  {
		  case Cell.CELL_TYPE_NUMERIC:
		  {
			  int numb=(int) c.getNumericCellValue();
			  return String.valueOf(numb);
		  }
		  case Cell.CELL_TYPE_STRING:
		  {
			  return c.getStringCellValue();
			
		  }
		  }
		  return null;
				  
		  
			/*
			 * if(col==0) { str=c.getStringCellValue();
			 * 
			 * } if(col==1) { int val=(int) c.getNumericCellValue();
			 * str=String.valueOf(val);
			 * 
			   } 
			*/ 
			
			 
		
			  
	}
			 
		  
	

}
