package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		//driver.get("https://www.amazon.in/");
        //driver.manage().window().maximize();
        //driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']")).click();
        
        //driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
        
        /*driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("bluetooth");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
       String name = driver.findElement(By.xpath("//span[text()='Boult Audio Curve Max Bluetooth Earphones with 100H Playtime, Clear Calling ENC Mic, Dual Device Connectivity, Lowest Latency Gaming, 13mm Bass Driver, Made in India Neckband Wireless Earphone (Black)']")).getText();
        
        System.out.println(name);*/
        
        driver.get("https://www.amazon.in/");
        /*driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
        driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
        String name = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']")).getText();
        System.out.println(name);*/
        
	}

}
