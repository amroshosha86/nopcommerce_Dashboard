package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class VendorsPage extends PageBase {

	public VendorsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="Name")
	WebElement NameTextbox ;


	@FindBy(css="#tinymce")
	WebElement descTextBox ;





	@FindBy(id="Email")
	WebElement EmailTextbox ;

	@FindBy(name="save")
	WebElement SaveBtn ;


	public void VendorsForm(String VendorName ,String descTextBoxUser ,    String VendorMail) throws InterruptedException
	{
		Thread.sleep(3000);
		Settext(NameTextbox, VendorName);
		Settext(descTextBox, descTextBoxUser);
		Settext(EmailTextbox, VendorMail);
		SaveBtn.click();

	}

}
