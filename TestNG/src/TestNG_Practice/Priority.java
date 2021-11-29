package TestNG_Practice;

import org.testng.annotations.Test;

public class Priority 
{
  @Test(priority=2)
  public void f() 
  {
	  System.out.println("f");
  }
  
  @Test(priority=0)
  public void f1() 
  {
	  System.out.println("f1");
  }
  
  @Test(priority=1)
  public void f2() 
  {
	  System.out.println("f2");
  }
}
