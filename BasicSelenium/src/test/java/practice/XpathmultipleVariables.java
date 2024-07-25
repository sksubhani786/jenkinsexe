package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathmultipleVariables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in' and @aria-label='Search Amazon.in']")).sendKeys("puma");
		//driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-a' or @ type='submit']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'fi') and @placeholder='Search Amazon.in']")).sendKeys("nike");
		

	}

}
