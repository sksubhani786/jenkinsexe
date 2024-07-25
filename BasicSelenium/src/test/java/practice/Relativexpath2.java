package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relativexpath2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("iphone");
        driver.findElement(By.xpath("//button[contains(@aria-label,'Search')]")).click();
        List<WebElement> names = driver.findElements(By.xpath("//div[contains(@class,'KzDlHZ')]"));
        
        for (WebElement name : names)
        {
		System.out.println(name.getText());	
		}*/
        
    
      driver.get("https://www.amazon.in/");
       driver.manage().window().maximize(); 
	driver.findElement(By.xpath("//input[contains(@aria-label,'Se')]")).sendKeys("bluetooth");
	driver.findElement(By.xpath("//input[contains(@type,'s')]")).click();
	
	
	

	
	
	

	}
	
	}
