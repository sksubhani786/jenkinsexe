package PopupHandling;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WindowPopup1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println("main page title:"+driver.getTitle());
		String mainid = driver.getWindowHandle();
		System.out.println("main ID:"+mainid);
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Set<String> alltabsid = driver.getWindowHandles();
		
		//System.out.println("count:"+alltabsid.size());
		//System.out.println(alltabsid);
		
		for(String id :alltabsid) {
		driver.switchTo().window(id);
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		}
		driver.switchTo().window(mainid);
		driver.quit();
	}

}
