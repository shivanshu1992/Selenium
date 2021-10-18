package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // if only iframe is available
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
		

	}

}
