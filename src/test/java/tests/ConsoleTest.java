package tests;

import manager.TestBase;
import model.RetroConsole;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ConsoleTest extends TestBase {

    @Test
    public void testTablet() throws InterruptedException {
        app.enterWebsite();
        app.getConsoleHelper().search();
        app.getConsoleHelper().findGenesisGopher("Игровая приставка Genesis Gopher 2 (500 игр)");
        app.getSpecificationHelper().getWindow(1);
        app.getSearchHelper().clickCharacteristic();
        ArrayList<WebElement> list = app.getConsoleHelper().getListPoints();

        RetroConsole retro = app.getConsoleHelper().getRetroConsole(list);

        RetroConsole model = app.getConsoleHelper().getModel();

        Assert.assertEquals(model.getScreenDiagonal(), retro.getScreenDiagonal());
    }
}
