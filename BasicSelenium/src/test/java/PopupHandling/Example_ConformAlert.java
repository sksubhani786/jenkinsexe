package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ConformAlert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alt = driver.switchTo().alert();
		//to feach the msg
		String msg = alt.getText();
		System.out.println(msg);
		//to click cancel button
		alt.dismiss();
		
		String resultmsg = driver.findElement(By.id("result")).getText();
		System.out.println(resultmsg);
		
		driver.close();
		
		
		
		
		
		

	}

}
