package ru.geekbrains.qaui.lesson03.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
        driver.get("https://market.yandex.ru/");

        WebElement searchBox = driver.findElement(By.id("header-search"));
        searchBox.sendKeys("iphone se");
        searchBox.submit();

        WebElement filterBrand = driver.findElement(By.cssSelector(".\\_1-l0XiE_ze:nth-child(1) .\\_2RDCAZB4Gk .LhMupC0dLR"));
        filterBrand.click();

        WebElement filterMemory = driver.findElement(By.cssSelector(".\\_3_phr-spJh:nth-child(13) .\\_1-l0XiE_ze:nth-child(2) .LhMupC0dLR"));
        filterMemory.click();

        WebElement filterColor = driver.findElement(By.cssSelector("div:nth-child(2) > .\\_16hsbhrgAf .\\_1a0Sw63AKv"));
        filterColor.click();

        Thread.sleep(5000);

        WebElement selectFirst = driver.findElement(By.xpath(".//a[@title='Смартфон Apple iPhone SE (2020) 64GB']"));
        driver.get(selectFirst.getAttribute("href"));

        Thread.sleep(5000);

        WebElement addToCompare = driver.findElement(By.xpath(".//div[@data-tid-prop='dc1632ca 1badb8e1 cbc788aa']"));
        addToCompare.click();

        Thread.sleep(5000);

        WebElement searchBox2 = driver.findElement(By.id("header-search"));
        searchBox2.sendKeys("iphone 12");
        searchBox2.submit();

        Thread.sleep(5000);

        WebElement filterMemory2 = driver.findElement(By.cssSelector(".\\_3_phr-spJh:nth-child(12) .\\_1-l0XiE_ze:nth-child(2) .LhMupC0dLR"));
        filterMemory2.click();

        WebElement filterColor2 = driver.findElement(By.cssSelector(".\\_3AkppBjm-b:nth-child(1) .\\_1a0Sw63AKv"));
        filterColor2.click();

        Thread.sleep(5000);

        WebElement selectFirst2 = driver.findElement(By.xpath(".//a[@title='Смартфон Apple iPhone 12 64GB']"));
        driver.get(selectFirst2.getAttribute("href"));

        Thread.sleep(5000);

        WebElement addToCompare2 = driver.findElement(By.xpath(".//div[@data-tid-prop='dc1632ca 1badb8e1 cbc788aa']"));
        addToCompare2.click();

        Thread.sleep(5000);

        driver.get("https://market.yandex.ru/my/compare-lists");

        Thread.sleep(5000);

        WebElement goToiPhoneSE = driver.findElement(By.linkText("Смартфон Apple iPhone SE (2020) 64GB"));
        goToiPhoneSE.click();

        Thread.sleep(5000);

        WebElement price = driver.findElement(By.cssSelector(".\\_3Kj2EY9ihg .\\_2XmtVnQ64x"));
        price.click();

        Thread.sleep(5000);

        WebElement sort = driver.findElement(By.cssSelector(".\\_2zH77vazcW:nth-child(4)"));
        sort.click();

        Thread.sleep(5000);

        WebElement goShop = driver.findElement(By.cssSelector(".\\_1vFSS76Axn:nth-child(1) .\\_2bJkM3bRx4 .\\_2IwbFpEZn7"));
        goShop.click();

        driver.quit();
    }
}
