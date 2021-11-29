package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParametersTest
{
	WebDriver driver;
	

  @Parameters({"username","password"})
  @Test
  public void f(String username,String password)
  {
	  System.out.println("Username:"+username);
	  System.out.println("Username:"+password);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty(
				 "webdriver.chrome.driver","D:\\Download Data\\Software\\chromedriver.exe");
				driver=new ChromeDriver();
				 driver.get("https://www.guru99.com/introduction-testng-groups.html"); 

  

 }
			 
			 @AfterMethod
			 
			 public void afterMethod() { System.out.println("After method");
		
			 }
}
