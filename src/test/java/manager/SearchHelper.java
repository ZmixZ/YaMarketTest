package manager;

import org.openqa.selenium.*;

public class SearchHelper extends HelperBase{

    public SearchHelper(WebDriver driver) {
        super(driver);
    }

    public void clickProduct(String text) {
        click(By.linkText(text));
    }

    public void searchProduct(String attributeName) {
        type(By.id("header-search"), By.xpath("//div[text()='Найти']/.."), attributeName);
    }

    public void searchByLinks(){
        //_14Uuc5WvKg span class
        //_2ZRlRXSh_x div class
        //q2jz_gHGnl div class
        //_10dWCjaZug div class
        if(isElementPresent(By.xpath("//span[@class='_14Uuc5WvKg']"))){
            click(By.xpath("//span[@class='_14Uuc5WvKg']"));
        } else {
            click(By.id("27903767-tab"));}
                click(By.id("41042240-tab"));
                click(By.xpath("//a[text()='Шины']/.."));
            }


    public void clickCharacteristic() {
        click(By.linkText("Характеристики"));
    }

    public String saveOldTab(){
        return driver.getWindowHandle();
    }

}
