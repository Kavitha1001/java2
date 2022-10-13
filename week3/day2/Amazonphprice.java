package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Links;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonphprice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		//Type Phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		//Print price of every phone

		List<WebElement> price=driver.findElements(By.className("a-price-whole"));

		List<Integer> phprices=new ArrayList<Integer>();
		for (int i = 0; i < price.size(); i++) {
			System.out.println(price.get(i).getText());
			String PriceStr=price.get(i).getText().replace(",","");
			int price1=Integer.parseInt(PriceStr);
			phprices.add(price1);
		}
		Collections.sort(phprices);
		System.out.println("The lowest price of the phone is:"+phprices.get(0));



	}
}


