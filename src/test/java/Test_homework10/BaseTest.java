package Test_homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.homework10.AlertsPage;
import org.example.homework10.OnlinerPage;
import org.example.homework10.ScrollPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    AlertsPage alertsPage;
    WebDriverWait wait;
    OnlinerPage onlinerPage;
    ScrollPage scrollPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        alertsPage = new AlertsPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        onlinerPage = new OnlinerPage(driver);
        scrollPage = new ScrollPage(driver);
    }
}
