package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hovers extends BaseTest{
    @Test
    public void hoversTest(){
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement one = driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
        action.moveToElement(one).moveToElement(driver.findElement(By.xpath("//a[@href='/users/1']"))).click().perform();
        String aaa = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(aaa,"Not Found","error");
    }
}
