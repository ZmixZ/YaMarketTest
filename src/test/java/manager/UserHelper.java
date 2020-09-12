package manager;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserHelper extends HelperBase{

    ApplicationManager ap;
    public UserHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public void login(String email, String pass) {
        click(By.linkText("Войти"));
        ap.getSpecificationHelper().getWindow(1);
        ap.getSearchHelper().type(By.xpath("//input[@type='text']"), By.xpath("//button[@type='submit']"), email);
        ap.getSearchHelper().type(By.xpath("//input[@name='passwd']"),
                By.xpath("//button[@type='submit']"), pass);
    }

    public void goToYaMarketConfiguration() {
        click(By.xpath("//button[@class='_1YeOF5Jcfi _3qbyNoLh_b']"));
        click(By.xpath("//span[text()='Настройки Маркета']"));
        click(By.xpath("//a[text()='Изменить данные']"));
    }

    public User changeData(String name, String lastname, String day, String month, String year, String country, String city) {
        ap.getSearchHelper().write(By.id("firstname"), name);
        ap.getSearchHelper().write(By.id("lastname"), lastname);
        ap.getSearchHelper().write(By.id("birthday-day"), day);
        new Select(ap.driver.findElement(By.xpath("//select[@name='month']"))).selectByVisibleText(month);
        ap.getSearchHelper().write(By.id("birthday-year"), year);
        if(ap.getSearchHelper().isElementPresent(By.xpath("//input[@value='2']"))){
        driver.findElement(By.xpath("//input[@value='1']")).click(); }
        new Select(ap.driver.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText(country);
        ap.getSearchHelper().write(By.id("city"), city);
        User user = getUserData();
        click(By.xpath("//button[@type='submit']"));
        //app.driver.findElement(By.xpath("//span[text()='Изменить регион']")).click();
        //app.getSearchHelper().type(By.id("header-search"), By.xpath("//span[@class='_14Uuc5WvKg']"), "Москва");
        return user;
    }

    public User getUserData() {
        User user = new User().withName(ap.driver.findElement(By.id("firstname")).getAttribute("value")).
                withLastname(ap.driver.findElement(By.id("lastname")).getAttribute("value")).
                withDay(ap.driver.findElement(By.id("birthday-day")).getAttribute("value")).
                withYear(Integer.parseInt(ap.driver.findElement(By.id("birthday-year")).getAttribute("value"))).
                withCity(ap.driver.findElement(By.id("city")).getAttribute("value"));
        return user;
    }
}
