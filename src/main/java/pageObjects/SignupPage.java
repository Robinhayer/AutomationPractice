package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage{
    WebDriver driver;
	public SignupPage(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	WebElement AccountHeader;
	@FindBy(xpath="//div[@id='uniform-id_gender1']")
	WebElement btn_Male;
	@FindBy(xpath="//input[@id='id_gender2']")
	WebElement btn_Female;
	@FindBy(xpath="//input[@id='name']")
	WebElement txt_Name;
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_Email;
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_Password;
	@FindBy(xpath="//select[@id='days']")
	WebElement select_Day;
	@FindBy(xpath="//select[@id='months']")
	WebElement select_Month;
	@FindBy(xpath="//select[@id='years']")
	WebElement btn_Year;
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txt_Fname;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement txt_Lname;
	@FindBy(xpath="//input[@id='company']")
	WebElement txt_Company;
	@FindBy(xpath="//input[@id='address1']")
	WebElement txt_Address;
	@FindBy(xpath="//input[@id='address2']")
	WebElement txt_Address2;
	@FindBy(xpath="//select[@id='country']")
	WebElement select_Country;
	@FindBy(xpath="//input[@id='state']")
	WebElement txt_State;
	@FindBy(xpath="//input[@id='city']")
	WebElement txt_City;
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement txt_Zipcode;
	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement txt_Number;
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement btn_CreateAccount;
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement acc;
	public boolean EnterAccountInfo()
	{
		{
			try
			{
				return(AccountHeader.isDisplayed());
				
			}
			catch(Exception e)
			{
				return(false);
			}
		}
	}
	public void SelectMaleGender()
	{
		btn_Male.click();
	}
	public void SelectFemaleGender()
	{
		btn_Female.click();
	}
	public void SetPassword(String pwd)
	{
		txt_Password.sendKeys(pwd);
	}
	public void SetDate(String dt)
	{
		Select st=new Select(select_Day);
		st.selectByVisibleText(dt);
	}
	public void SetMonth(String mth)
	{
		Select st=new Select(select_Month);
		st.selectByVisibleText(mth);
	}
	public void SetYear(String yr)
	{
		Select st=new Select(btn_Year);
		st.selectByVisibleText(yr);
	}
	public void EnterFirstName(String fname)
	{
		txt_Fname.sendKeys(fname);
	}
	public void EnterLastName(String lname)
	{
		txt_Lname.sendKeys(lname);
	}
	public void EnterCompany(String cmp)
	{
		txt_Company.sendKeys(cmp);
	}
	public void EnterAddress(String ad)
	{
		txt_Address.sendKeys(ad);
	}
	public void EnterAddress2(String ad2)
	{
		txt_Address2.sendKeys(ad2);
	}
	public void SelectCountry(String ct)
	{
		Select st=new Select(select_Country);
		st.selectByVisibleText(ct);
	}
	public void SelectState(String state)
	{
		txt_State.sendKeys(state);
	}
	public void SelectCity(String city)
	{
		txt_City.sendKeys(city);
	}
	public void EnterZipCode(String zp)
	{
		txt_Zipcode.sendKeys(zp);
	}
	public void EnterNumber(String nu)
	{
		txt_Number.sendKeys(nu);
	}
	public void ClickCreateAccount()
	{
		btn_CreateAccount.click();
	}
	public boolean AccountCreatedSuccessfully()
	{
		{
			try
			{
				return(acc.isDisplayed());
				
			}
			catch(Exception e)
			{
				return(false);
			}
		}
	}
	
}
