package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage{

    private final By FILE_NAME = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("http://the-internet.herokuapp.com/upload");
    }
    public void fileDownload(){
        driver.findElement(By.id("file-upload")).sendKeys("D:\\curses\\HerokuApp\\src\\main\\resources\\TestFile");
        driver.findElement(By.id("file-submit")).click();
    }

    public String getUploadedFile(){
        return driver.findElement(FILE_NAME).getText();
    }
}
