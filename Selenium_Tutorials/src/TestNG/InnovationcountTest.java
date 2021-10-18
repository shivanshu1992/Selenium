package TestNG;

import org.testng.annotations.Test;

public class InnovationcountTest {
	
	@Test(invocationCount=5) 
	
	// this is used if we want to run same testcase 5 times instead of writing same method different times
	 
	public void SumOfNumbers()
	
	 
	{
		int a=9;
		int b=8;
		int y= a+b;
		
		System.out.println("sum is ==="  +  y);
	}
	
	/*public void SumOfNumbers2()
	
	 
	{
		int a=9;
		int b=8;
		int y= a+b;
		
		System.out.println("sum is ==="  +  y);
	}
	*/
}

