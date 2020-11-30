package lesson06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page03 extends BasePage {

    private static final By sinButton = By.xpath("//div[@jsname='aN1RFf']");
    private static final By cosButton = By.xpath("//div[@jsname='w0Xmgb']");
    private static final By tanButton = By.xpath("//div[@jsname='VsnRKc']");
    private static final By oneButton = By.xpath("//div[@jsname='N10B9']");
    private static final By equalButton = By.xpath("//div[@jsname='Pt8tGc']");

    private static final By result = By.xpath("//span[@jsname='VssY5c']");

    public Page03(WebDriver driver) {
        super(driver);
    }

    public String getRes() {
        return driver.findElement(result).getText();
    }

    public void sin() {
        actions.moveToElement(driver.findElement(sinButton)).click().perform();
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void cos() {
        actions.moveToElement(driver.findElement(cosButton)).click().perform();
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }

    public void tan() {
        actions.moveToElement(driver.findElement(tanButton)).click().perform();
        actions.moveToElement(driver.findElement(oneButton)).click().perform();
        actions.moveToElement(driver.findElement(equalButton)).click().perform();
    }
}