package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://hvr-amazon.my.site.com/BBJobDetails?isapply=1&reqid=a0R4U00000TzjAVUAZ&shiftId=null");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='j_id0:portId:j_id162:j_id205:0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_id0:portId:j_id162:continue2']")).click();
		driver.findElement(By.xpath("https://hvr-amazon.my.site.com/BBJobDetails?isapply=1&reqid=a0R4U00000TzjAVUAZ&shiftId=null")).click();
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("robinhayer09@gmail.com");
	

	}

}
