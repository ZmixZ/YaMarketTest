package tests;

import manager.TestBase;
import model.NintendoSpecification;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestAssertCharacteristic extends TestBase {

    Properties properties;

  @Test
  public void testS() throws Exception {

      properties = new Properties();
      properties.load(new FileReader(new File("src/test/resources/local.properties")));
    app.getSearchHelper().searchProduct(properties.getProperty("web.switch"));
    app.getSearchHelper().clickProduct(properties.getProperty("web.defaultSwitch"));
    String oneTab = app.getSearchHelper().saveOldTab(); // сохраняем первую вкладку
    app.getSpecificationHelper().getWindow(1);
    app.getSearchHelper().clickCharacteristic();
    List<WebElement> list = app.getSpecificationHelper().getListPoints();

    NintendoSpecification nt = app.getSpecificationHelper().getNintendoCharacteristic(list.get(1).getText(), list.get(3).getText(),
            list.get(16).getText(), list.get(17).getText(),
            app.getSpecificationHelper().getSetColors().iterator().next(),
            list.get(8).getText(), list.get(15).getText());

    app.getSearchHelper().searchProduct(properties.getProperty("web.switch"));
        app.getSearchHelper().clickProduct(properties.getProperty("web.liteSwitch"));
        app.getSpecificationHelper().getWindow(2);
        app.getSearchHelper().clickCharacteristic();
        List<WebElement> list1 = app.getSpecificationHelper().getListPoints();

        NintendoSpecification nt1 = app.getSpecificationHelper().getNintendoCharacteristic(list1.get(1).getText(),
        list1.get(2).getText(), null, null,
        app.getSpecificationHelper().getSetColors().iterator().next(), list1.get(12).getText(), list1.get(19).getText());

        assertThat(nt, equalTo(nt1));

        }
        }
