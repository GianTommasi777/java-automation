package SynchronizationIssues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://formy-project.herokuapp.com/autocomplete");

            WebElement autocomplete = driver.findElement(By.id("autocomplete"));
            autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
            // creamos una variable wait para aplicar la espera
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            // creamos una variable a que le asignamos la condicion de espera
            WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dismissButton")));
            autocompleteResult.click();

        } finally {
            driver.quit();
        }
    }
}
