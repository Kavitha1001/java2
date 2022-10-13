package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//driver.close();
		//find username and enter the username

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//find password field and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click CRM/SFA link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Leads Link
		 driver.findElement(By.linkText("Leads")).click();
		  //click create Leads link
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 //enter company name
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 
		 //Enter first name
		 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
		 
		 //Enter last name
		 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankarasubbu");
		 
		 //click Create Lead
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 //verify the View lead page
		 String title=driver.getTitle();
		 System.out.println(title);
		 if(title.equals("View Lead | opentaps CRM"))
		 { 
		     System.out.println("Successfully navigated to View lead page");
		
		 }

	}

}
