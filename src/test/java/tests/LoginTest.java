package tests;

import manager.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        app.enterWebsite();
        app.getUserHelper().login();
        app.getSpecificationHelper().getWindow(0);
        app.getUserHelper().goToYaMarketConfiguration();
        app.getUserHelper().changeData();

    }
}
