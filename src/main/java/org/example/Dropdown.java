package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest {
    @Test
    public void dropdownTest() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        String element1 = driver.findElement(By.xpath("//*[@id='dropdown']/option[2]")).getText();
        Assert.assertEquals(element1, "Option 1", "error");
        select.selectByVisibleText("Option 2");
        String element2 = driver.findElement(By.xpath("//*[@id='dropdown']/option[3]")).getText();
        Assert.assertEquals(element2, "Option 2", "error");
    }

}
