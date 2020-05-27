package sample;

import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorTest extends BaseTest {


    @Test
    public void findElement() {


        driver.get("https://demo.openmrs.org/");

        //
        driver.findElement(By.id("username")).sendKeys("Admin");
        driver.findElement(By.id("password")).sendKeys("Admin123");

        driver.findElement(By.id("Laboratory")).click();

        driver.findElement(By.cssSelector(".btn.btn-success")).click();

    }
}
