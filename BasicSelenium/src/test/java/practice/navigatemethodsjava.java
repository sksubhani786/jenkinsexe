package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigatemethodsjava {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.myntra.com");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
}