package manager;

import model.Tires;
import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TiresHelper extends HelperBase {

    Properties properties;
    ApplicationManager ap;

    public TiresHelper(WebDriver driver, ApplicationManager ap) {
        super(driver);
        this.ap = ap;
    }

    public void filterTires(String lowPrice, String hightPrice) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='glpricefrom']")).sendKeys(lowPrice);
        driver.findElement(By.xpath("//input[@id='glpriceto']")).sendKeys(hightPrice);
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
    
    public List <Tires> listModelTires() throws IOException {
        List<Tires> list = new ArrayList<>();
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        for(int i = 1; i < properties.size(); i++){
            list.add(new Tires().withName(properties.getProperty("web.tires" + i)));
        }
        return list;
    }
}
