package org.example.homework10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BasePage {

    @FindBy(id = "alertButton")
    private WebElement button1;
    @FindBy(id = "timerAlertButton")
    private WebElement button2;
    @FindBy(id = "confirmButton")
    private WebElement button3;
    @FindBy(id = "confirmResult")
    private WebElement message;
    @FindBy(id = "promtButton")
    private WebElement button4;
    @FindBy(id = "promptResult")
    private WebElement messageWithMyName;

    public AlertsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://demoqa.com/alerts");
    }

    public void clickButton1() {
        button1.click();
    }

    public void clickButton2() {
        button2.click();
    }

    public void clickButton3() {
        button3.click();
    }

    public String getTextFromMessage() {
        return message.getText();
    }

    public void clickButton4() {
        button4.click();
    }

    public String getTextFromMessageWithMyName() {
        return messageWithMyName.getText();
    }
}
