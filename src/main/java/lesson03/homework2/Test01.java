package lesson03.homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        driver.get("https://www.google.ru/");

        WebElement q = driver.findElement(By.name("q"));
        q.sendKeys("калькулятор");
        q.submit();

        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

        driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();

        driver.findElement(By.xpath("//div[@jsname='abcgof']")).click();
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        driver.findElement(By.xpath("//div[@jsname='XoxYJ']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

        driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();

        driver.findElement(By.xpath("//div[@jsname='T7PMFe']")).click();
        driver.findElement(By.xpath("//div[@jsname='WxTTNd']")).click();
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

        driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();

        driver.findElement(By.xpath("//div[@jsname='T7PMFe']")).click();
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

        driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();

        driver.findElement(By.xpath("//div[@jsname='j93WEe']")).click();
        driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
        driver.findElement(By.xpath("//div[@jsname='bkEvMb']")).click();
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();
        driver.findElement(By.xpath("//div[@jsname='qCp9A']")).click();
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click();
        driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

        driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();

        driver.quit();
    }
}