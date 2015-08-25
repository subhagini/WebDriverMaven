package webDriver_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		 driver= new FirefoxDriver();
	}
	@Test
	public void Login() throws InterruptedException
	{
	driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	driver.findElement(By.id("Email")).sendKeys("subhagini.chaudhary@gmail.com");
	driver.findElement(By.id("next")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Passwd")).sendKeys("fdhdh");
	}
@AfterTest
public void TearDown()
{
	driver.quit();
}
}
