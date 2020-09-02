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
    Tires tires;

    public TiresHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public void test() {
        //app.driver.findElement(By.xpath("//div[@class='_10dWCjaZug']")).click();
        driver.findElement(By.xpath("//div[@class='PXL2nleaah']")).click();
        driver.findElement(By.id("41042240-tab")).click();
        driver.findElement(By.xpath("//a[text()='Шины']/..")).click();
        driver.findElement(By.xpath("//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']")).getAttribute("title");
    }

    public List <Tires>iterator(){
        List<Tires> list = new ArrayList<>();
        List<WebElement> listok = driver.findElements(By.xpath("//a[@class='_27nuSZ19h7 wwZc93J2Ao cia-cs']"));
        for(WebElement a : listok){
            tires.withName(a.getAttribute("title"));
            list.add(tires);
        }
        return list;
    }

}
