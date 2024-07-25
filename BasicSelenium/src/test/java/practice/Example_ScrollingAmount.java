package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ScrollingAmount {

	public static void main(String[] args) throws Throwable {
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, 800).perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, -300).perform();
		Thread.sleep(3000);
		act.scrollByAmount(0, -800).perform();
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
