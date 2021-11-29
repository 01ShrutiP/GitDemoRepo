package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class DemoTest 
{
  @Test
  public void f() 
  {
	  System.out.println("This is f test");
  }
  
  @Test
  public void f1() 
  {
	  System.out.println("This is f1 test");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("This is before Test");
  }
  
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("This is before Suite");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("This is After Test");
  }
  

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("This is After Suite");
  }

}
