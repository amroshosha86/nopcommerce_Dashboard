package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.VendorsPage;

public class VendorsTest extends TestBase {

	LoginPage Loginobj; 
	VendorsPage Vendorsobj;
	String VendorName="amro";
	String desc="amro";
		String VendorMail="amro@gmail.com";


	
	@Test(priority = 0 , alwaysRun = true)
	public void usercanlogin() {
		Loginobj=new LoginPage(driver);
		Loginobj.loginPage();

	}


	@Test(priority = 1)
	public void Admincanaddvendors() throws InterruptedException {
		
		driver.navigate().to("https://admin-demo.nopcommerce.com/Admin/Vendor/Create");
		Vendorsobj=new VendorsPage (driver);
		Vendorsobj.VendorsForm(VendorName,desc, VendorMail);
		
	}
}
