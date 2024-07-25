package WorkingWithDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_ExcelFile {

	public static void main(String[] args) throws Throwable {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\TestData-Selenium\\Book1.xlsx");
		//acess the work book
		Workbook book = WorkbookFactory.create(fis);
		//acess the sheet
		Sheet sh = book.getSheet("Sheet1");
		//acess the row
		Row row = sh.getRow(1);
		//acess the cell
		Cell cell = row.getCell(0);
		//string data
		String value1 = cell.getStringCellValue();
		System.out.println(value1);
		//number data
		double value2 = sh.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
