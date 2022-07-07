package org.example;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTestSecond {

    @Test
    public void OpenContextMenuAndClose() {
        contextMenuPage.open();
        contextMenuPage.onContextMenu();
        Alert alert = driver.switchTo().alert();
        String massage = alert.getText();
        Assert.assertEquals(massage,"You selected a context menu","error alert");
        alert.accept();
    }
}
