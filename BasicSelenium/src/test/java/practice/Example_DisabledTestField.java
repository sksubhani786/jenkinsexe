package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_DisabledTestField {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demoapp.skillrary.com/index.php");
	       Thread.sleep(3000);
	       
	       WebElement disabledtextfield = driver.findElement(By.xpath("//input[@class='form-control']"));
	       
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       
	       
	       js.executeScript("arguments[0].value='subhani';", disabledtextfield);
	       
	       
	       
	       
	}

}
