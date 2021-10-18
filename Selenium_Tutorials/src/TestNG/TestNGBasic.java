package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	@BeforeSuite
	public void Takekey() {
		System.out.println("Take car key");
		
	}
	
	@BeforeTest
	public void takeInsurance() {
		System.out.println("Take Insurance");
		
	}
	@BeforeClass
	public void TakeBottle() {
		System.out.println("Take Bottle");
		
	}
	@BeforeMethod
	public void WearChappal() {
		System.out.println("Wear Chappal");
		
	}
	
	// Beforemethod
	// Test-1
	// Aftermethod
	
	// Beforemethod
	// Test- 2
	// Aftermethod
	
	@Test
	public void CheckURL(){
		System.out.println("Check entered URL");
	}

	@Test
	public void EnterURL(){
		System.out.println("Enter URL");
	}
	@AfterMethod
	public void TakeRequirement() {
		System.out.println("Take requirement for new prject");
	}
	@AfterClass
	public void StartTestcase() {
		System.out.println("Start Testcase");
	}
	@AfterTest
	public void TakeBuild() {
		System.out.println("Take Build ");
	}
	@AfterSuite
	public void Dosmoke () {
		System.out.println("Do smoke");
	}
}

