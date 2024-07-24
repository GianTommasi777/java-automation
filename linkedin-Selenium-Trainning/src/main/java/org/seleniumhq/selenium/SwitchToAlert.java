package org.seleniumhq.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement openAlertButton = driver.findElement(By.id("alert-button"));
        openAlertButton.click();
        Thread.sleep(1000);


        // En este vamos a crear una variable alert que lo que va a hacer es dirigirse hacia la alerta que se
        // muestre en pantalla luego de hacer click en el boton "Open Alert"
        Alert alert = driver.switchTo().alert();

        // Esto hace que aceptemos la alerta y la misma se cierre
        alert.accept();

        driver.quit();
    }
}
