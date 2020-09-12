package tests;

import manager.TestBase;
import model.RetroConsole;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConsoleTest extends TestBase {

    Properties properties;


    @Test
    public void testTablet() throws IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        app.getConsoleHelper().search();
        app.getConsoleHelper().findGenesisGopher(properties.getProperty("web.consoleName"));
        app.getSpecificationHelper().getWindow(1);
        app.getSearchHelper().clickCharacteristic();
        ArrayList<WebElement> list = app.getConsoleHelper().getListPoints();

        RetroConsole retro = app.getConsoleHelper().getRetroConsole(list);

        RetroConsole model = app.getConsoleHelper().getModel();

        assertThat(model, equalTo(retro));
    }
}
