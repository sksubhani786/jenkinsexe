package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static void main(String[] args) {
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		/*driver.findElement(By.id("user-name")).sendKeys(""");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();*/
		
		
	//driver.get("https://www.amazon.in/");
		
	/*driver.findElement(By.name("field-keywords")).sendKeys("puma");
	driver.findElement(By.id("nav-search-submit-button")).click();*/
		
		//driver.get("https://www.flipkart.com/");
		
		/*driver.findElement(By.name("q")).sendKeys("nike");
		driver.findElement(By.className("_2iLD__")).click();

		driver.findElement(By.linkText("Mobiles")).click();*/
		
		
		/*driver.findElement(By.linkText("Amazon miniTV")).click();
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Today's Deals")).click();*/
		/*driver.findElement(By.cssSelector("[aria-label='Search Amazon.in']")).sendKeys("bluetooth");*/
		
		/*driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("secret_sauce");*/
        //driver.findElement(By.cssSelector("[alt='Travel']")).click();
		
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("#login-button")).click();
		
		//driver.findElement(By.cssSelector("input#login-button")).click();
	
	//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("goldpendent");
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
