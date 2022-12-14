package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Duplicatelead_1 extends ProjectMethods {
	@Test(timeOut=2000)
	public  void Duplicate() {


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
		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kavi");
		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		// Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("QA/Automation Engineer");

		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kavithailayaraja92@gmail.com");

		// Select State/Province as NewYork Using Visible Text
		WebElement State= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select =new Select(State);
		select.selectByVisibleText("New York");

		// Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();

		// Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("The title of the page is :"+driver.getTitle());
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
