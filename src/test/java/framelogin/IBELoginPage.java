package framelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IBELoginPage {

    private final By btnLogin = By.id("btnLogin");
    private final By frameLogin = By.className("sso-iframe");

    private final WebDriver driver;

    public IBELoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.findElement(btnLogin).click();
        switchToLoginFrame();
    }


    private void switchToLoginFrame() {
        driver.switchTo().frame(driver.findElement(frameLogin));
    }
}
