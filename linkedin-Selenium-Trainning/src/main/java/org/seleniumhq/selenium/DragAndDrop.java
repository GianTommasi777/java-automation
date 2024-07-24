package org.seleniumhq.selenium;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));


        // Definimos una nueva variable actions para poder realizar acciones especificos sobre objetos,
        // en este caso sobre image y box
        Actions actions = new Actions(driver);

        // Aca llamos a la variable actions la cual recibe 2 parametros, en este caso van a ser image y box
        // y luego le pasamos las funciones build() para construir esta accion y perform() para realizar la accion
        actions.dragAndDrop(image, box).build().perform();
        Thread.sleep(2000);

        driver.quit();


    }
}
