package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Title_name=driver.getTitle();
		//System.out.println(Title_name);
		//if (Title_name.equals("Faceboook")) {
			//System.out.println("this is correct title");
			System.out.println(driver.getCurrentUrl());	
		}
	}
//}
