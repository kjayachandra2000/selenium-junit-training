package property;

import framelogin.DriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ReadProperty {

    private WebDriver driver;

    @Before
    public void before() {
        String browser = PropertyLoader.get("browser");
        System.out.println(" current browser :: " + browser);

        String baserUrl = PropertyLoader.get("baseUrl");
        System.out.println("current base url:: " + baserUrl);

        driver = new DriverManager().getBrowserInstance(browser);

        String fullUrl = baserUrl  + "upload";

        driver.get(fullUrl);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.close();
        driver.quit();
    }


    @Test
    public void read() {
        driver.findElement(By.id("file-upload"))
                .sendKeys(new File("src/test/resources/screenshots/temp1.png").getAbsolutePath());

        driver.findElement(By.id("file-submit")).click();

        WebElement uploadSuccess = driver.findElement(By.id("uploaded-files"));

        Assert.assertTrue("Successful Uploaded", uploadSuccess.isDisplayed());
    }
}
