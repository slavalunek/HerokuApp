package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortableDataTables extends BaseTest{
    @Test
    public void SortableDataTablesTest(){
        driver.get("http://the-internet.herokuapp.com/tables#delete");
        String cell1 = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getText();
        Assert.assertEquals(cell1,"John","не совпадение ячеек");

        String cell2 = driver.findElement(By.xpath("//table[2]//tr[1]//td[4]")).getText();
        Assert.assertEquals(cell2,"$50.00","не совпадение ячеек");

        String cell3 = driver.findElement(By.xpath("//table[2]//tr[2]//td[3]")).getText();
        Assert.assertEquals(cell3,"fbach@yahoo.com","не совпадение ячеек");
    }
}
