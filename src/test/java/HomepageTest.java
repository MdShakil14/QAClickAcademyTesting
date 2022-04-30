import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HomepageTest extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeMethod
    public void setUp() throws IOException {
        driver = initializeDriver();
        log.info("initialize driver");
        driver.get(properties.getProperty("url"));
        log.info("Start browser");
    }



    @Test(dataProvider = "getData" )
    public void loginTest(String userName,String password) {

        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.getLogin().click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserEmail().sendKeys(userName);
        loginPage.getUserPassword().sendKeys(password);
        loginPage.getLogin().click();
        log.info("Login test pass");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
        log.info("Browser close");
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
