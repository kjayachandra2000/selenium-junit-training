package waits;

import framelogin.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitTest {

    private WebDriver driver;

    @Before
    public void before() {
        driver = new DriverManager().getChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/");
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.get("https://demoqa.com/automation-practice-switch-windows/");
    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }

    @Test
    public void selectOptions() {
        WebElement ele = driver.findElement(By.id("timingAlert"));
        ele.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("timingAlert"))));
        Alert alrt = driver.switchTo().alert();

        alrt.accept();
        alrt.dismiss();
        alrt.getText();

        alrt.sendKeys("asdfasdf");
    }
}
