package PuttingAllTogether;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class ConfirmBehaviorOfTheTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://formy-project.herokuapp.com/form");

            driver.findElement(By.id("first-name")).sendKeys("Gianfranco");

            driver.findElement(By.id("last-name")).sendKeys("Tommasi");

            driver.findElement(By.id("job-title")).sendKeys("QA Automation");

            driver.findElement(By.id("radio-button-3")).click();

            driver.findElement(By.id("checkbox-1")).click();

            driver.findElement(By.cssSelector("option[value='3']")).click();

            driver.findElement(By.id("datepicker")).sendKeys("07/12/1996");

            driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

            // Ahora en las lineas siguientes vamos a confirmar que todas las acciones
            // realizadas anteriormente hayan sido completadas


            // crea una instancia WebDriverWait para esperar que ocurra una condicion especifica
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            // Usamos el objeto wait para esperar a que un elemento web sea visible en la pagina.
            // Usamos la condicion especifica que es buscar el elemento por cssSelector "alert"
            WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
            // Se obtiene el elemento web alert y se lo asigna a la variable alertText
            String alertText = alert.getText();
            assertEquals("The form was successfully submitted!", alertText);


        } finally {
            driver.quit();
        }
    }
}
