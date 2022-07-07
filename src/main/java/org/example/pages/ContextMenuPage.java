package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {

    private final By ON_CONTEXT_MENU = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }

    public void onContextMenu() {
        WebElement square = driver.findElement(ON_CONTEXT_MENU);
        Actions actions = new Actions(driver);
        actions.contextClick(square).build().perform();
    }
}
