package tests;

import manager.TestBase;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestTiresAssert extends TestBase {

    @Test
    public void testT() throws InterruptedException {

        //app.driver.findElement(By.xpath("//div[@class='_10dWCjaZug']")).click();
        app.driver.findElement(By.xpath("//div[@class='PXL2nleaah']")).click();
        app.driver.findElement(By.id("41042240-tab")).click();
        app.driver.findElement(By.xpath("//a[text()='Шины']/..")).click();
        Thread.sleep(10000);

    }
}
