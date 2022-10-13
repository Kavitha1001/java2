package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drag1= driver.findElement(By.id("droppable"));
		System.out.println(driver.location());
		
		Actions builder= new Actions(driver);
		builder.dragAndDrop(drag,drag1).perform();
		
	}

}
