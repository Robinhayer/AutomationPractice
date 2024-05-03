package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage{
    WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		super(driver);	
	}
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	WebElement logo;
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement btn_Products;

	@FindBy(xpath="//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")
	WebElement btn_Cart;

	@FindBy(xpath="(//a[normalize-space()='Signup / Login'])[1]")
	WebElement btn_Login_Signup;
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement btn_Delete;
	
	@FindBy(xpath="//header[@id='header']//li[10]//a[1]")
	WebElement txt_LoggedIn;

	public boolean CheckLogoPrescence() 
	{{
	   try
	   {
		   return(logo.isDisplayed());
	   }
	   catch(Exception e)
	   {
		   return(false);
	   }
	}
	}
	public void ClickOnProducts()
	{
		btn_Products.click();
	}
	public void CLickonCart()
	{
		btn_Cart.click();
	}
	public void clickOnLogin_Signup()
	{
		btn_Login_Signup.click();
	}
	public void ClickonDelete()
	{
		btn_Delete.click();
	}
	public WebElement  GetLoggedInText()
	{
		
		return txt_LoggedIn;
	}
}
