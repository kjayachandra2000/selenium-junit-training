package login;

public class LoginPage {

    public LoginPage(String called_by) {
        System.out.println("Login Page object is created " + called_by);
    }

    public void openPage() {
        System.out.println("page open");
    }

    public void enterUserName(String userName) {
        System.out.println("username" + userName);
    }

    public void enterUserName() {
        String userName = ""; //read from some global
        System.out.println("username" + userName);
    }


    public void enterPassword() {
        System.out.println("password");
    }

    public void submit() {
        System.out.println("submit");
    }

}
