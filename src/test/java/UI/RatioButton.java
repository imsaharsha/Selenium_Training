package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.touch.TapOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RatioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
		driver.manage().window().maximize();

		WebElement radio1 = driver.findElement(By.id("bookFlights"));
		radio1.click();

		WebElement radio2 = driver.findElement(By.id("redeemFlights"));
		radio2.click();
		
		System.out.println(radio1.isSelected()); 
		System.out.println(radio2.isSelected()); 
		System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());

	}

}
