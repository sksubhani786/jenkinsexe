package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
/*driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();	
WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
search.sendKeys("puma");
search.submit();*/
	
	/*driver.get("https://www.saucedemo.com/v1/");	
	driver.manage().window().maximize()	;
	WebElement username = driver.findElement(By.id("user-name"));
	username.sendKeys("subhani");
	Thread.sleep(1000)	;
	username.clear();
	username.sendKeys("standard_user")	;*/
		
	/*driver.get("https://www.amazon.in/");	
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	System.out.println(ele.getLocation().getX());
	System.out.println(ele.getLocation().getY());
System.out.println(ele.getSize().getHeight());
System.out.println(ele.getSize().getWidth());
System.out.println(ele.getRect().getX());
System.out.println(ele.getRect().getY());
System.out.println(ele.getRect().getWidth());
System.out.println(ele.getRect().getHeight());
		
	
	WebElement searchbar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	
	if (searchbar.isEnabled())
	{
		searchbar.sendKeys("puma");
	}
	else {
		System.out.println("not enabled");
	}
	*/
	
/*driver.get("https://www.facebook.com/");
	
WebElement logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));	
	
	if (logo.isDisplayed()) 
	{
		System.out.println("logo is present");
	}
	else {
		System.out.println("logo is not disabled");
	}
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(1000);
	WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Male']"));
	
	radiobutton.click();
	if (radiobutton.isSelected())
	{
	System.out.println("radio button is selected");	
	}
	
	else 
	{
		System.out.println("radio button is not selected");
	}*/
		
	driver.get("https://www.amazon.in/");	
	/*driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.name("field-keywords"));
		
		System.out.println(ele.getAttribute("href"));*/
		
		WebElement link = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		
		System.out.println(link.getAriaRole());
		System.out.println(link.getAccessibleName());
		System.out.println(link.getTagName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
