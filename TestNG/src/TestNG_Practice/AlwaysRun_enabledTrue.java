package TestNG_Practice;

import org.testng.annotations.Test;

public class AlwaysRun_enabledTrue 
{
  @Test
  public void f1() 
  {
	  int i;
	  i=9/1;
	  System.out.println(i);
  }
  
  @Test(enabled=true,alwaysRun = false,dependsOnMethods = "f1")
  public void f2() 
  {
	  System.out.println("F2 is running");
  }
  
}
