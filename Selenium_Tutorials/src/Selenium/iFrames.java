package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
			
			//dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://classic.freecrm.com/index.html");
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("naveenk");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");
			driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
			Thread.sleep(2000);
			
			//Now click on contact tab which is in frame
			driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			driver.close();

			
			
			
			
			
			
	}

}
