package pageObjectsHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    protected WebDriver driver;

    @FindBy(xpath = "//a[@class='login']")      private WebElement signIn;

    @FindBy(xpath = "//input[@id='email']")     private WebElement emailField;

    @FindBy(xpath = "//input[@id='passwd']")    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='SubmitLogin']")    private WebElement SubmitLogin;

    @FindBy(xpath = "//a[@class='logout']")     private WebElement LogoutButton;


    AccountPage Login(String username, String password){
        clickSignInBtn();
        enterUsername(username);
        enterPassword(password);
        clickSubmitLogin();
        return new AccountPage(driver);
    }

    LoginPage enterUsername(String username){
        emailField.sendKeys(username);
        return this;
    }

    LoginPage enterPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    LoginPage clickSignInBtn(){
        signIn.click();
        return this;
    }

    LoginPage clickSubmitLogin(){
        SubmitLogin.click();
        return this;
    }

    public String getLogoutText() {
        return LogoutButton.getText();
    }

    public String getLoginText() {
        return signIn.getText();
    }
}
