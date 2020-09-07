package tests;

import manager.TestBase;
import model.NintendoSpecification;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestAssertCharacteristic extends TestBase {

  @Test
  public void testS() throws Exception {
    app.enterWebsite();
    app.getSearchHelper().searchProduct("nintendo switch");
    app.getSearchHelper().clickProduct("Игровая приставка Nintendo Switch");
    String oneTab = app.getSearchHelper().saveOldTab(); // сохраняем первую вкладку
    app.getSpecificationHelper().getWindow(1);
    app.getSearchHelper().clickCharacteristic();
    List<WebElement> list = app.getSpecificationHelper().getListPoints();

    NintendoSpecification nt = app.getSpecificationHelper().getNintendoCharacteristic(list.get(1).getText(), list.get(3).getText(),
            list.get(16).getText(), list.get(17).getText(),
            app.getSpecificationHelper().getSetColors().iterator().next(),
            list.get(8).getText(), list.get(15).getText());

    app.getSearchHelper().searchProduct("nintendo switch");
        app.getSearchHelper().clickProduct("Игровая приставка Nintendo Switch Lite");
        app.getSpecificationHelper().getWindow(2);
        app.getSearchHelper().clickCharacteristic();
        List<WebElement> list1 = app.getSpecificationHelper().getListPoints();

        NintendoSpecification nt1 = app.getSpecificationHelper().getNintendoCharacteristic(list1.get(1).getText(),
        list1.get(2).getText(), null, null,
        app.getSpecificationHelper().getSetColors().iterator().next(), list1.get(12).getText(), list1.get(19).getText());

        assertThat(nt, equalTo(nt1));

        }
        }
