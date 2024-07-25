package PopupHandling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	
@Test
	public void testcase03() throws Throwable {
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/partner-with-us");
		
		WebElement frequentlyaskques = driver.findElement(By.xpath("//div[text()='Frequently asked questions']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(frequentlyaskques).build().perform();
		Thread.sleep(3000);
		act.moveToElement(frequentlyaskques).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       
	       js.executeScript("arguments[0].scrollIntoView(false)", frequentlyaskques);
	       Thread.sleep(3000);
		File src = frequentlyaskques.getScreenshotAs(OutputType.FILE);
		
		
		File trg = new File("./ScreenShot/frequentlyaskques12.png");
		
		FileHandler.copy(src, trg);
		
		
		driver.close();
		
		
		
		
		

	
	}

}
