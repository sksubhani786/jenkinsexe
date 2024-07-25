package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exapmle_IframeHandling {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://the-internet.herokuapp.com/iframe");
		//only one frame is available thats why use to 0
		//driver.switchTo().frame(0);
		WebElement frametext = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));
		driver.switchTo().frame(frametext);
		//driver.switchTo().frame("mce_0_ifr");
		/*String msg = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
		System.out.println(msg);
		
		driver.close();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
