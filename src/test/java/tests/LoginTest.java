package tests;

import manager.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        app.enterWebsite();
        app.driver.findElement(By.linkText("Войти")).click();
        app.getSpecificationHelper().getWindow(1);
        app.getSearchHelper().type(By.xpath("//input[@type='text']"), By.xpath("//button[@type='submit']"), "testzz123@yandex.ru");
        app.getSearchHelper().type(By.xpath("//input[@name='passwd']"),
                By.xpath("//button[@type='submit']"), "Test123Test");
        app.getSpecificationHelper().getWindow(0);
        app.driver.findElement(By.xpath("//button[@class='_1YeOF5Jcfi _3qbyNoLh_b']")).click();
        app.driver.findElement(By.xpath("//span[text()='Настройки Маркета']")).click();
        app.driver.findElement(By.xpath("//a[text()='Изменить данные']")).click();
        app.getSearchHelper().write(By.id("firstname"), "Тест");
        app.getSearchHelper().write(By.id("lastname"), "Тестов");
        app.getSearchHelper().write(By.id("birthday-day"), "24");
        new Select(app.driver.findElement(By.xpath("//select[@name='month']"))).selectByVisibleText("Ноябрь");
        app.getSearchHelper().write(By.id("birthday-year"), "1956");
        //if(app.driver.findElement(By.name("xcrb41")).getText().equals("Женский")){
        //app.driver.findElement(By.xpath("//div[text()='Мужской']")).click(); }
        new Select(app.driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("Россия");
        app.getSearchHelper().write(By.id("city"), "Рязань");
        app.driver.findElement(By.xpath("//button[@type='submit']")).click();
        app.driver.findElement(By.xpath("//span[text()='Изменить регион']")).click();

        app.getSearchHelper().type(By.id("header-search"), By.xpath("//span[@class='_14Uuc5WvKg']"), "Москва");
        Thread.sleep(10000);
    }
}
