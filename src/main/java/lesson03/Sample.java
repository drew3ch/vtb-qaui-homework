package lesson03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {


    public static void main(String[] args) throws InterruptedException {


        // Указываем путь к драйверу. Это необходимо для всех драйверов кроме Firefox до 46 версии.
        // Версия драйвера Google Chrome должна соответствовать версии установленного Google Chrome на вашем компьютере
        // Скачать Google Chrome драйвер можно здесь http://chromedriver.chromium.org/downloads
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

        // ИЛИ

        // Этот второй способ инициализировать драйвер. В данном случае не используются .exe. файлы дравера из \resources
        // Это сторонняя библиотека webdrivermanager. Она сама скачивает драйвер и использует его для теста
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Thread.sleep(3000);
//        driver.manage().window().fullscreen();

        // OnLoad событие
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(1000);
        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(1000);
        searchBox.sendKeys("pickles");
        Thread.sleep(1000);
        searchBox.submit();

        Thread.sleep(1000);

        // Дополнительный способ перейти на страницу
        // driver.get() == driver.navigate().to()
        driver.navigate().to("https://dictionary.cambridge.org");
        Thread.sleep(1000);

        WebElement cambridgeSearchBox = driver.findElement(By.id("searchword"));
        Thread.sleep(1000);
        cambridgeSearchBox.sendKeys("carrot");
        Thread.sleep(1000);
        cambridgeSearchBox.submit();

        // Основные функции навигации браузера
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.quit();
    }
}
