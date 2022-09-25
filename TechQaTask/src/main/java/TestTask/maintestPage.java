package TestTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class maintestPage {
	
	private static String clickAddQuestion="Add Question";
	private static String search="txt_search";
	private static String logoutButton="Logout";
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
	public void verifyTabs()
	{
		WebElement elementButton=driver.findElement(By.id(clickAddQuestion));
		elementButton.isDisplayed();
		WebElement elementSearch=driver.findElement(By.id(search));
		elementSearch.isDisplayed();
		driver.findElement(By.id(logoutButton)).click();
		
		
	}

}
