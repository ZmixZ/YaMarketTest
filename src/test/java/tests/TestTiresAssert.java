package tests;

import manager.TestBase;
import model.Tires;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestTiresAssert extends TestBase {

    Properties properties;

    @Test
    public void testT() throws InterruptedException, IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        Thread.sleep(6000);
        app.getSearchHelper().searchByLinks();
        app.getTiresHelper().filterTires(properties.getProperty("web.lowPrice"), properties.getProperty("web.hightPrice"));
        List<Tires> tires = app.getTiresHelper().listTires();

        List<Tires> list = app.getTiresHelper().listModelTires();

        assertThat(list, equalTo(tires));

    }
}
