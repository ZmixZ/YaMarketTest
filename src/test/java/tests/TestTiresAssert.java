package tests;

import manager.TestBase;
import model.Tires;
import org.testng.annotations.Test;

import java.util.List;

public class TestTiresAssert extends TestBase {

    @Test
    public void testT() throws InterruptedException {
        app.enterWebsite();
        app.getSearchHelper().searchByLinks();
        app.getTiresHelper().filterTires("1500", "6000");
        List<Tires> tires = app.getTiresHelper().listTires();
        for(Tires e : tires){
            System.out.println(e.getName());
        }
        //сделать хмл с названиями шин и потом сравнить хмл со списком
    }
}
