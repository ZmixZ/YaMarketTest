package tests;

import manager.TestBase;
import model.Tires;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class TestTiresAssert extends TestBase {

    Properties properties;

    @Test
    public void testT() throws InterruptedException, IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        app.enterWebsite();
        app.getSearchHelper().searchByLinks();
        app.getTiresHelper().filterTires(properties.getProperty("web.lowPrice"), properties.getProperty("web.hightPrice"));
        List<Tires> tires = app.getTiresHelper().listTires();
        for(Tires e : tires){
            System.out.println(e.getName());
        }
        //сделать хмл с названиями шин и потом сравнить хмл со списком
    }
}
