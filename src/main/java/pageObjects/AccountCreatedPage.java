package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountCreatedPage extends BasePage
{

	public AccountCreatedPage(WebDriver driver) {
		super(driver);
		
		
	}
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement btn_Continue;
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement txt_Account_Deleted;
	
	public void ClickonContinue()
	{
		btn_Continue.click();
	}
	
	public boolean CheckAccountDeleted()
	{
		try
		{
			return(txt_Account_Deleted.isDisplayed());	
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	

}
