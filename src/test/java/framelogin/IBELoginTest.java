package framelogin;

import org.junit.Test;

public class IBELoginTest extends BaseTest {

    @Test
    public void loginSuccessful() {

        IBELoginPage ibeLoginPage = new IBELoginPage(driver);

        ibeLoginPage.login();

        LoginModelPage loginModelPage = new LoginModelPage(driver);
        loginModelPage.enterUserName("89760578990");
        loginModelPage.enterPassword("Querty@123");
        loginModelPage.submit();

    }
}
