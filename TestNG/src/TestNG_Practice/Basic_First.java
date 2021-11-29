package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Basic_First 
{
	 WebDriver driver;
  @Test
  public void facebook_login() throws Exception 
  {
	  
	  driver.findElement(By.id("email")).sendKeys("shruti.parkar41@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Shruti@123");
	  Thread.sleep(5000);;
	  driver.findElement(By.name("login")).click();
	  WebElement Errormsg=driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]"));
	  System.out.println("Error msg is:"+Errormsg.getText());
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Download Data\\Software\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
  }

  @AfterMethod
  public void afterMethod() throws Exception 
  {
		/*
		 * Thread.sleep(5000);; driver.close();
		 */
  }

}
