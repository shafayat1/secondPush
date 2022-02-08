package launchBrowser2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LaunchTF {
	WebDriver driver;
	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void loginTest() {
		
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo@techfios.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Bank & Cash')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
	driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Yousuf");
	driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Checking AC");
	driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("9000");
	driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("00088866778889");
	driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("987654321");
	driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("12345689");
	driver.findElement(By.xpath("//button[@type='submit'and @ class='btn btn-primary']")).click();
//	
//	String str = "Dashboard";
//	//By DashboardHeader = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
//	//WebElement DashboardHeader =driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
//	WebElement DashboardHeader =driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));
//	//Assert.assertEquals("wrong page",str, DashboardHeader.getText());
//	//Assert.assertEquals("Dashboard page not found!!", str, DashboardHeader.getText());
//	assert.assert
//	System.out.println(str);
//		
		
	}
}
