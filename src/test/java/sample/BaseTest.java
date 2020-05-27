package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Before
    public void sampleBefore() {
        System.out.println("Before TestCase");


        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\chromedriver.exe"); // set the system variable

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        driver = new ChromeDriver(options); // starting chromedriver/chromeserver
        driver.get("http://www.google.com"); //navigating to the google.com page
    }

    @After
    public void after() {
        System.out.println("After TestCase");

        driver.close(); // closing browse

        driver.quit(); // stopping the chrome driver
    }
}
