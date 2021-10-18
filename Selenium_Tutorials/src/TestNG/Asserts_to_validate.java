package TestNG;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asserts_to_validate {
	
WebDriver driver; // initialise the instance
	
	@BeforeMethod
	
	public void OpenChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
			
	}

@Test

 public void gettitle() {
	String title= driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google", "TITLE NOT MATCHED"); 
	
	// Assert if we want to validate expected results
	
}
@Test 

public void check_logo_present() {
	boolean w =driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
	System.out.println(w);
	Assert.assertEquals(w, true);
	Assert.assertTrue(w);
}
}
