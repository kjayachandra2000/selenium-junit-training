package framelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginModelPage {

    private final By txtUserName = By.id("email");
    private final By txtPassword = By.id("password");
    private final By btnSubmit = By.id("button");
    private final WebDriver driver;

    public LoginModelPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) {
        WebElement uName = driver.findElement(txtUserName);
        uName.sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void submit() {
        driver.findElement(btnSubmit).click();
    }

}
