package eCom;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readinput {
	

public static String inPutdata(int row, int cell) throws Throwable {
		
		File f = new File("C:\\Users\\PRETHIK\\eclipse-workspace\\Testing\\Excel report\\InPut data.xlsx");
		
		FileInputStream i = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(i);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
System.out.println(c);

return null;

}
}
