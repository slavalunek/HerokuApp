package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inputs extends BaseTest{
    @Test
    public void inputsTest (){
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String value = driver.findElement(By.xpath("//*[@id='content']/div/div/div/input")).getAttribute("value");
        Assert.assertEquals(value,"0","error");

        driver.findElement(By.tagName("input")).sendKeys("sfdgsdg");
        String value1 =driver.findElement(By.xpath("//*[@id='content']/div/div/div/input")).getAttribute("value");
        Assert.assertEquals(value1,"0","error");

        driver.findElement(By.tagName("input")).sendKeys(".");
        String value2 =driver.findElement(By.xpath("//*[@id='content']/div/div/div/input")).getAttribute("value");
        Assert.assertEquals(value2,".","error");
    }
}
