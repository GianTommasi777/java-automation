package PuttingAllTogether;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAWorkFlow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://formy-project.herokuapp.com/form");

            driver.findElement(By.id("first-name")).sendKeys("Gianfranco");

            driver.findElement(By.id("last-name")).sendKeys("Tommasi");

            driver.findElement(By.id("job-title")).sendKeys("QA Automation");

            driver.findElement(By.id("radio-button-3")).click();

            driver.findElement(By.id("checkbox-1")).click();

            driver.findElement(By.cssSelector("option[value='3']")).click();

            driver.findElement(By.id("datepicker")).sendKeys("07/12/1996");

            driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


        } finally {
            driver.quit();
        }
    }
}
