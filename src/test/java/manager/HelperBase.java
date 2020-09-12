package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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

    public void write(By locator, String attributeName) throws InterruptedException {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(attributeName);
    }

    public String getAttribute(By locator, String text) {
        return driver.findElement(locator).getAttribute(text);
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
