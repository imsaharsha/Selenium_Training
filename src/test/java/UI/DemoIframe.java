package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoIframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		driver.switchTo().frame(1);

		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();

		System.out.println(driver.getTitle());

	}

}
 