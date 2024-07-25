package PopupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_WindowPopup2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(3000);

driver.get("https://www.barbequenation.com/");

WebElement link = driver.findElement(By.xpath("//span[@class='fa fa-facebook fa-lg']"));

Actions act = new Actions(driver);
act.scrollToElement(link).perform();
Thread.sleep(3000);







	}

}
