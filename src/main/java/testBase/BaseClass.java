package testBase;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

import com.github.javafaker.Faker;

public class BaseClass 
{   public ResourceBundle rb;
	public WebDriver driver;
	public Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{   
		logger=LogManager.getLogger(this.getClass());
		rb=ResourceBundle.getBundle("config");
		if(br.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(br.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();	
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
}
}



