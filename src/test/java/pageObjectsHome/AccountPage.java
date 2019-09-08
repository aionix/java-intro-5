package pageObjectsHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver driver;


    @FindBy(xpath = "//a[@class='logout']") private WebElement sigoutButton;


    LoginPage signOut() {
        sigoutButton.click();
        return new LoginPage(driver);
        }




}

