package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ScrollIntoView {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.zomato.com/partner-with-us");
       Thread.sleep(3000);
       
       WebElement target = driver.findElement(By.xpath("//div[text()='Frequently asked questions']"));
       
       
       Actions act = new Actions(driver);
       
      
	JavascriptExecutor js = (JavascriptExecutor) driver;
      
	js.executeScript("arguments[0].scrollIntoView(true);",target);
	 Thread.sleep(3000);
	 js.executeScript("arguments[0].scrollIntoView(false);",target);
       
	}

}
