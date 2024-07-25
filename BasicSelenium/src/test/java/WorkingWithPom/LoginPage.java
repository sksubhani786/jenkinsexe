package WorkingWithPom;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(name = "Password")
	private WebElement PasswordTextField;
	
	@FindBy(css = "input[value='Log in']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement remembermeCheckbox;
	
	@FindBy(linkText  = "Forgot password?")
	private WebElement forgotpasswordlink;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//generate getter method - right click -click on source-click on getter stters-click on getters-click on generate
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getRemembermeCheckbox() {
		return remembermeCheckbox;
	}

	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}
	
	

}
