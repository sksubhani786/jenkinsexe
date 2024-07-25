package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Book a Free Demo")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#Form_getForm_FullName")).sendKeys("KHAJA");
		driver.findElement(By.cssSelector("#Form_getForm_Email")).sendKeys("skkhaja@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Company Name']")).sendKeys("iictechnologies");
		driver.findElement(By.cssSelector("[placeholder='Phone Number*']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("rc-anchor-center-item rc-anchor-checkbox-label")).click();
		
		
		

	}

}
