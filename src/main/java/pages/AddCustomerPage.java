package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends PageBase {

	public AddCustomerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="Email")
	WebElement EmailTextBox;

	@FindBy(id="Password")
	WebElement PasswordTextBox;

	@FindBy(id="FirstName")
	WebElement FirstNameTextBox;

	@FindBy(id="LastName")
	WebElement LastNameTextBox;

	@FindBy(id="Gender_Male")
	WebElement Gender;

	@FindBy(id="DateOfBirth")
	WebElement DateOfBirthTextBox;

	@FindBy(id="Company")
	WebElement CompanyTextBox;

	//@FindBy(xpath="//div[@id='customer-info']/div[2]/div/div[9]/div[2]/div/div/div")
	@FindBy(css="div.k-widget.k-multiselect.k-multiselect-clearable ")
	
	WebElement NewsLetterselectBox;

	@FindBy(xpath="//ul[@id='SelectedNewsletterSubscriptionStoreIds_listbox']/li")
	WebElement AutoComplete;

	@FindBy(id="VendorId")
	WebElement selectvendr;

	@FindBy(id="AdminComment")
	WebElement AdminComment;

	@FindBy(name="save")
	WebElement SaveForm;
	
	@FindBy(css=" div.alert.alert-success.alert-dismissable")
	public WebElement CustomerAddsucessmessage;







	public void CustomerForm
	(	
			String CustomerEmail , 
			String CustomerPassword ,
			String CustomerFirstName ,
			String CustomerLastName ,
			String DateOfBirth,
			String CustomerCompany,
			String Comment



			) throws InterruptedException

	{
		Thread.sleep(500);
		Settext(EmailTextBox, CustomerEmail);
		Settext(PasswordTextBox, CustomerPassword);
		Settext(FirstNameTextBox, CustomerFirstName);
		Settext(LastNameTextBox, CustomerLastName);
		Gender.click();
		Settext(DateOfBirthTextBox, DateOfBirth);
		Settext(CompanyTextBox, CustomerCompany);
		NewsLetterselectBox.click();
		AutoComplete.click();
		select=new Select(selectvendr);
		select.selectByVisibleText("Vendor 2");
		Settext(AdminComment, Comment);
		Thread.sleep(500);
		SaveForm.click();




	}

}
