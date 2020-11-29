package lesson06.homework;

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

public class Test04 {

    private static final By factButton = By.xpath("//div[@jsname='SfS5gd']");
    private static final By logButton = By.xpath("//div[@jsname='DfiOAc']");
    private static final By squareButton = By.xpath("//div[@jsname='oQcVc']");
    private static final By fiveButton = By.xpath("//div[@jsname='Ax5wH']");
    private static final By nineButton = By.xpath("//div[@jsname='XoxYJ']");
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
    public void factorial() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(fiveButton)).click().perform();
        actions.moveToElement(driver.findElement(factButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        int res = Integer.parseInt(driver.findElement(result).getText());
        assertEquals(120, res);
    }

    @Test
    public void log() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(logButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        assertEquals("0.95424250943", driver.findElement(result).getText());
    }

    @Test
    public void squareroot() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(squareButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        int res = Integer.parseInt(driver.findElement(result).getText());
        assertEquals(3, res);
    }
}