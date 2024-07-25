package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Example_ScreenShot {

	private static final String FIle = null;

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.royalenfield.com/");
		
		driver.findElement(By.id("customGDPR")).click();
		Thread.sleep(4000);
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		
		File src = ts.getScreenshotAs(OutputType.FILE);
	
		File trg = new File("./ScreenShot/royalenfield1.png");
		FileHandler.copy(src, trg);*/
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement flipkartcart = driver.findElement(By.xpath("//a[text()='Cart']/.."));
		
		File src = flipkartcart.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShot/flipkartcart12.png");
		
		FileHandler.copy(src, trg);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
