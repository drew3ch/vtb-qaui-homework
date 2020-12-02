package ru.geekbrains.qaui.lesson03.homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test01 {

    private static final By zeroButton = By.xpath("//div[@jsname='bkEvMb']");
    private static final By oneButton = By.xpath("//div[@jsname='N10B9']");
    private static final By twoButton = By.xpath("//div[@jsname='lVjWed']");
    private static final By threeButton = By.xpath("//div[@jsname='KN1kY']");
    private static final By fourButton = By.xpath("//div[@jsname='xAP7E']");
    private static final By fiveButton = By.xpath("//div[@jsname='Ax5wH']");

    private static final By sixButton = By.xpath("//div[@jsname='abcgof']");
    private static final By eightButton = By.xpath("//div[@jsname='T7PMFe']");
    private static final By nineButton = By.xpath("//div[@jsname='XoxYJ']");

    private static final By plusButton = By.xpath("//div[@jsname='XSr6wc']");
    private static final By minusButton = By.xpath("//div[@jsname='pPHzQc']");
    private static final By divButton = By.xpath("//div[@jsname='WxTTNd']");
    private static final By multipleButton = By.xpath("//div[@jsname='YovRWb']");

    private static final By opButton = By.xpath("//div[@jsname='j93WEe']");
    private static final By cpButton = By.xpath("//div[@jsname='qCp9A']");
    private static final By equalButton = By.xpath("//div[@jsname='Pt8tGc']");
    private static final By resetButton = By.xpath("//div[@jsname='SLn8gc']");

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        driver.findElement(oneButton).click();
        driver.findElement(plusButton).click();
        driver.findElement(threeButton).click();
        driver.findElement(equalButton).click();

        driver.findElement(resetButton).click();

        driver.findElement(sixButton).click();
        driver.findElement(multipleButton).click();
        driver.findElement(nineButton).click();
        driver.findElement(equalButton).click();

        driver.findElement(resetButton).click();

        driver.findElement(eightButton).click();
        driver.findElement(divButton).click();
        driver.findElement(fourButton).click();
        driver.findElement(equalButton).click();

        driver.findElement(resetButton).click();

        driver.findElement(eightButton).click();
        driver.findElement(fiveButton).click();
        driver.findElement(twoButton).click();
        driver.findElement(minusButton).click();
        driver.findElement(threeButton).click();
        driver.findElement(twoButton).click();
        driver.findElement(oneButton).click();
        driver.findElement(equalButton).click();

        driver.findElement(resetButton).click();

        driver.findElement(opButton).click();
        driver.findElement(fiveButton).click();
        driver.findElement(zeroButton).click();
        driver.findElement(minusButton).click();
        driver.findElement(twoButton).click();
        driver.findElement(cpButton).click();
        driver.findElement(multipleButton).click();
        driver.findElement(fourButton).click();
        driver.findElement(equalButton).click();

        driver.findElement(resetButton).click();

        driver.quit();
    }
}