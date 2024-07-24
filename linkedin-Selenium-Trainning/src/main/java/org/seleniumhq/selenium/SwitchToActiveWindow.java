package org.seleniumhq.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        Thread.sleep(2000);


        // Aca creamos una variable que guarde la ventana inicial donde nos encontramos para luego volver a ella
        String originalHandle = driver.getWindowHandle();

        // Hacemos un ciclo for para iterar sobre las paginas que se abren
        // en este caso va a ser para ir a la pagina que se abrio luego de hacer click en el boton
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        // Aca volvemos a la pagina inicial
        driver.switchTo().window(originalHandle);

        driver.quit();


    }
}
