package Test_homework10;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class scrollTest extends BaseTest{

    @Test
    public void testScroll(){
        scrollPage.open();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ( "window.scrollBy(0,100)" , "" );
        js.executeScript("arguments[0].scrollIntoView(true);",scrollPage.getElement());
        js.executeScript("window.scrollTo(0, document.querySelector(\".g-middle\").scrollHeight);");
        js.executeScript("window.scrollTo(0, -document.querySelector(\".g-middle\").scrollHeight);");
    }
}
