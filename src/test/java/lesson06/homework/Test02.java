package lesson06.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test02 {

    private static final By clear = By.xpath("//input[@class='ZEB7Fb vk_gy vk_sh Hg3mWc']");
    private static final By set = By.xpath("//input[@class='ZEB7Fb vk_gy vk_sh Hg3mWc']");
    private static final By result = By.xpath("//input[@class='a61j6 vk_gy vk_sh Hg3mWc']");

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
    public void currency() {
        Actions actions = new Actions(driver);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("150 долларов в рублях");
        q.submit();

        driver.findElement(clear).clear();
        actions.moveToElement(driver.findElement(set)).click().sendKeys("200").perform();

        assertEquals("15215.78", driver.findElement(result).getAttribute("value"));
    }

}