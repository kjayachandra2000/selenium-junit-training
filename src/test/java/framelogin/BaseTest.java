package framelogin;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void before() {
        driver = new DriverManager().getChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    @After
    public void after() {
        //closeBrowser
        driver.close();
        driver.quit();
    }
}
