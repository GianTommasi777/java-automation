package org.seleniumhq.selenium;

// Importamos las librerias de selenium y chromedriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

// Definimos nuestra clase
public class simpleTest {
    public static void main(String[] args) {
        // Seteamos el lugar donde se encuentra nuestro chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        // Asignamos el webdriver a una variable para poder instanciarlo e utilizarlo
        WebDriver driver = new ChromeDriver();

        // utilizamos el metodo get para llamar a la direccionn url que pongamos dentro de los parentesis
        driver.get("https://handwiki.org/wiki/Chaos_Monkey");
        // con la funcion manage podemos eviarle al driver que realize distintas acciones
        driver.manage().window().maximize();
        // con la funcion quit cerramos el driver
        driver.quit();
    }
}
