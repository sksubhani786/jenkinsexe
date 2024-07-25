package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_ScrollToWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(3000);
        
        WebElement hillrailways = driver.findElement(By.xpath("//label[text()='HILL RAILWAYS']"));
        
        
        Actions act = new Actions(driver);
        
        act.scrollToElement(hillrailways).perform();
        
        
        
	}

}
