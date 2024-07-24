package InteractingWithComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePicker {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();
        dateField.sendKeys("07/12/1996");
        Thread.sleep(Duration.ofSeconds(2));
        dateField.sendKeys(Keys.RETURN);  // Esto simula que presionamos ENTER
        Thread.sleep(Duration.ofSeconds(2));

        driver.quit();
    }
}
