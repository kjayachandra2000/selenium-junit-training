package login;

public class LoginTest {

    public static void main(String[] args) {
        //user open the page
        // enter user name
        //enter password
        //Click on submit button
        // verify login successful

        LoginPage loginPage = new LoginPage("called by jc");
        loginPage.openPage();
        loginPage.enterUserName();
        loginPage.enterUserName("ratan");
        loginPage.enterPassword();
        loginPage.submit();

        HomePage homePage = new HomePage();
        if (homePage.isLoginSuccessful()) {
            System.out.println("login Success");
        } else {
            System.out.println("login fail");
        }
    }
}
