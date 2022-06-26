package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes extends BaseTest {
    @Test
    public void CheckboxesTest() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        Assert.assertFalse(driver.findElement(By.cssSelector("[type=checkbox]")).isSelected(), "Checkbox is checked");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("[type=checkbox]")).isSelected(), "Checkbox is unchecked");

        Assert.assertTrue(driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected(), "Checkbox is unchecked");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(1).click();
        Assert.assertFalse(driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected(), "Checkbox is checked");
    }
}
