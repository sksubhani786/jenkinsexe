package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Example_ScrollByAmountHorizontal {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();				
driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");		
Thread.sleep(3000);	
		
Actions act = new Actions(driver)	;
		
	act.scrollByAmount(1500, 0).perform();
	Thread.sleep(3000);	
	act.scrollByAmount(-1800, 0).perform()	;
	Thread.sleep(3000);
	act.scrollByAmount(2000, 0).perform();
	Thread.sleep(3000);	
	act.scrollByAmount(-2500, 0).perform();
	Thread.sleep(3000);
	driver.close();
		
	}

}
