package tests;

import manager.TestBase;
import model.RetroConsole;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
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
        List<WebElement> list = new ArrayList<>();
        List<WebElement> characteristics = app.driver.findElements(By.tagName("dd"));
        for(WebElement i : characteristics){
            list.add(i);
        }
        RetroConsole retro = new RetroConsole().withFormFactor(list.get(1).getText()).withForm(list.get(2).getText()).
                withScreenDiagonal(list.get(3).getText()).withScreenResolution(list.get(4).getText()).
                withArchitecture(list.get(5).getText()).withMediaType(list.get(6).getText()).
                withMemoryCardSlot(list.get(7).getText()).withPreinstallGames(list.get(8).getText()).
                withBattery(list.get(9).getText()).withBatteryCapacity(list.get(10).getText()).
                withLength(list.get(11).getText()).withWidth(list.get(12).getText()).withHeight(list.get(13).getText()).
                withWeight(list.get(14).getText()).withAnotherInformation(list.get(15).getText());

        RetroConsole model = new RetroConsole().withFormFactor("портативная").withForm("моноблок").
                withScreenDiagonal("4.3 \"").withScreenResolution("480x272").
                withArchitecture("16-бит").withMediaType("microSD").
                withMemoryCardSlot("есть").withPreinstallGames("500").
                withBattery("аккумулятор").withBatteryCapacity("2000 мА·час").
                withLength("170 мм").withWidth("18 мм").withHeight("82 мм").
                withWeight("120 г").withAnotherInformation("поддержка игр: NES/FC, GB, GBC, SMS, SMD, SFC/SNES, GBA");

        Assert.assertEquals(model.getScreenDiagonal(), retro.getScreenDiagonal());
    }
}
