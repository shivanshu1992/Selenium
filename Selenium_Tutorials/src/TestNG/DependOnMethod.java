package TestNG;

import org.testng.annotations.Test;

public class DependOnMethod {

	
	@Test(priority=1)
	public void LoginToApp()
	{
		System.out.println("Login to the facebook app");
		int i=9/0; // it will show exception 
	}
	
	@Test(priority=2,dependsOnMethods="LoginToApp")
	
	// 'depend'keyword means it is dependant on previous testcase if it will pass then wil pass or fail
	
	public void EnterCredentials()
	{
		System.out.println("EnterCredentials");
	}
	
	@Test(priority=3)
	
	public void ClickSubmit()
	{
		System.out.println("ClickSubmit");
	}
	@Test(priority=4)
	public void GoToHomePage()
	{
		System.out.println("GoToHomePage");
	}
}
