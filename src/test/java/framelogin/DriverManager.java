package framelogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    public WebDriver getBrowserInstance(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            return new DriverManager().getChromeDriver();
        } else {
            return new DriverManager().getFirefox();
        }
    }

    public WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        return new ChromeDriver(options);
    }

    public WebDriver getFirefox() {
        return new FirefoxDriver();
    }
}
