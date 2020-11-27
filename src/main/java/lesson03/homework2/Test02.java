package lesson03.homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test02 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("150 долларов в рублях");
        q.submit();

        driver.findElement(By.xpath("//input[@class='ZEB7Fb vk_gy vk_sh Hg3mWc']")).clear();
        driver.findElement(By.xpath("//input[@class='ZEB7Fb vk_gy vk_sh Hg3mWc']")).sendKeys("200");
        driver.findElement(By.xpath("//select[@class='l84FKc R9zNe vk_bk Uekwlc']")).click();
        driver.findElement(By.xpath("//select[@class='l84FKc R9zNe vk_bk Uekwlc']//option[@value='/m/0kz1h']")).click();

        driver.findElement(By.xpath("//div[@data-period='1d']")).click();
        driver.findElement(By.xpath("//div[@data-period='5d']")).click();
        driver.findElement(By.xpath("//div[@data-period='1M']")).click();
        driver.findElement(By.xpath("//div[@data-period='1Y']")).click();
        driver.findElement(By.xpath("//div[@data-period='5Y']")).click();
        driver.findElement(By.xpath("//div[@data-period='40Y']")).click();

        driver.quit();
    }
}