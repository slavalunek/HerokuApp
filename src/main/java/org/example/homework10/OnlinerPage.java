package org.example.homework10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinerPage extends BasePage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement search;
    @FindBy(xpath = "//iframe[@class='modal-iframe']")
    private WebElement iframe;
    @FindBy(xpath = "//div[@class='product__title'][1]/a")
    private WebElement theNameFirstProduct;
    @FindBy(xpath = "//span[@class='search__close']")
    private WebElement buttonClose;
    @FindBy(xpath = "//span[@class='text_match']")
    private WebElement textFromFieldSearch;

    public OnlinerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://www.onliner.by/");
    }

    public WebElement FindFieldSearch() {
        return search;
    }

    public void switchingToIFrame() {
        driver.switchTo().frame(iframe);
    }

    public String getTextFirstName() {
        return theNameFirstProduct.getText();
    }

    public void clearFieldSearch() {
        search.clear();
    }

    public void clickButtonClose() {
        buttonClose.click();
    }

    public String getTextFromFieldSearch() {
        return textFromFieldSearch.getText();
    }
}
