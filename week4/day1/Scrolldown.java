package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldown {

	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		// Maximise the window
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement scroll = driver.findElement(By.xpath("//span[text()=' 2022 ibibogroup All rights reserved']"));
		Actions builder = new Actions(driver);

		builder.scrollToElement(scroll).perform();

		File source=driver.getScreenshotAs(OutputType.FILE);

		File dest = new File("redbus1.png");
		FileUtils.copyFile(source, dest);
		System.out.println("screenshot");


	}

}
