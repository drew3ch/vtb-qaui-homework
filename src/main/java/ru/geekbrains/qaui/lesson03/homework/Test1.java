package ru.geekbrains.qaui.lesson03.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://market.yandex.ru/");

        WebElement menu = driver.findElement(By.cssSelector("div:nth-child(5) > .\\_35SYuInI1T .\\_3z8GfB4w3a"));
        menu.click();

        WebElement submenu = driver.findElement(By.linkText("Смартфоны"));
        submenu.click();

        WebElement rating = driver.findElement(By.cssSelector(".\\_2zH77vazcW:nth-child(4)"));
        rating.click();

        WebElement filterBrand = driver.findElement(By.cssSelector(".\\_1-l0XiE_ze:nth-child(1) .\\_2RDCAZB4Gk .LhMupC0dLR"));
        filterBrand.click();

        WebElement filterMemory = driver.findElement(By.cssSelector(".\\_3_phr-spJh:nth-child(12) .\\_1-l0XiE_ze:nth-child(2) .LhMupC0dLR"));
        filterMemory.click();

        WebElement filterColor = driver.findElement(By.cssSelector(".\\_3AkppBjm-b:nth-child(1) .\\_1a0Sw63AKv"));
        filterColor.click();

        driver.quit();
    }
}
