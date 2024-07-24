package org.seleniumhq.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");


        WebElement openModalButton = driver.findElement(By.id("modal-button"));
        openModalButton.click();

        // Sumamos una variable wait de tipo WebDriverWait para agregar una espera para
        // asegurar que el boton de cerrar model
        // este presente y visible antes de intentar hacer click sobre el
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("close-button")));
        Thread.sleep(1000);  // siempre adherir al principio un throws InterruptedException

        // Puede usar esta variable para ejecutar un script, en este caso la usamos para
        // cerrar el primer elemento que se encuentre en la cartel que se despliega que seria el argumento
        // que se pasa despues de la coma, es decir, el boton de close que fue definido previamente
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",closeButton);

        driver.quit();

    }
}
