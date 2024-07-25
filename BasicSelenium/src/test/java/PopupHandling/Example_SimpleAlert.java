package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_SimpleAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	
	WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	
	
	Actions act = new Actions(driver);
	
	act.contextClick(rightclickbutton).build().perform();
	
	WebElement quitoption = driver.findElement(By.xpath("//span[text()='Quit']"));
	
	act.click(quitoption).build().perform();
	
	Alert alt = driver.switchTo().alert();
	
	String message = alt.getText();
	System.out.println(message);
	alt.accept();
	
	}

}
