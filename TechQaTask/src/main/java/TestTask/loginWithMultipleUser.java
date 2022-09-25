package TestTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginWithMultipleUser {
	
	private static String username="";
	private static String password="";
	private static String submit="";
	
	
	@Test
	public void verifyCredentials(String Scenario,String username, String password)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHUBHAM\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.findElement(By.id(username)).sendKeys("");
		driver.findElement(By.id(password)).sendKeys("");
		driver.findElement(By.id(submit)).click();
		
		if(Scenario.equals("bothcorrect"))
		{
			WebElement bothCorrectElement=driver.findElement(By.id(""));
			Assert.assertTrue(bothCorrectElement.isDisplayed());
		}
		if(Scenario.equals("bothwrong"))
		{
			WebElement bothWrongElement=driver.findElement(By.id(""));
			Assert.assertTrue(bothWrongElement.isDisplayed());
		}
		
	}
	public Object[][] getData()
	{
		
		return new Object[][] {
			
			
			
			    {"bothcorrect","himanshu@@gmail.com","123456"},
			    
				{"bothwrong","sparekh@gmail.com","111@abc"},
				{"bothwrong","sparekh1@gmail.com","111@abc"},
				{"bothwrong","sparekh2@gmail.com","111@abc"},
				{"bothwrong","sparekh3@gmail.com","111@abc"},
				{"bothwrong","sparekh4@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				
				
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				{"bothwrong","sparekh5@gmail.com","111@abc"},
				
				
			
		};
				
	}

}
