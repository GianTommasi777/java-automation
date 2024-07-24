package InteractingWithComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FIleUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement chooseButton = driver.findElement(By.id("file-upload-field"));
        chooseButton.sendKeys("image-to-upload.jpg");
        Thread.sleep(Duration.ofSeconds(2));

        driver.quit();
    }
}
