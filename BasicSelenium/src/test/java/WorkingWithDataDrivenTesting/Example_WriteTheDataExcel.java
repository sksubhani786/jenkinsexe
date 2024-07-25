package WorkingWithDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_WriteTheDataExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\TestData-Selenium\\Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		
		Sheet sh = book.getSheet("Sheet2");
		
		sh.createRow(0).createCell(0).setCellValue("priyanka");
		sh.createRow(1).createCell(0).setCellValue("mohit");
		sh.createRow(2).createCell(0).setCellValue("chaitanya");
		
		FileOutputStream fos = new FileOutputStream("‪C:\\Users\\Dell\\Documents\\TestData-Selenium\\Book1.xlsx");
		//write the data to excel
		book.write(fos);
		//compulsory for save the data
		fos.flush();
		
		
		
		

	}

}
