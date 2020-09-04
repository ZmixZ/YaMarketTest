package tests;

import manager.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TabletTest extends TestBase {

    @Test
    public void testTablet() throws InterruptedException {
        app.enterWebsite();
        app.driver.findElement(By.xpath("//span[text()='Электроника']/..")).click();
        app.driver.findElement(By.xpath("//a[text()='Ретро консоли']")).click();
        List<WebElement> tablet = app.driver.findElements(By.xpath("//h3[@class='_3dCGE8Y9v3 _25uOAS5e4A']//a"));
        for(WebElement i : tablet){
            if(i.getText().equals("Игровая приставка Genesis Gopher 2 (500 игр)")){
                app.driver.findElement(By.linkText("Игровая приставка Genesis Gopher 2 (500 игр)")).click();}
        }
        app.getSpecificationHelper().getWindow(1);
        app.getSearchHelper().clickCharacteristic();
        Thread.sleep(8000);
    }
}
