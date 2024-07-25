package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {
@Test
	public void testcase02() throws Throwable {
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.burgerking.in/");
		Thread.sleep(3000);

		WebElement cartoption = driver.findElement(By.xpath("//span[text()='Cart']"));
		
		Actions act = new Actions(driver);
		
		act.click(cartoption).build().perform();
		
		Alert alt = driver.switchTo().alert();
		
		String message = alt.getText();
		System.out.println(message);
		
		alt.accept();
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
