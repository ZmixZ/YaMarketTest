package tests;

import manager.TestBase;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoginTest extends TestBase {

    Properties properties;

    @Test
    public void loginTest() throws IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        app.enterWebsite();
        app.getUserHelper().login(properties.getProperty("web.email"), properties.getProperty("web.pass"));
        app.getSpecificationHelper().getWindow(0);
        app.getUserHelper().goToYaMarketConfiguration();
        app.getUserHelper().changeData(properties.getProperty("web.name"), properties.getProperty("web.lastname"),
                properties.getProperty("web.day"), properties.getProperty("web.month"),
                properties.getProperty("web.year"), properties.getProperty("web.country"),
                properties.getProperty("web.city"));
    }
}
