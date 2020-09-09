package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserHelper extends HelperBase{

    ApplicationManager ap;
    public UserHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public void login() {
        driver.findElement(By.linkText("Войти")).click();
        ap.getSpecificationHelper().getWindow(1);
        ap.getSearchHelper().type(By.xpath("//input[@type='text']"), By.xpath("//button[@type='submit']"), "testzz123@yandex.ru");
        ap.getSearchHelper().type(By.xpath("//input[@name='passwd']"),
                By.xpath("//button[@type='submit']"), "Test123Test");
    }
       // app.getSpecificationHelper().getWindow(0);
    public void goToYaMarketConfiguration() {
        driver.findElement(By.xpath("//button[@class='_1YeOF5Jcfi _3qbyNoLh_b']")).click();
        driver.findElement(By.xpath("//span[text()='Настройки Маркета']")).click();
        driver.findElement(By.xpath("//a[text()='Изменить данные']")).click();
    }

    public void changeData() {
        ap.getSearchHelper().write(By.id("firstname"), "Тест");
        ap.getSearchHelper().write(By.id("lastname"), "Тестов");
        ap.getSearchHelper().write(By.id("birthday-day"), "24");
        new Select(ap.driver.findElement(By.xpath("//select[@name='month']"))).selectByVisibleText("Ноябрь");
        ap.getSearchHelper().write(By.id("birthday-year"), "1956");
        //if(app.driver.findElement(By.name("xcrb41")).getText().equals("Женский")){
        //app.driver.findElement(By.xpath("//div[text()='Мужской']")).click(); }
        new Select(ap.driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("Россия");
        ap.getSearchHelper().write(By.id("city"), "Рязань");
        ap.driver.findElement(By.xpath("//button[@type='submit']")).click();
        //app.driver.findElement(By.xpath("//span[text()='Изменить регион']")).click();
        //app.getSearchHelper().type(By.id("header-search"), By.xpath("//span[@class='_14Uuc5WvKg']"), "Москва");
    }
}
