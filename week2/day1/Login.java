package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		//check login correctly
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		
		
		String attribute =logout.getAttribute("value");
		System.out.println(attribute);
		if(attribute.equals(attribute))
		{
			System.out.println("Login Successfully");
		}
	}

}
