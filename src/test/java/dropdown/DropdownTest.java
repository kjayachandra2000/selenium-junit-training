package dropdown;

import framelogin.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DropdownTest {

    private WebDriver driver;

    @Before
    public void before() {
        driver = new DriverManager().getChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
    }

    @After
    public void after() {
        takeScreenshot();
        driver.close();
        driver.quit();
    }

    @Test
    public void selectOptions() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectByValue("1");
        Select elem = dropdownPage.getSelectObject();
        elem.selectByVisibleText("Option 2");
        elem.selectByIndex(1);
    }

    private void takeScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenFile = screenshot.getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(screenFile.toPath(),
                    Paths.get(new File("src/test/resources/screenshots/temp1.png").getAbsolutePath()),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
