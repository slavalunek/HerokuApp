package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class DynamicControlsPage extends BasePage {

    private final By CHECKBOX = By.xpath("//input[@type='checkbox']");
    private final By REMOVE = By.xpath("//button[text()='Remove']");
    private final By IT_IS_GONE = By.id("message");
    private final By ENABLE = By.xpath("//button[@onclick='swapInput()']");
    private final By IT_IS_ENABLED = By.id("message");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    }

    public void clickRemove() {
        driver.findElement(REMOVE).click();
    }

    public String getTextItIsGone() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(IT_IS_GONE));
        return driver.findElement(IT_IS_GONE).getText();
    }

    public List<WebElement> getCheckbox() {
        return driver.findElements(CHECKBOX);
    }

    public String getTextEnable() {
        return driver.findElement(ENABLE).getText();
    }

    public void clickEnable(){
        driver.findElement(ENABLE).click();
    }
    public String getTextItIsEnabled(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(IT_IS_ENABLED));
        return driver.findElement(IT_IS_ENABLED).getText();
    }
}
