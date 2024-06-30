package pageObjects;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.javafaker.Name;

public class AccontRegistrationPage extends BasePage 
{
	public AccontRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	WebElement logo_img;
	@FindBy(xpath="(//a[normalize-space()='Signup / Login'])[1]")
	WebElement btn_Login_Signup;
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement Signup_Name;
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement Signup_email;
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement btn_Signup;
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement Login_email;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Login_Password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_Login;
	@FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']")
	WebElement Email_Pwd_INcoreect;
	public void setLoginEmail(String email)
	{
		Login_email.sendKeys(email);
	}
	public void setLoginPassword(String pwd)
	{
		Login_Password.sendKeys(pwd);
	}
	public void ClickLogin_Signup()
	{
		btn_Login_Signup.click();
	}
	public void setSignupName(String string)
	{
		Signup_Name.sendKeys(string);
	}
	public void setSignupEmail(String email)
	{
		Signup_email.sendKeys(email);
	}
    public void ClickSignup()
    {
    	btn_Signup.click();
    }
	public void ClickOnLogin()
	{
		btn_Login.click();
	}
	public WebElement  EmailPWDIncroeect()
	{
		
		return Email_Pwd_INcoreect;
	}

}
