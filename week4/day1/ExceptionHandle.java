package week4.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximise the window
		driver.manage().window().maximize();	
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// 	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		//	Enter first name
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Kavitha");
		//	Click Find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		// Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
	}



}


