package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTestSecond {
    @Test
    public void toCheckTextInIFrame(){
        framesPage.open();
        framesPage.openLinkIFrame();
        Assert.assertEquals(framesPage.getTextIFrame(),"Your content goes here.","error iFrame");
    }
}
