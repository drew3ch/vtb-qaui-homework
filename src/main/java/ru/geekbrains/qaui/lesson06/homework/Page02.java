package ru.geekbrains.qaui.lesson06.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page02 extends BasePage {

    private static final By clear = By.xpath("//input[@class='ZEB7Fb vk_gy vk_sh Hg3mWc']");
    private static final By set = By.xpath("//input[@class='ZEB7Fb vk_gy vk_sh Hg3mWc']");
    private static final By result = By.xpath("//input[@class='a61j6 vk_gy vk_sh Hg3mWc']");

    public Page02(WebDriver driver) {
        super(driver);
    }

    public Double getRes() {
        return Double.parseDouble(driver.findElement(result).getAttribute("value"));
    }

    public void currency() {
        driver.findElement(clear).clear();
        actions.moveToElement(driver.findElement(set)).click().sendKeys("200").pause(1000).build().perform();
    }
}