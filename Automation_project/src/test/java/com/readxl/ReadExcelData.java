package com.readxl;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	String testData="-------";
	@Test
	public List<String>readData(int col) {
		FileInputStream read=new FileInputStream("File location");
		XSSFWorkbook book=new XSSFWorkbook(read);
		XSSFSheet sheet= book.getSheet(testData);
		Iterator<Row> rowIterator=sheet.iterator();
		rowIterator.next();
		List<String> list=new ArrayList<>();
		//hasnext()-returns true if the Iterator contains more number of element during
		//during traversing the given list.
		while (rowIterator.hasNext())
		{rowIterator.next().getCell(col).getStringCellValue();}
		
	}

}
