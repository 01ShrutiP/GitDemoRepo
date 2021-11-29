package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ParallelTest 
{
	WebDriver driver;
  @Test
  public void f1() 
  {
	  System.out.println("Test Case One with Thread Id:"+ Thread.currentThread().getId());
  }
  
  @Test
  public void f2() 
  {
	  System.out.println("Test Case One with Thread Id:"+  Thread.currentThread().getId());
  }
  
  @Test
  public void f3() 
  {
	  System.out.println("Test Case One with Thread Id:"+  Thread.currentThread().getId());
  }
  @Test
  public void f4() 
  {
	  System.out.println("Test Case One with Thread Id:"+  Thread.currentThread().getId());
  }
	/*
	 * @BeforeMethod public void beforeMethod() { System.setProperty(
	 * "webdriver.chrome.driver","D:\\Download Data\\Software\\chromedriver.exe");
	 * driver=new ChromeDriver();
	 * driver.get("https://www.guru99.com/introduction-testng-groups.html"); }
	 * 
	 * @AfterMethod public void afterMethod() { System.out.println("After method");
	 * }
	 */

}
