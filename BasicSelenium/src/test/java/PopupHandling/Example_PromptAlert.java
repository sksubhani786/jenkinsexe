package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_PromptAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		String msg = driver.switchTo().alert().getText();
		
		System.out.println("alert msg:"+msg);
		//valve
		driver.switchTo().alert().sendKeys("selenium123");
		//to click ok button
		driver.switchTo().alert().accept();
		
		String resultmsg = driver.findElement(By.id("result")).getText();
		System.out.println("alert msg:"+resultmsg);

	}

}
