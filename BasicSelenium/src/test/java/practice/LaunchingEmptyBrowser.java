package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();*/
		
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.myntra.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();

	}

}
