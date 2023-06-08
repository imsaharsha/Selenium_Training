package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		Thread.sleep(2000);
		
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slide, -100, 140).perform();
		
		
		
		
	}

}
