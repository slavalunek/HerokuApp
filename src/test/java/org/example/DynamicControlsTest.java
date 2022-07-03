package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTestSecond {
    @Test
    public void removeCheckbox() {
        dynamicControlsPage.open();
        dynamicControlsPage.clickRemove();
        Assert.assertEquals(dynamicControlsPage.getTextItIsGone(), "It's gone!", "the text \"It's gone!\" didn't find");
        Assert.assertEquals(dynamicControlsPage.getCheckbox().size(), 0,"checkbox didn't remove");
    }
    @Test
    public void enable(){
        dynamicControlsPage.open();
        Assert.assertEquals(dynamicControlsPage.getTextEnable(),"Enable","It's not Enable");
        dynamicControlsPage.clickEnable();
        Assert.assertEquals(dynamicControlsPage.getTextItIsEnabled(),"It's enabled!","error");
        Assert.assertEquals(dynamicControlsPage.getTextEnable(),"Disable","It's not Disable");
    }
}
