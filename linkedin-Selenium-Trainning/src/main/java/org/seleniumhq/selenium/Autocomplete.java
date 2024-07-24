package org.seleniumhq.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
        address.sendKeys("Republica Argentina 325");
        Thread.sleep(1000);

        WebElement buttonDismiss = driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button"));
        buttonDismiss.click();
        Thread.sleep(1000);


        WebElement city = driver.findElement(By.id("locality"));
        city.sendKeys("Villa Carlos Paz");
        Thread.sleep(1000);

        WebElement state = driver.findElement(By.id("administrative_area_level_1"));
        state.sendKeys("Cordoba");
        Thread.sleep(1000);

        WebElement zipCode = driver.findElement(By.id("postal_code"));
        zipCode.sendKeys("5152");
        Thread.sleep(1000);

        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Argentina");
        Thread.sleep(1000);

        driver.quit();












    }
}
