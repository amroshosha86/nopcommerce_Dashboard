package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	public Select select;
	public Actions action;
	public JavascriptExecutor jse ; 

	//Create constructor
	public PageBase (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void Clickbuttons(WebElement button)
	{
		button.click();
	}
	
	protected static void Settext(WebElement textElement , String value)
	{
		textElement.sendKeys(value);
	}
	
	



}
