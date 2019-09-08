package pageObjectsHome;

import lesson06.TestBase;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class MyFirstTest extends TestBase {
    private LoginPage loginPage = new LoginPage(driver);
    private String userName = "art231188@gmail.com";
    private String password = "777888pass";

    @Ignore
    @Test()
    public void loginTestSimple() {
        loginPage.Login(userName, password);
        Assert.assertThat(
                loginPage.getLogoutText(),
                CoreMatchers.containsString("Sign out"));
    }

    @Ignore
    @Test()
    public void loginTestChained() {
    loginPage.clickSignInBtn()
            .enterUsername(userName)
            .enterPassword(password)
            .clickSubmitLogin();
    Assert.assertThat(
                loginPage.getLogoutText(),
                CoreMatchers.containsString("Sign out"));
    }

    @Test()
    public void logoutTestSimple() {
        loginPage.Login(userName, password).signOut();
        Assert.assertThat(
                loginPage.getLoginText(),
                CoreMatchers.containsString("Sign in"));


    }




}
