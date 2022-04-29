package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@id='user_email']")
    WebElement userEmail;
    @FindBy(xpath = "//input[@id='user_password']")
    WebElement userPassword;
    @FindBy(xpath = "//input[@name='commit']")
    WebElement logIn;
    @FindBy(linkText = "Forgot Password?")
    WebElement forgotPassword;

    public WebElement getUserEmail(){
        return userEmail;
    }
    public WebElement getUserPassword(){
        return userPassword;
    }
    public WebElement getLogin(){
        return logIn;
    }
    public WebElement getForgotPassword(){
        return forgotPassword;
    }
}
