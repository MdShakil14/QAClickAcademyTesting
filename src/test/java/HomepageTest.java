import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class HomepageTest extends base {

    @Test(dataProvider = "getData" )
    public void loginTest(String userName,String password) throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");

        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.getLogin().click();
        //driver.get("https://rahulshettyacademy.com/sign_in/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserEmail().sendKeys(userName);
        loginPage.getUserPassword().sendKeys(password);
        loginPage.getLogin().click();
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][2];
        data[0][0] = "Shakil@gmail.com";
        data[0][1] = "123344";

        data[1][0] = "Shakil1222@gmail.com";
        data[1][1] = "12334124";
        return data;
    }
}
