package manager;

import model.Tires;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TiresHelper extends HelperBase {

    ApplicationManager ap;

    public TiresHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public void test() throws InterruptedException {
        //app.driver.findElement(By.xpath("//div[@class='_10dWCjaZug']")).click();
        driver.findElement(By.xpath("//div[@class='_3Lwc_UVFq4']")).click();
        driver.findElement(By.id("41042240-tab")).click();
        driver.findElement(By.xpath("//a[text()='Шины']/..")).click();
        driver.findElement(By.xpath("//input[@id='glpricefrom']")).sendKeys("1500");
        driver.findElement(By.xpath("//input[@id='glpriceto']")).sendKeys("3000");
        driver.findElement(By.xpath("//li[2]/div/a/label/div")).click();
        driver.findElement(By.xpath("//div/fieldset/ul/li[2]/div/label/div")).click();
    }

    public List <Tires> listTires(){
        List<Tires> list = new ArrayList<>();
        List<WebElement> tiresList = driver.findElements(By.xpath("//h3[@class='_3dCGE8Y9v3 cLo1fZHm2y']//a"));
        for (WebElement i : tiresList){
            list.add(new Tires().withName(i.getAttribute("title")));
        }
        return list;
    }

}
