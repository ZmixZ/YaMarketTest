package tests;

import manager.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.MappedByteBufferDataSource;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        app.enterWebsite();
        app.driver.findElement(By.linkText("Войти")).click();
        app.getSpecificationHelper().getWindow(1);
        app.getSearchHelper().type(By.xpath("//input[@type='text']"), By.xpath("//button[@type='submit']"), "testzz123@yandex.ru");
        app.getSearchHelper().type(By.xpath("//input[@name='passwd']"),
                By.xpath("//button[@type='submit']"), "Test123Test");
        app.driver.findElement(By.xpath("//button[@class='_1YeOF5Jcfi _3qbyNoLh_b']")).click();
        app.driver.findElement(By.xpath("//span[text()='Настройки Маркета']")).click();
        Thread.sleep(10000);
    }
}
