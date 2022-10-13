package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;


public class ServiceNowMobile {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://dev132011.service-now.com/navpage.do");
		//Maximize the window
		driver.manage().window().maximize();
		// Enter username and Password and click Login
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("July@2022");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Click-All Enter Service catalog in filter navigator and press enter 
		Shadow shadow=new Shadow(driver);
		Thread.sleep(15000);
		WebElement ele=shadow.findElementByXPath("//div[@id='all']");
		ele.click();
		Thread.sleep(2000);
		WebElement search=shadow.findElementByXPath("//div[@class='sn-polaris-nav-header-filter can-animate']//following::input[@id='filter']");
	
		search.sendKeys("Service Catalog");
		
		
	
	
	
		// Click on  mobiles
		//Select Apple iphone6s
		//Update color field to rose gold and storage field to 128GB
		//Select  Order now option
		//Verify order is placed and copy the request number"



	}

}
