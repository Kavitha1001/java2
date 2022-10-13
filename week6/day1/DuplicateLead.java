package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethods{
	
	@Test
	public  void DupLead () {
		
		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();

		// Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");

		//Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");

		//Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();

		// Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		System.out.println("The title of the page is :"+driver.getTitle());
	}

}



