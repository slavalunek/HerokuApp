package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessages extends BaseTest {
    @Test
    public void notificationMessagesTest() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.cssSelector("a[href='/notification_message']")).click();
        String message = driver.findElement(By.id("flash")).getText();

        if (message.equals("Action successful" + "\n×")) {
            Assert.assertEquals(message, "Action successful" + "\n×", "error");
        } else {
            Assert.assertEquals(message, "Action unsuccesful, please try again" + "\n×", "error");
        }
    }
}
