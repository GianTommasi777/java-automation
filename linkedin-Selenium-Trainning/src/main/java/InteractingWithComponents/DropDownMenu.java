package InteractingWithComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownButton = driver.findElement(By.cssSelector(".btn.btn-primary.dropdown-toggle"));
        dropDownButton.click();
        Thread.sleep(Duration.ofSeconds(2));

        WebElement autocompleteButton = driver.findElement(By.id("autocomplete"));
        autocompleteButton.click();
        Thread.sleep(Duration.ofSeconds(2));

        driver.quit();
    }
}
