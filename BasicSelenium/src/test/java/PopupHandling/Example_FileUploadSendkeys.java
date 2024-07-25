package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_FileUploadSendkeys {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636:");
		Thread.sleep(3000);
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(aboutus).perform();
		
		
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\Dell\\Desktop\\New folder\\2. Introduction to Web application.pdf");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
