package PuttingAllTogether;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConfirmationPage;
import pages.FormPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CodigoMejorado {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://formy-project.herokuapp.com/form");

            FormPage formPage = new FormPage();
            formPage.submitForm(driver);

            ConfirmationPage confirmationPage = new ConfirmationPage();
            confirmationPage.waitForAlertBanner(driver);

            assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertBannerText(driver));

        } finally {
            driver.quit();
        }
    }
}
