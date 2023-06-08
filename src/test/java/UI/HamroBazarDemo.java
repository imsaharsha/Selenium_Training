package UI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HamroBazarDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hamrobazaar.com/signup");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("fullName")).sendKeys("wakandehancy");
		driver.findElement(By.className("PhoneInputInput")).sendKeys("9845674224");
		driver.findElement(By.name("password")).sendKeys("abc1234#AB");
		WebElement radio1 = driver.findElement(By.className("input--checkbox")); // click on radio button
		radio1.click();

	}

}
