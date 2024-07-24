package org.seleniumhq.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



public class TestSample {
    public static void main(String[] args) {

        // Set property for webdriver.chrome.driver to be the location to your local
        // download of chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        // Create a new instance of ChromeDriver

        WebDriver driver = new ChromeDriver();

        // Now use this to visit google

        driver.get("https://google.com");
        driver.manage().window().maximize();

        // Find next input element by his name

        WebElement element1 = driver.findElement(By.name("q"));

        // Enter something to search
        element1.sendKeys("Perro Salchicha");
        element1.submit();

        driver.quit();
    }
}
