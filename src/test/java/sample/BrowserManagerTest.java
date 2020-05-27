package sample;

import org.junit.Assert;
import org.junit.Test;

public class BrowserManagerTest extends BaseTest {

    @Test
    public void seleniumFirstTest() {
        String title = driver.getTitle(); //fetching the browser title
        Assert.assertEquals(title, "Google"); // verify the browser title
        System.out.println("Current URL :: " + driver.getCurrentUrl());
//
//        driver.getWindowHandle(); // get current window title
//        driver.getWindowHandles(); // collect of window titles
//        driver.switchTo(); // to perform iframes and alert msg
//        driver.manage(); //manage to browser performance like, window size

//        driver.findElement(); // to a single webElement in the application
//        driver.findElements() // to get the collection of webElements in the application

    }
}
