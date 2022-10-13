package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1 extends ProjectSpecificMethods{

	@DataProvider(name="create")
	public String[][] fetdata() {
		String [][] data=new String [3]	[3];
		
		//ist set
		
		data[0][0]="Testleaf";
		data[0][1]="kavitha";
		data[0][2]="sankar";
		
		//2nd set
		data[1][0]="TCS";
		data[1][1]="Rohini";
		data[1][2]="devi";
		
		//3rd set
		
		data[2][0]="CTS";
		data[2][1]="pavithra";
		data[2][2]="lakshmi";
		
		return data;
	}
	
	
	
	@Test(dataProvider="create")
	public void cretLead(String company,String First,String last) {



		// Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName1")).sendKeys(company);

		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(First);
		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(last);

		// Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
	}

}
