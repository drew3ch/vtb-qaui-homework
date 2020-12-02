package lesson06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page01 extends BasePage {

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

    public Page01(WebDriver driver) {
        super(driver);
    }

    public void onePlusThree() {
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(plusButton)).click().perform();
        actions.moveToElement(driver.findElement(threeButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void sixMultipleNine() {
        actions.moveToElement(driver.findElement(sixButton)).click().perform();
        actions.moveToElement(driver.findElement(multipleButton)).click().perform();
        actions.moveToElement(driver.findElement(nineButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void eightDivFour() {
        actions.moveToElement(driver.findElement(eightButton)).click().perform();
        actions.moveToElement(driver.findElement(divButton)).click().perform();
        actions.moveToElement(driver.findElement(fourButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void eightMinusTwo() {
        actions.moveToElement(driver.findElement(eightButton)).click().perform();
        actions.moveToElement(driver.findElement(minusButton)).click().perform();
        actions.moveToElement(driver.findElement(twoButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public String getRes() {
        return driver.findElement(result).getText();
    }
}