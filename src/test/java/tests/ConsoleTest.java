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

        RetroConsole retro = app.getConsoleHelper().getRetroConsole(list);

        RetroConsole model = app.getConsoleHelper().getModel();

        Assert.assertEquals(model.getScreenDiagonal(), retro.getScreenDiagonal());
    }
}
