package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.LoginPage;

public class AddCustmerTest extends TestBase {

	LoginPage Loginobj; 
	AddCustomerPage AddCustomerobj;
	String CustomerEmail="amro150@mail.com";
	String CustomerPassword="12345678";
	String CustomerFirstName="amro1";
	String CustomerLastName="Mohamed";
	String DateOfBirth="5/1/1986";
	String CustomerCompany="Roqay";
	String Comment="Test Comment";
	
	

	
	
	

	@Test(priority = 0 , alwaysRun = true)
	public void usercanlogin() {
		Loginobj=new LoginPage(driver);
		Loginobj.loginPage();

	}

	@Test(dependsOnMethods = {"usercanlogin"})
	public void UserCanAddnewcustomer() throws InterruptedException {

		driver.navigate().to("https://admin-demo.nopcommerce.com/Admin/Customer/Create");
		AddCustomerobj=new AddCustomerPage(driver);
		AddCustomerobj.CustomerForm(CustomerEmail, CustomerPassword, CustomerFirstName, CustomerLastName, DateOfBirth ,CustomerCompany,Comment);
		System.out.println(AddCustomerobj.CustomerAddsucessmessage.getText());
		Assert.assertTrue(AddCustomerobj.CustomerAddsucessmessage.getText().contains("The new customer has been added"));
	}
}
