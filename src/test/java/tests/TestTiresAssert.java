package tests;

import manager.TestBase;
import model.Tires;
import org.testng.annotations.Test;

import java.util.List;

public class TestTiresAssert extends TestBase {

    @Test
    public void testT() throws InterruptedException {
        app.enterWebsite();
        app.getTiresHelper().test();
        List<Tires> tires = app.getTiresHelper().listTires();
        for(Tires e : tires){
            System.out.println(e.getName());
        }
        //сделать хмл с названиями шин и потом сравнить хмл со списком
    }
}
