package WorkingWithDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Example_PropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\TestData-Selenium\\commondata.properties");

		
		Properties pobj  = new Properties();
		pobj.load(fis);
		
		String value1 = pobj.getProperty("uri");
		System.out.println("url :"+ value1);
		String value2 = pobj.getProperty("email");
		System.out.println("email :" + value2);
		String value3 = pobj.getProperty("password");
		System.out.println("password :" + value3);
		
		
	}

}
