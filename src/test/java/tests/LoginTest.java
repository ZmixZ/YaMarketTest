package tests;

import manager.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        app.enterWebsite();
        app.getUserHelper().login("testzz123@yandex.ru", "Test123Test");
        app.getSpecificationHelper().getWindow(0);
        app.getUserHelper().goToYaMarketConfiguration();
        app.getUserHelper().changeData("Тест", "Тестов", "32", "Ноябрь",
                "1956", "Россия", "Рязань");
    }
}
