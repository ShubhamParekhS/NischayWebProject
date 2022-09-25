package TestTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testSignUp {
	private static String signUp="//*[@id=\"root\"]/div/div[2]/div[2]/form/p/a";
	private static String firstName="txt_firstname";
	private static String lastName="txt_lastname";
	private static String address="txt_address";
	private static String emailAdress="txt_email";
	private static String password="txt_password";
	private static String signUpButton="btn_submit";
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
	public void SignUp()
	{
		driver.findElement(By.xpath(signUp)).click();
		driver.findElement(By.id(firstName)).sendKeys("shubham");
		driver.findElement(By.id(lastName)).sendKeys("parekh");
		driver.findElement(By.id(address)).sendKeys("Gandhinagar");
		driver.findElement(By.id(emailAdress)).sendKeys("sparekh@yahoo.com");
		driver.findElement(By.id(password)).sendKeys("password");
		driver.findElement(By.id(signUpButton)).click();
		
		
	}

}
