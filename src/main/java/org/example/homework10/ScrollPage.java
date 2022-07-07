package org.example.homework10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollPage extends BasePage {

    @FindBy(xpath = "//h2/a[text()='Кошелек']")
    private WebElement element;

    public ScrollPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.onliner.by/");
    }

    public WebElement getElement() {
        return element;
    }
}
