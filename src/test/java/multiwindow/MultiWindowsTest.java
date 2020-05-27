package multiwindow;

import framelogin.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class MultiWindowsTest {
    private WebDriver driver;

    @Before
    public void before() {
        driver = new DriverManager().getChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }

    @Test
    public void multiWindows() {
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equalsIgnoreCase(parentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Assert.assertEquals(driver.getTitle(), "New Window");
        Assert.assertFalse("assert failure", true);
        driver.close();
        driver.switchTo().window(parentWindow);
    }
}
