package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArchitectCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("-disable-notifications");
		//1. Launch Salesforce application https://login.salesforce.com/
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		// Maximize the window
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Login with username as "ramkumar.ramaiah@testleaf.com " and password as "Password$123"
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		//3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//4. Navigate to the Salesforce Customer Service
		
		//5. Mouse hover on Support & Services
		//6. Click on Ceritifications link
		//7. Navigate to Certifications window
		//8. Select Salesforce Architect
		//9. Verify the Page tile should be chaged to "Certification - Architect Overview"
		//10. Verify the Certifications listed for Application Architect tab is displayed


	}

}
