package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text() = 'From']")).click();

		WebElement from = driver.findElement(By.xpath("//input[@placeholder = 'From']"));

		from.sendKeys("Dubai");
		Thread.sleep(2000);
		
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);

		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

}
