package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTestSecond {

    WebDriver driver;
    ContextMenuPage contextMenuPage;
    DynamicControlsPage dynamicControlsPage;
    FileUploadPage fileUpload;
    FramesPage framesPage;
    FileDownloadPage fileDownloadPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        fileUpload = new FileUploadPage(driver);
        framesPage = new FramesPage(driver);
        fileDownloadPage = new FileDownloadPage(driver);
    }
}