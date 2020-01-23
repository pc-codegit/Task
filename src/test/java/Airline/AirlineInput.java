package Airline;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AirlineInput {
	
		
		//public static void main(String[] args) throws Throwable {
			

		
	public static String AirlineInput(int row, int cell) throws Throwable {
			
			File f = new File("C:\\Users\\PRETHIK\\eclipse-workspace\\Testing\\Excel report\\AirlineInput.xlsx");
			
			FileInputStream i = new FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(i);
			
			Sheet s = w.getSheet("Sheet1");
			
			Row r = s.getRow(1);
			
			Cell c = r.getCell(0);
			
			String v = c.getStringCellValue();
			
	System.out.println(c);
	return v;

}
}
