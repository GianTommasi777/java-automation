package PuttingAllTogether;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CleanUpTheTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://formy-project.herokuapp.com/form");

            submitForm(driver);
            waitForAlertBanner(driver);
            assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        } finally {
            driver.quit();
        }
    }

    public static void submitForm(WebDriver driver)
    {
        driver.findElement(By.id("first-name")).sendKeys("Gianfranco");

        driver.findElement(By.id("last-name")).sendKeys("Tommasi");

        driver.findElement(By.id("job-title")).sendKeys("QA Automation");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("07/12/1996");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    public static void waitForAlertBanner(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
    }

    public static String getAlertBannerText(WebDriver driver)
    {
       return driver.findElement(By.className("alert")).getText();
    }
}
