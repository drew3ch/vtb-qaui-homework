package lesson05.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @Test
    public void factorial() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

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

        driver.quit();
    }

    @Test
    public void log() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(logButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        assertEquals("0.95424250943", driver.findElement(result).getText());

        driver.quit();
    }

    @Test
    public void squareroot() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

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

        driver.quit();
    }
}