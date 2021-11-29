package TestNG_Practice;

import org.testng.annotations.Test;

public class DemoGroups 
{
  @Test(groups={"Smoke"})
  public void f_group() 
  {
	  System.out.println("Group name is f_group");
	  
  }
  
  @Test(groups={"Sanity"})
  public void f_group1() 
  {
	  System.out.println("Group name is f_group1");
	  
  }
}
