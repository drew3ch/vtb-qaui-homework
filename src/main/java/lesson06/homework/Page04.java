package lesson06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page04 extends BasePage {

    private static final By factButton = By.xpath("//div[@jsname='SfS5gd']");
    private static final By logButton = By.xpath("//div[@jsname='DfiOAc']");
    private static final By squareButton = By.xpath("//div[@jsname='oQcVc']");
    private static final By fiveButton = By.xpath("//div[@jsname='Ax5wH']");
    private static final By nineButton = By.xpath("//div[@jsname='XoxYJ']");
    private static final By equalButton = By.xpath("//div[@jsname='Pt8tGc']");

    private static final By result = By.xpath("//span[@jsname='VssY5c']");

    public Page04(WebDriver driver) {
        super(driver);
    }

    public String getRes() {
        return driver.findElement(result).getText();
    }

    public void factorial() {
        actions.moveToElement(driver.findElement(fiveButton)).click().perform();
        actions.moveToElement(driver.findElement(factButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void log() {
        actions.moveToElement(driver.findElement(logButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void squareroot() {
        actions.moveToElement(driver.findElement(squareButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }
}