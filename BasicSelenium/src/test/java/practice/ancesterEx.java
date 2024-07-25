package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ancesterEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		String data = driver.findElement(By.xpath("//div[text()='July 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='17']")).getText();

		System.out.println(data);
	}
	

}
