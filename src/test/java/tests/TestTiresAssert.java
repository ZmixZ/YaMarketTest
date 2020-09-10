package tests;

import manager.TestBase;
import model.Tires;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class TestTiresAssert extends TestBase {

    Properties properties;

    @Test
    public void testT() throws InterruptedException, IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        app.enterWebsite();
        Thread.sleep(4000);
        app.getSearchHelper().searchByLinks();
        app.getTiresHelper().filterTires(properties.getProperty("web.lowPrice"), properties.getProperty("web.hightPrice"));
        List<Tires> tires = app.getTiresHelper().listTires();

        List<Tires> list = app.getTiresHelper().listModelTires();

        MatcherAssert.assertThat(list, CoreMatchers.equalTo(tires));

    }
}
