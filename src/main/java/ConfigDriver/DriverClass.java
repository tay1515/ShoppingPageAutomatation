package ConfigDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverClass {

    WebDriver driver;

    @Before
    public void open_application(String url) {
        System.setProperty("webdriver.chrome.driver", "C:/paralell_brosers/ShoppingPage/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:/paralell_brosers/ShoppingPage/geckodriver.exe");
        //driver= new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        //CerrarNavegador();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    @After
    public void CerrarNavegador() {
        if (driver != null) {
            driver.quit();
        }
    }

}
