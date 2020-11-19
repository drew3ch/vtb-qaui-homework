package lesson03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Sample2 {


    public static void main(String[] args) {


        // Указываем путь к драйверу. Это необходимо для всех драйверов кроме Firefox до 46 версии.
        // Версия драйвера Google Chrome должна соответствовать версии установленного Google Chrome на вашем компьютере
        // Скачать Google Chrome драйвер можно здесь http://chromedriver.chromium.org/downloads
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver_84.exe");

        // ИЛИ

        // Этот второй способ инициализировать драйвер. В данном случае не используются .exe. файлы дравера из \resources
        // Это сторонняя библиотека webdrivermanager. Она сама скачивает драйвер и использует его для теста
         WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // OnLoad событие
        driver.get("http://www.google.com/xhtml");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("pickles");
        searchBox.submit();

//      ExpectedConditions содержит большое количество готовых условий
        new WebDriverWait(driver, 10, 500)
                .until(ExpectedConditions.visibilityOf(searchBox));

//        Тем не менее у разработчика всегда есть возможность написать собственное условие для ожидания
        new WebDriverWait(driver, 10, 500).until(webDriver -> searchBox.isDisplayed());

//        FluentWait это еще один способ создания Explicit wait
        new FluentWait<>(driver)
                .withMessage("Element was not found")
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .until(ExpectedConditions.visibilityOf(searchBox));

        new FluentWait<>(driver)
                .withMessage("Element was not found")
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .until(webDriver -> searchBox.isDisplayed());

        // Дополнительный способ перейти на страницу
        // driver.get() == driver.navigate().to()
        driver.navigate().to("https://dictionary.cambridge.org");

        WebElement cambridgeSearchBox = driver.findElement(By.id("searchword"));
        cambridgeSearchBox.sendKeys("carrot");
        cambridgeSearchBox.submit();

        // Основные функции навигации браузера
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
    }
}
