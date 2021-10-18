package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
			ChromeOptions option= new ChromeOptions();  // create object to disable notification
			option.addArguments("disable-notifications"); // disable notification
			WebDriver driver= new ChromeDriver(option);
			//WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://beta.spicejet.com/");
			
			Actions action= new Actions(driver); // To hover the mouse
			action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")))
			.build()
			.perform();
			driver.findElement(By.xpath("//div[contains(text(),'SpiceMAX')]")).click();	
			//driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")).click();	
	}

}
