package tests;

import manager.TestBase;
import model.Tires;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TabletTest extends TestBase {

    @Test
    public void testTablet() throws InterruptedException {
        app.enterWebsite();
        app.driver.findElement(By.xpath("//span[text()='Электроника']/..")).click();
        app.driver.findElement(By.xpath("//a[text()='Планшеты']")).click();
        List tablet = app.driver.findElements(By.xpath("//h3[./a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']]"));
        Thread.sleep(10000);
    }
}
