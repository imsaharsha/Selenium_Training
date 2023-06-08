package UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemoTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Oneplus nord buds 2");

		// select the required device on amazon
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement photo = driver.findElement(By.linkText(
				"OnePlus Nord Buds 2 True Wireless in Ear Earbuds with Mic, Upto 25dB ANC 12.4mm Dynamic Titanium Drivers, Playback:Upto 36hr case, 4-Mic Design, IP55 Rating, Fast Charging [Thunder Gray]"));
		photo.click();
		
		

	}

}
