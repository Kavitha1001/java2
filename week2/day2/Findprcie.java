package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Findprcie {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().window().maximize();
		//Click on Pickup City
		driver.findElement(By.xpath("//div[@class='placeholder']")).click();
	// Click the fist suggested pick up location 
		driver.findElement(By.xpath("(//i[@class='icon icon-location']/following-sibling::div)[1]")).click();
	
		
	}

}
