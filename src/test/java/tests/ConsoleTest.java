package tests;

import manager.TestBase;
import model.RetroConsole;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConsoleTest extends TestBase {

    @Test
    public void testTablet() throws InterruptedException {
        app.enterWebsite();
        app.getConsoleHelper().search();
        app.getConsoleHelper().findGenesisGopher();
        app.getSpecificationHelper().getWindow(1);
        app.getSearchHelper().clickCharacteristic();
        ArrayList<WebElement> list = app.getConsoleHelper().getListPoints();

        RetroConsole retro = new RetroConsole().withFormFactor(list.get(1).getText()).withForm(list.get(2).getText()).
                withScreenDiagonal(list.get(3).getText()).withScreenResolution(list.get(4).getText()).
                withArchitecture(list.get(5).getText()).withMediaType(list.get(6).getText()).
                withMemoryCardSlot(list.get(7).getText()).withPreinstallGames(list.get(8).getText()).
                withBattery(list.get(9).getText()).withBatteryCapacity(list.get(10).getText()).
                withLength(list.get(11).getText()).withWidth(list.get(12).getText()).withHeight(list.get(13).getText()).
                withWeight(list.get(14).getText()).withAnotherInformation(list.get(15).getText());

        RetroConsole model = app.getConsoleHelper().getModel();

        Assert.assertEquals(model.getScreenDiagonal(), retro.getScreenDiagonal());
    }
}
