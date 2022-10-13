package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		// Maximise the window
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']")).click();
		
		
		//Explicit wait for window handle
		WebDriverWait window=new WebDriverWait(driver,Duration.ofSeconds(30));
		window.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("The all windows are opened");
		
		
		
		
		
		
		

	}

}
