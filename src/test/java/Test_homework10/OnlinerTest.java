package Test_homework10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinerTest extends BaseTest{
    @Test
    public void productSearchThroughInputField(){

        onlinerPage.open();
        onlinerPage.FindFieldSearch().sendKeys("Тостер");
        onlinerPage.switchingToIFrame();
        String nameFirstProduct = onlinerPage.getTextFirstName();
        onlinerPage.clearFieldSearch();
        onlinerPage.FindFieldSearch().sendKeys(nameFirstProduct);
        onlinerPage.clickButtonClose();
        Assert.assertEquals(onlinerPage.getTextFromFieldSearch(),"Тостер Philips HD2581/00","wrong product");
    }
}
