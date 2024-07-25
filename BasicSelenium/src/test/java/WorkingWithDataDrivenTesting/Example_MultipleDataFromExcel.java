package WorkingWithDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_MultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\TestData-Selenium\\Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		
		int lastrownumber = sh.getPhysicalNumberOfRows();
		System.out.println("last row number:" + lastrownumber);
		int lastcellnumber = sh.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("last cell number:" + lastcellnumber);
		
		for (int i = 0; i < lastrownumber; i++) {
			
			for (int j = 0; j < lastcellnumber; j++) {
				
				
				System.out.println(sh.getRow(i).getCell(j).toString() + " ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
