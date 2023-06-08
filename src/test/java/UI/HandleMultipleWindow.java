package UI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.salesforce.com/ap/?ir=1");

		driver.findElement(By.xpath("/html/body/main/div[2]/section/div[1]/article/div[2]/div/pbc-button[1]")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Iterator<String> iterator = windows.iterator();

		String parentWindow = iterator.next();
		String childWindow = iterator.next();

		driver.switchTo().window(childWindow);

		Thread.sleep(1500);
		driver.findElement(By.name("UserFirstName")).sendKeys("Wakande"); // fill user name , email details
		Thread.sleep(1500);

		driver.findElement(By.name("UserLastName")).sendKeys("hancy");
		Thread.sleep(1500);

		driver.findElement(By.name("UserEmail")).sendKeys("wakandehancy69@gmail.com");

		WebElement ddown = driver.findElement(By.name("UserTitle")); // select drop down
		Select select = new Select(ddown);
		Thread.sleep(1500);
		select.selectByIndex(3);
		Thread.sleep(1500);
		driver.findElement(By.name("UserPhone")).sendKeys("9845674224");

		WebElement ddown1 = driver.findElement(By.name("CompanyLanguage")); // select drop down
		Select select1 = new Select(ddown1);
		Thread.sleep(1500);
		select1.selectByIndex(13);

		WebElement ddown2 = driver.findElement(By.name("CompanyCountry"));
		Select select2 = new Select(ddown2);
		Thread.sleep(1500);
		select2.selectByIndex(21);
		Thread.sleep(1500);

		WebElement radio1 = driver.findElement(By.className("checkbox-ui")); // click on radio button
		radio1.click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Start free trial")).click();

		//driver.switchTo().window(parentWindow); // switch back to parent window

	}

}
