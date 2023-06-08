package UI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handelSSL {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		
		ChromeOptions coptions = new ChromeOptions();
		coptions.merge(dc);
		ChromeDriver driver = new ChromeDriver(coptions);

		driver.manage().window().maximize();
		driver.get("https://www.Hamrobazar.com");
		

	}

}
