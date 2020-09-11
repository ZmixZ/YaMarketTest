package manager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import javax.jws.soap.SOAPBinding;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    private SpecificationHelper specificationHelper;
    private SearchHelper searchHelper;
    private String browser;
    private TiresHelper tiresHelper;
    private ConsoleHelper consoleHelper;
    private UserHelper userHelper;
    private Properties properties;

    public ApplicationManager(String browser){
        this.browser = browser;
    }

    public void start() throws IOException {
        properties = new Properties();
        properties.load(new FileReader(new File("src/test/resources/local.properties")));
        if(browser == BrowserType.CHROME){
            driver = new ChromeDriver();
        } else {
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(properties.getProperty("web.baseUrl"));
        searchHelper = new SearchHelper(driver);
        specificationHelper = new SpecificationHelper(driver, this);
        tiresHelper = new TiresHelper(driver, this);
        consoleHelper = new ConsoleHelper(driver, this);
        userHelper = new UserHelper(driver, this);


    }

    public void stop() {
        driver.quit();
    }

    public SearchHelper getSearchHelper() {
        return searchHelper;
    }

    public SpecificationHelper getSpecificationHelper() {
        return specificationHelper;
    }

    public TiresHelper getTiresHelper() { return tiresHelper; }

    public UserHelper getUserHelper() { return userHelper; }

    public ConsoleHelper getConsoleHelper() {return consoleHelper; }
}
