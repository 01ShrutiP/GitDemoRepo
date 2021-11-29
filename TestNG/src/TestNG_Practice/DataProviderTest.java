package TestNG_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest 
{
  @Test(dataProvider = "getData")
  public void f(String uname,String pswd) 
  {
	  System.out.println("username:"+uname);
	  System.out.println("Password:"+pswd);
  }

  @DataProvider
  public Object[][] getData() 
  {
    Object[][] data= new Object[2][2];
    {
      data[0][0]="shruti.parkar@gmail.com";
      data[0][1]="Shruti@123";
      data[1][0]="abc@gmail.com";
      data[1][1]="abc@123";
      return data;
    }
  }
}
