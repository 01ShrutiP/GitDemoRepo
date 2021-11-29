package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class DemoClass {
  @Test
  public void f() 
  {
	  System.out.println("This is f method");
  }
  
  @Test
  public void f1() 
  {
	  System.out.println("This is f1 method");
  }
  
  @Test
  public void f2() 
  {
	  System.out.println("This is f2 method");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("This is before Class");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("This is after Class");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("This is before Method");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("This is after Method");
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
