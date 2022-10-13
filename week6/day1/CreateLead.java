package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectMethods {

	@Test 
	public  void CrtLead()  {

		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankarasubbu");
		// Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();

	}

}


