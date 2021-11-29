package TestNG_Practice;

import org.testng.annotations.Test;

public class Helperfunctions 
{
  @Test(dependsOnMethods = "f2")
  public void f() 
  {
	  System.out.println("f1");
  }
  //This attribute is the maximum time the method should take to complete.
  @Test(timeOut = 3000)
  public void f1() 
  {
	  System.out.println("f2");
  }
  
  //invocationTimeOut is the maximum time period TestNG will wait for all the invocations of the test method specified in the attribute
  @Test(invocationCount =5,invocationTimeOut = 2000)
  public void f2() 
  {
	  System.out.println("f3");
  }
}
