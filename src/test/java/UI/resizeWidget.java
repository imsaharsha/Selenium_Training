package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizeWidget {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resizable/");
		
		WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]"));
		
		Thread.sleep(2000);

		Actions action = new Actions(driver);
		action.dragAndDropBy(element, 230, 100).perform();

	}

}
