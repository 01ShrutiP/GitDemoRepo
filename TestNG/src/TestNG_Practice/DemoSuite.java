package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoSuite {
  @Test(groups={"Smoke"})
  public void f() 
  {
	  System.out.println("This is f test ");
  }
  
  @Test(groups={"Smoke"})
  public void f11() 
  {
	  System.out.println("This is f11 test ");
  }
  
  @Test(groups={"Smoke"})
  public void f12() 
  {
	  System.out.println("This is f12 test ");
  }
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("This is Before suite"); 
  }
  
  

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("This is After suite");
  }

}
