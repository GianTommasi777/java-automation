package org.seleniumhq.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        // Esto nos permite realizar una accion sobre un elemento especifico, pasamos como parametro driver
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Gianfranco Tommasi");
        Thread.sleep(1000);

        WebElement date = driver.findElement(By.id("date"));
        // actions.moveToElement(date);
        date.sendKeys("7/12/1996");

        driver.quit();
    }
}
