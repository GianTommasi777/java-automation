package SynchronizationIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://formy-project.herokuapp.com/autocomplete");

            WebElement autocomplete = driver.findElement(By.id("autocomplete"));
            autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            WebElement autocompleteResult = driver.findElement(By.cssSelector(".dismissButton"));
            autocompleteResult.click();
        } finally {
            driver.quit();
        }
    }
}
