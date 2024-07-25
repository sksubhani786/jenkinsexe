package WorkingWithTestNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WorkingWithDataDrivenTesting.DataUtility;
import WorkingWithPom.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public DataUtility data_utility = new DataUtility();
	public HomePage home_page;
	public WebDriver driver;
public void launchbrowser() { 
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(data_utility.getdata);
}
		
	
	
	
	
	
	
	
	
	

}
