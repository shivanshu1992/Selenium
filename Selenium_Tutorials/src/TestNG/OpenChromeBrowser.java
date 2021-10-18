package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenChromeBrowser {

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
	
	@Test(priority=1, groups="TITLE")
	
	public void gettitle() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=4, groups="TEST")
	
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(priority=2 ,groups="TEST")

public void Test2() {
	System.out.println("Test2");
}

	@Test(priority=3 ,groups="TEST")

public void Test3() {
	System.out.println("Test3");
}
	
	@Test (priority=5,groups="LOGO PRESENT")
	
	public void check_logo_present() {
		boolean w =driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		System.out.println(w);
	}


 @Test (priority=6,groups="IF EMAIL ID PRESENT")

public void check_if_email_present() {
	boolean p= driver.findElement(By.xpath("//a[contains(text(),'umail')]")).isDisplayed();
	System.out.println(p);
}


  @AfterMethod
	
	public void closechrome() throws InterruptedException {
	  Thread.sleep(3000);
		driver.close();
		
  }
	
}
