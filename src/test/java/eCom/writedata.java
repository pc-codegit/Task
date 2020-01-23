package eCom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {
	
	public static void writedata(List<String> page1) throws IOException
	{
		FileOutputStream f = new FileOutputStream("C:\\Users\\PRETHIK\\eclipse-workspace\\Testing\\Excel report\\Listingtest1.xlsx");
	
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Item list");
		
		Row r = s.createRow(0);
		
		List<String> setCellValue = new ArrayList<String>();
		
		setCellValue.add("Item list");
		
		for(int j = 0 ; j<1 ; j++)
		{
			Cell c = r.createCell(j);
			c.setCellValue(setCellValue.get(j));
		}
		
		for(int i=1; i<=page1.size(); i++)
		{
			Row r1 = s.createRow(i);
			Cell c1 = r1.createCell(0);
			c1.setCellValue(page1.get(i-1));
			
		}
		
		
		w.write(f);
		
		
	}
}
