package ru.geekbrains.qaui.lesson05.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;

public class Test03 {

    private static final By sinButton = By.xpath("//div[@jsname='aN1RFf']");
    private static final By cosButton = By.xpath("//div[@jsname='w0Xmgb']");
    private static final By tanButton = By.xpath("//div[@jsname='VsnRKc']");
    private static final By oneButton = By.xpath("//div[@jsname='N10B9']");
    private static final By equalButton = By.xpath("//div[@jsname='Pt8tGc']");

    private static final By result = By.xpath("//span[@jsname='VssY5c']");

    protected WebDriver driver;

    @BeforeAll
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void sin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(sinButton)).click().perform();
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        assertEquals("0.8414709848", driver.findElement(result).getText());

        driver.quit();
    }

    @Test
    public void cos() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(cosButton)).click().perform();
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        assertEquals("0.54030230586", driver.findElement(result).getText());

        driver.quit();
    }

    @Test
    public void tan() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(tanButton)).click().perform();
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        assertEquals("1.55740772465", driver.findElement(result).getText());

        driver.quit();
    }
}
