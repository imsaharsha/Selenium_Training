package UI;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String username = "admin";
		String password ="admin";
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	}

}
