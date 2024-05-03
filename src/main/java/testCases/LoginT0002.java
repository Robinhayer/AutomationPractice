package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.AccontRegistrationPage;
import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class LoginT0002 extends BaseClass
{ 
	Faker faker=new Faker();


	 
	  @Test(priority=1)
	  public void CheckHomePageLogo() throws InterruptedException
	  {
		  logger.debug("Application Logs.....");
		  logger.info("******    Starting AccountRegistrationT0001   *************");
		  HomePage hp=new HomePage(driver);
		  hp.CheckLogoPrescence();
		  logger.info("logo is present");
		  
	  }
	  @Test(priority=2)
	  public void LoginWithInavlid()
	  {
		  try 
		  {
			  AccontRegistrationPage ap=new AccontRegistrationPage(driver);
			  ap.ClickLogin_Signup();
			  ap.setLoginEmail(faker.internet().emailAddress());
			  ap.setLoginPassword(faker.internet().password());
			  ap.ClickOnLogin();
			  Assert.assertEquals(ap.EmailPWDIncroeect().getText(),"Your email or password is incorrect!");
			  
		  }
		  catch(Exception e)
		  {
			  Assert.fail();
		  }
	  }
}