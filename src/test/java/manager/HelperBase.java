package manager;

import org.openqa.selenium.*;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, By locator1, String attributeName) {
        driver.findElement(locator).sendKeys(attributeName);
        click(locator1);
    }

    public void write(By locator, String attributeName) {
        clearInput(locator);
        driver.findElement(locator).sendKeys(attributeName);
    }

    public String getAttribute(By locator, String text) {
        return driver.findElement(locator).getAttribute(text);
    }

    public void clearInput(By locator){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<150;i++){
            stringBuilder.append(Keys.BACK_SPACE);
        }
        driver.findElement(locator).sendKeys(stringBuilder.toString());
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
