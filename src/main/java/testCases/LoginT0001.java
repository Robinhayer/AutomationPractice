package testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.AccontRegistrationPage;
import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class LoginT0001 extends BaseClass
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
	  public void Login()
	  {
		  try 
		  {
			  AccontRegistrationPage ap=new AccontRegistrationPage(driver);
			  ap.ClickLogin_Signup();
			  ap.setLoginEmail(rb.getString("email"));
			  ap.setLoginPassword(rb.getString("pwd"));
			  ap.ClickOnLogin();
			  HomePage hp=new HomePage(driver);
			  WebElement txt=hp.GetLoggedInText();
			  Assert.assertEquals(txt.getText(), "Logged in as Robby");
			  
		  }
		  catch(Exception e)
		  {
			  Assert.fail();
		  }
	  }
	  @Test(dependsOnMethods="Login")
	  void DeleteAccount()
   {
		  try 
		 {
		  AccountCreatedPage acp= new AccountCreatedPage(driver);
		 
		  HomePage hp=new HomePage(driver);
		  hp.ClickonDelete();
		  Assert.assertTrue(acp.CheckAccountDeleted());
		 }
		 catch(Exception e)
		 {
			 Assert.fail();
		 }
		 }
}
