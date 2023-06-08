package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSelenium {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("http://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // script to fill user name and password
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); // x path for login button

		driver.manage().window().maximize(); // used to manage the window size
		String currentUrl = driver.getCurrentUrl(); // used to get the current u r l
		System.out.println(currentUrl);
		String title = driver.getTitle(); // used to get the title
		System.out.println(title);
		String pagesource = driver.getPageSource(); // used to get page source
		System.out.println(pagesource);

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
	

		//driver.close(); // used to quit the window
	}

}
