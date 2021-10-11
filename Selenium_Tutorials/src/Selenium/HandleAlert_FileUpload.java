package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Selenium_Tutorials\\src\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert a1= driver.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(3000);
		a1.accept();
		//a1.dismiss();*/
		
		
		//File upload
		
		driver.findElement(By.xpath("//input[@id='inputGroupFile02']")).sendKeys("E:\\Resume-1.pdf");
		Thread.sleep(3000);
		//driver.quit();		
		
		
		
		

	}

}
