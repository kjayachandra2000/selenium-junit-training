package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private final By dropDown = By.cssSelector("#dropdown");
    private final WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectByValue(String value) {
        Select select = new Select(driver.findElement(dropDown));
        select.selectByValue(value);
    }

    public Select getSelectObject() {
        return new Select(driver.findElement(dropDown));
    }
}
