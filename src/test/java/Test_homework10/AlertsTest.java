package Test_homework10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BaseTest {

    @Test
    public void operationsWithAlerts() {
        alertsPage.open();
        alertsPage.clickButton1();
        Alert alert = driver.switchTo().alert();
        String Message = alert.getText();
        Assert.assertEquals(Message, "You clicked a button", "wrong message");
        alert.accept();

        alertsPage.clickButton2();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        String Message2 = alert.getText();
        Assert.assertEquals(Message2, "This alert appeared after 5 seconds", "wrong message");
        alert.accept();

        alertsPage.clickButton3();
        alert = driver.switchTo().alert();
        String Message3 = alert.getText();
        Assert.assertEquals(Message3, "Do you confirm action?", "wrong message");
        alert.dismiss();
        Assert.assertEquals(alertsPage.getTextFromMessage(),"You selected Cancel","wrong message");

        alertsPage.clickButton4();
        alert = driver.switchTo().alert();
        String Message4 = alert.getText();
        Assert.assertEquals(Message4, "Please enter your name", "wrong message");
        alert.sendKeys("Slava");
        alert.accept();
        Assert.assertEquals(alertsPage.getTextFromMessageWithMyName(),"You entered Slava",
                "wrong message");
    }
}
