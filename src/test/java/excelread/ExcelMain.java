package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String sa=ExcelCode.readStringData(0, 0);
		System.out.println(sa);
		String sb=ExcelCode.readIntegerData(0, 1);
		System.out.println(sb);
	}

}
