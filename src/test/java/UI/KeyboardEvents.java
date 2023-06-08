package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.htm]");
		driver.manage ().window().maximize ();
		WebElement sourcetextarea = driver.findElement (By.xpath(" //*[@id=\"dropZone\"1//div[51/pre/span"));
		Actions action = new Actions (driver);
		Thread.sleep (2000);
		action.keyDown(sourcetextarea, Keys.COMMAND).sendKeys("a").sendKeys("c").build().perform();
		WebElement destinationtextarea =driver.findElement(By.xpath(" //*[@id=\"dropZone2\"1//div[51/div[31/pre/span"));
		Thread.sleep (2000);
		action. keyDown(destinationtextarea, Keys.COMMAND).sendKeys ("a").sendKeys ("v").build().perform();
		
		
		
	}

}
