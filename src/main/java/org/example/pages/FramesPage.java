package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage{

    private final By lINK_IFRAME = By.xpath("//a[@href='/iframe']");
    private final By TEXT_IFRAME = By.xpath("//p");
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("http://the-internet.herokuapp.com/frames");
    }

    public void openLinkIFrame(){

        driver.findElement(lINK_IFRAME).click();
    }

    public String getTextIFrame(){

        driver.switchTo().frame("mce_0_ifr");
        return driver.findElement(TEXT_IFRAME).getText();
    }
}
