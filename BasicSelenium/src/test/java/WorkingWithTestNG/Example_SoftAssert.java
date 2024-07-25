package WorkingWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_SoftAssert {
	@Test
	public void testcase() { 
	SoftAssert sa = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		sa.assertEquals(driver.getTitle(), "OrangeHRM");
		//System.out.println("Home Page Is Displayed");
		Reporter.log("Home Page Is Displayed");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		sa.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		//System.out.println("login is successfully");
		Reporter.log("login is successfully");
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		sa.assertTrue(driver.getCurrentUrl().contains("login"));
		//System.out.println("logout is successfully");
		Reporter.log("logout is successfully");
		driver.close();
		sa.assertAll();
	}
	
	
	
	

}
