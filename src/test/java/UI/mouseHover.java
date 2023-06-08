package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement mousepoint = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[4]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mousepoint).perform();
		

	}

}
