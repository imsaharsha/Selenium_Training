package UI;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); implicitly
		// set wait
		WebElement mousepoint = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[4]"));

		Actions action = new Actions(driver);
		action.moveToElement(mousepoint).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[1]/a"))
				.click();

		// Thread.sleep(2000); not good practice
		// driver.findElement(By.xpath("")).click();

	}

}
