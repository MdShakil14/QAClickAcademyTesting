import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class HomepageTest extends base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");

        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.getLogin().click();
        //driver.get("https://rahulshettyacademy.com/sign_in/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserEmail().sendKeys("shakil@gmail.com");
        loginPage.getUserPassword().sendKeys("Shakil");
        loginPage.getLogin().click();
    }
}
