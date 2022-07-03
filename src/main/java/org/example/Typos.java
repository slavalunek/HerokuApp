package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Typos extends BaseTest{
    @Test
    public void typosTest(){
        driver.get("http://the-internet.herokuapp.com/typos");
        String textExpected1 = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
        String text1 = driver.findElement(By.tagName("p")).getText();
        Assert.assertEquals(text1,textExpected1,"error in text" );

        String textExpected2 ="Sometimes you'll see a typo, other times you won't.";
        String text2 =driver.findElement(By.xpath("//*[@id='content']/div/p[2]")).getText();
        Assert.assertEquals(text2,textExpected2,"error in text" );

    }
}
