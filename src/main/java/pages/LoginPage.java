package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement loginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement logoutBtn;
	
	public void loginPage()
	{
		loginBtn.click();
	}
	
	public void Logout()
	{
		logoutBtn.click();
	}
	
}
	
	
