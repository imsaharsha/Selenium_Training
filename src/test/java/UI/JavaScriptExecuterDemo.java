package UI;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterDemo {

	public static <JavascriptExecutor> void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		
		String script = "return document.title;";
		
		
		


	}

}
