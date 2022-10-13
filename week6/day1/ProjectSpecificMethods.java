package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
ChromeDriver driver;
WebDriverWait wait;
     
   @Parameters({"url","username","password"})
	@BeforeMethod
	public  void assign(String url,String username,String password) {

		WebDriverManager.chromedriver().setup();

		 driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//Enter UserName and Password Using Id Locator

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		// Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@AfterMethod
	public void cls() {
		
		driver.close();
	}
	

}
