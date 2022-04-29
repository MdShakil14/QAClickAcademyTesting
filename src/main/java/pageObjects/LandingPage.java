package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement register;
    @FindBy(xpath = "//span[text()='Login']")
    WebElement login;
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement home;
    @FindBy(xpath = "//a[normalize-space()='Courses']")
    WebElement coureses;
    @FindBy(xpath = "//a[normalize-space()='Videos']")
    WebElement videos;
    @FindBy(xpath = "//a[normalize-space()='Interview Guide']")
    WebElement interviewGuide;
    @FindBy(xpath = "//a[normalize-space()='Practice']")
    WebElement practice;
    @FindBy(xpath = "//a[normalize-space()='Blog']")
    WebElement blog;
    @FindBy(xpath = "//a[normalize-space()='About']")
    WebElement about;
    @FindBy(xpath = "//a[normalize-space()='Contact']")
    WebElement contact;
    @FindBy(xpath = "//h2[normalize-space()='Featured Courses']")
    WebElement title;

    public WebElement getRegister (){
        return register;
    }
    public WebElement getLogin(){
        return login;
    }
    public WebElement getHome(){
        return home;
    }
    public WebElement getCourses(){
        return coureses;
    }
    public WebElement getVideos(){
        return videos;
    }
    public WebElement getInterviewGuide(){
        return interviewGuide;
    }
    public WebElement getPractice(){
        return practice;
    }
    public WebElement getBlog(){
        return blog;
    }
    public WebElement getAbout(){
        return about;
    }
    public WebElement getContact(){
        return contact;
    }
    public WebElement getTitle(){
        return title;
    }
}
