package UI;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoChatGpt {

    public static void main(String[] args) {
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

        // Wait until the UserFirstName field is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement userFirstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserFirstName")));
        userFirstNameField.sendKeys("Wakande");

        // Wait until the UserLastName field is visible
        WebElement userLastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserLastName")));
        userLastNameField.sendKeys("hancy");

        // Wait until the UserEmail field is visible
        WebElement userEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserEmail")));
        userEmailField.sendKeys("wakandehancy69@gmail.com");

        WebElement ddown = driver.findElement(By.name("UserTitle")); // select drop down
        Select select = new Select(ddown);

        // Wait until the UserTitle dropdown is visible
        WebElement userTitleDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("UserTitle")));
        select.selectByIndex(3);

        WebElement userPhoneField = driver.findElement(By.name("UserPhone"));
        userPhoneField.sendKeys("9845674224");

        WebElement ddown1 = driver.findElement(By.name("CompanyLanguage")); // select drop down
        Select select1 = new Select(ddown1);

        // Wait until the CompanyLanguage dropdown is visible
        WebElement companyLanguageDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("CompanyLanguage")));
        select1.selectByIndex(13);

        WebElement ddown2 = driver.findElement(By.name("CompanyCountry"));
        Select select2 = new Select(ddown2);

        // Wait until the CompanyCountry dropdown is visible
        WebElement companyCountryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("CompanyCountry")));
        select2.selectByIndex(21);

        WebElement radio1 = driver.findElement(By.className("checkbox-ui")); // click on radio button
        radio1.click();

        driver.findElement(By.name("Start free trial")).click();

        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
    }
}
