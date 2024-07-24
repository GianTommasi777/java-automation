package org.seleniumhq.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SimpleWebTest {
    private WebDriver driver;
    private WebDriverWait wait;

    // WebDriverWait ya no acepta un entero para el
    // tiempo de espera directamente, sino que requiere un objeto de tipo java.time.Duration.
    // como por ejemplo, Duration.ofSeconds('cantidad de segundos')
    @BeforeEach
    public void InitWebDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void searchDuckDuckGo(){
        // Load Page
        driver.get("https://duckduckgo.com/");

        // Enter Search Pharse
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox_input")));
        WebElement searchInput = driver.findElement(By.id("searchbox_input"));
        // searchInput.click();
        searchInput.sendKeys("giant panda");

        // Click search button
        WebElement clickSearchButton = driver.findElement(By.xpath("//*[@id=\"searchbox_homepage\"]/div/div/div/button"));
        clickSearchButton.click();
        // Wait for results to apper
       //  wait.until(ExpectedConditions.titleContains("Giant Panda"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("eVNpHGjtxRBq_gLOfGDr LQNqh2U1kzYxREs65IJu")));

        // Make sure each result contains the word "Panda"
        // Creamos una lista de los resultados
        List<WebElement> resultLinks = driver.findElements(By.className("wLL07_0Xnd1QZpzpfR4W"));
        for (WebElement link : resultLinks) {
            assertTrue(link.getText().contains("Panda"));
        }
    }

    @AfterEach
    public void quitWebDriver(){
        if (driver != null) {
            driver.quit();
             }
        }
    }


