package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_JavaScriptDocument {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
           driver.get("https://demowebshop.tricentis.com/login");
	       
	       Thread.sleep(3000);
	       
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       
	      // js.executeScript("document.getElementsByClassName('email')[0].valve='sksubhani550@gmail.com';");
	       WebElement emailbox = driver.findElement(By.xpath("//input[@id='Email']"));
	       Thread.sleep(3000);
	       js.executeScript("document.getElementsByName('Password')[0].value='asdfxc';");
	       Thread.sleep(3000);
	 js.executeScript("document.getElementsByClassName('button-1 login-button')[0].click();");
	 
	 js.executeScript("argument[0], emailbox)"
	 
	 
	 
	 
	}

}
