package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.AccontRegistrationPage;
import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import pageObjects.SignupPage;
import testBase.BaseClass;

public class AccountRegistrationT0001 extends BaseClass 
{ Faker faker=new Faker();


 
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
  void CreateAccount() throws InterruptedException
  {
  
	 try {
	 
	  AccontRegistrationPage ap=new AccontRegistrationPage(driver);
	  logger.info("Clicked on Login/Signup");
	  ap.ClickLogin_Signup();
	  logger.info("Clicked on signup");
	  ap.setSignupName(faker.name().firstName());
	  logger.info("Entered FirstName");
	  ap.setSignupEmail(faker.internet().emailAddress());
	  logger.info("Entered Lastname");
	  ap.ClickSignup();
	  logger.info("Clicked  On Signup");
	  SignupPage sp=new SignupPage(driver);
	  sp.SelectMaleGender();
	  logger.info("Selected Male Gender");
	  sp.SetPassword(faker.internet().password());
	  logger.info("Entered Password");
	  sp.SetDate("23");
	  sp.SetMonth("May");
	  sp.SetYear("2005");
	  logger.info("Entered DOB");
	  sp.EnterFirstName(faker.name().firstName());
	  logger.info("Entered FirstName");
	  sp.EnterLastName(faker.name().lastName());
	  logger.info("Entered LastName");
	  sp.EnterCompany("Docomo");
	  logger.info("Enter Comapny Name");
	  logger.info("Now Entering Adrress");
	  sp.EnterAddress("Batala,Punjab,india");
	  sp.EnterAddress2("Kotla");
	  sp.SelectCountry("Canada");
	  sp.SelectState("Punjab");
	  sp.SelectCity("Batala");
	  sp.EnterZipCode("143505");
	  sp.EnterNumber("521536");
	  logger.info("Address Entered");
	  sp.ClickCreateAccount();
	  logger.info("Clicked on Create Account");
	  boolean exp=sp.AccountCreatedSuccessfully();
	  
	  if(exp==true)
		  {
		  logger.info("Logo is Present");
		  Assert.assertTrue(true);
		  }
	  else
	  {
		  Assert.fail();
	  }
	 }
	 catch(Exception e)
	 {
		 Assert.fail();
		 logger.error("Test Failed");
	 }
	
	 logger.info("******    FinshedtRegistrationT0001   *************");
  }
  @Test(dependsOnMethods="CreateAccount")
	 void DeleteAccount()
	 {try 
	 {
	  AccountCreatedPage acp= new AccountCreatedPage(driver);
	  acp.ClickonContinue();
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
