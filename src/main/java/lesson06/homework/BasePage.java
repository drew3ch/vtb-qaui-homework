package lesson06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {

    protected WebDriver driver;
    protected final Actions actions;
    protected By q = By.name("q");

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public void gLink() {
        driver.get("https://www.google.ru/");
    }

    public void gReq(String s) {
        WebElement req = driver.findElement(q);
        req.clear();
        req.sendKeys(s);
        req.submit();
    }

}