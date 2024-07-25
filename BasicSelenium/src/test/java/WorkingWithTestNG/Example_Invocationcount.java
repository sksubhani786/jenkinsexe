package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_Invocationcount {
	@Test(invocationCount = 5)
	public void testcase() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
