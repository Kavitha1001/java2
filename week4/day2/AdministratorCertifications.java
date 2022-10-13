package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("-disable-notifications");
		//1. Launch Salesforce application https://login.salesforce.com/
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		// Maximize the window
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Login with username as "ramkumar.ramaiah@testleaf.com " and password as "Password$123"
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		//3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//4. Click confirm on Confirm redirect
		String window1=driver.getWindowHandle();
		Set<String> window2=driver.getWindowHandles();
		List<String> windowlist=new ArrayList<String>(window2);
		driver.switchTo().window(windowlist.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//5. Click Resources and mouse hover on Learning On Trailhead
		driver.findElement(By.linkText("Resources")).click();


		Shadow dom = new Shadow(driver);
		WebElement Learning = dom.findElementByXPath("//span[text()='Learning']");
		Learning.click();
		System.out.println("The element is clicked");


		WebElement Trailhead= dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		builder.moveToElement(Trailhead).perform();
		System.out.println("Mouse over is done");

		//6. Clilck on Salesforce Certifications
		Thread.sleep(1000);
		WebElement Sales = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.moveToElement(Sales).click();
		System.out.println("moved to salesforce");

		//7. Click on Ceritification Administrator
		Thread.sleep(3000);
		WebElement salesForce = driver.findElement(By.linkText("Administrator"));
		salesForce.click();

		

		//8. Navigate to Certification - Administrator Overview window

		//9. Verify the Certifications available for Administrator Certifications should be displayed
	}

}
