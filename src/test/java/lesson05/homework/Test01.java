package lesson05.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.WebDriver;

public class Test01 {

    private static final By oneButton = By.xpath("//div[@jsname='N10B9']");
    private static final By twoButton = By.xpath("//div[@jsname='lVjWed']");
    private static final By threeButton = By.xpath("//div[@jsname='KN1kY']");
    private static final By fourButton = By.xpath("//div[@jsname='xAP7E']");

    private static final By sixButton = By.xpath("//div[@jsname='abcgof']");
    private static final By eightButton = By.xpath("//div[@jsname='T7PMFe']");
    private static final By nineButton = By.xpath("//div[@jsname='XoxYJ']");

    private static final By plusButton = By.xpath("//div[@jsname='XSr6wc']");
    private static final By minusButton = By.xpath("//div[@jsname='pPHzQc']");
    private static final By divButton = By.xpath("//div[@jsname='WxTTNd']");
    private static final By multipleButton = By.xpath("//div[@jsname='YovRWb']");

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
    public void onePlusThree() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(plusButton)).click().perform();
        actions.moveToElement(driver.findElement(threeButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        int res = Integer.parseInt(driver.findElement(result).getText());
        assertEquals(4, res);
    }

    @Test
    public void sixMultipleNine() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(sixButton)).click().perform();
        actions.moveToElement(driver.findElement(multipleButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        int res = Integer.parseInt(driver.findElement(result).getText());
        assertEquals(54, res);
    }

    @Test
    public void eightDivFour() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(eightButton)).click().perform();
        actions.moveToElement(driver.findElement(divButton)).click().perform();
        actions.moveToElement(driver.findElement(fourButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        int res = Integer.parseInt(driver.findElement(result).getText());
        assertEquals(2, res);
    }

    @Test
    public void eightMinusTwo() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        actions.moveToElement(driver.findElement(eightButton)).click().perform();
        actions.moveToElement(driver.findElement(minusButton)).click().perform();
        actions.moveToElement(driver.findElement(twoButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();

        int res = Integer.parseInt(driver.findElement(result).getText());
        assertEquals(6, res);
    }
}