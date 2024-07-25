package WorkingWithTestNG;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_HardAssert {
	@Test
	public void testcase() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		
		System.out.println("Demo Web Page Is Displayed");
		driver.findElement(By.partialLinkText("Books")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
		System.out.println("Books Page Is Displayed");
		Object actualname = driver.findElement(By.xpath("//a[text()='Fiction EX']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private Object findElement(By partialLinkText) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
