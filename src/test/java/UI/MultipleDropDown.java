package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();

		WebElement ddown = driver.findElement(By.id("multi-select"));
		Select select = new Select(ddown);
		select.selectByValue("california");
		Thread.sleep(2000);

		select.selectByIndex(5);
		Thread.sleep(2000);

		List<WebElement> allItems = select.getAllSelectedOptions();

		System.out.println(allItems.size());

		select.deselectAll();
		Thread.sleep(2000);

		select.selectByValue("california");
		Thread.sleep(2000);

		select.selectByIndex(5);
		Thread.sleep(2000);
		select.deselectByIndex(5);
		Thread.sleep(2000);
		List<WebElement> allItems1 = select.getAllSelectedOptions();

		System.out.println(allItems1.size());

	}
}
