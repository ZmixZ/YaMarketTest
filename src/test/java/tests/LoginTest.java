package tests;

import manager.TestBase;
import model.User;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class LoginTest extends TestBase {

    Properties properties;

    @DataProvider
    public Iterator<Object[]> iterator(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new User().withName("Тест").withLastname("Тестов").withDay("23")
                .withYear(Integer.parseInt("1987")).withCity("Москва")});
        return list.iterator();
    }

    @Test(dataProvider = "iterator")
    public void loginTest(User user) throws IOException, InterruptedException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        app.getUserHelper().login(properties.getProperty("web.email"), properties.getProperty("web.pass"));
        app.getSpecificationHelper().getWindow(0);
        app.getUserHelper().goToYaMarketConfiguration();
        User userInYaMarket = app.getUserHelper().changeData(properties.getProperty("web.name"), properties.getProperty("web.lastname"),
                properties.getProperty("web.day"), properties.getProperty("web.month"),
                properties.getProperty("web.year"), properties.getProperty("web.country"),
                properties.getProperty("web.city"));
        User modelUser = user;

        assertThat(modelUser, equalTo(userInYaMarket));

    }
}
