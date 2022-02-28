package excelreaderdemo;

import java.io.IOException;

public class ExcelMainDemo {

	public static void main(String[] args) throws IOException {

		ExcelCodingDemo obj=new ExcelCodingDemo();
		String ss=obj.readExcel(1,0);
		System.out.println(ss);
		String si=obj.readExcel(1, 1);
         System.out.println(si);
		
		
	}

}
