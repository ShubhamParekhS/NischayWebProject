package TestTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testLogin {
	
	private static String username="txt_check_email";
	private static String password="txt_check_password";
	private static String loginButton="btn_submit";
	WebDriver driver;
	 
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://gateway-frontend-a8pg.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void Login()
	{
		driver.findElement(By.id(username)).sendKeys("himanshu@gmail.com");
		driver.findElement(By.id(password)).sendKeys("123456");
		driver.findElement(By.id(loginButton)).click();
		
		
	}

}
