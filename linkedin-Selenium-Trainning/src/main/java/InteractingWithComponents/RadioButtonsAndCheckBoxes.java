package InteractingWithComponents;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonsAndCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(Duration.ofSeconds(2));

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value=option2]"));
        radioButton2.click();
        Thread.sleep(Duration.ofSeconds(2));

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(Duration.ofSeconds(2));

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        Thread.sleep(Duration.ofSeconds(2));

        WebElement checkBox2 = driver.findElement(By.cssSelector("input[value=checkbox-2]"));
        checkBox2.click();
        Thread.sleep(Duration.ofSeconds(2));

        WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkBox3.click();
        Thread.sleep(Duration.ofSeconds(2));


        driver.quit();
    }
}

