package PopupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_FileuploadPopupRobotclass {

	public static void main(String[] args) throws InterruptedException, Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636:");
		Thread.sleep(3000);
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(aboutus).perform();
		
		
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//select
		StringSelection s = new StringSelection("C:\\Users\\Dell\\Desktop\\New folder\\2. Introduction to Web application.pdf");
		//copy
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		cb.setContents(s, null);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
