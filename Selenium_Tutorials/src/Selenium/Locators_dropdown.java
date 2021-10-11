package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		//driver.get("https://demo.opencart.com/");
		
		
		// By xpath
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("SHIVANSHU");
		
		// By id
		//driver.findElement(By.id("name")).sendKeys("Abbhinav");
		
		// linktext
		//driver.findElement(By.linkText("Desktops")).click();
		//driver.findElement(By.linkText("PC (0)")).click();
		
		// Dropdown
		
		Select s1= new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
		s1.selectByVisibleText("Italy");
		
		
		
		
		
		
		
		
		

	}

}
