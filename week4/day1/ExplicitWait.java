package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");
		// Maximise the window
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Invisible Element
		WebElement Invisible=driver.findElement(By.id("btn"));
        
		//Explicitly Wait
		
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.invisibilityOf(Invisible));
		
		System.out.println("The Element is invisible");

	}
}
