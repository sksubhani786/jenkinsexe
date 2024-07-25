package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
	

		class InsertDAtaToProperties_File {

			public void main(String[] args) throws Throwable {
			//Inserting data to Properties_File	
				 Properties pro = new Properties();
				 pro.setProperty("url", "https://www.saucedemo.com/v1/");
		         pro.setProperty("username", "standard_user");
		         pro.setProperty("password", "secret_sauce");
		         
		    FileOutputStream fos = new FileOutputStream("./Properties_File2pm.properties");
		    pro.store(fos, "CommonData");
		  
		    //Fetching data from Properties_file 
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		    FileInputStream fis = new FileInputStream("./Properties_File2pm.properties");
		   	Properties pro1 = new Properties();
		   	pro1.load(fis);
		   	String URL = pro1.getProperty("url");
		   	String USERNAME = pro1.getProperty("username");
		   	String PASSWORD = pro1.getProperty("password");
		   	
		   	driver.get(URL);
		   	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		   	driver.findElement(By.name("password")).sendKeys(PASSWORD);
		   	driver.findElement(By.className("btn_action")).click(); 
		    
			}

		}

	}

}
