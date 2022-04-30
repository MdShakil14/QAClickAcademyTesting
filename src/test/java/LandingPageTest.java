import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import pageObjects.LandingPage;

import java.io.IOException;

public class LandingPageTest extends base{

    public static Logger log = LogManager.getLogger(base.class.getName());


    @BeforeMethod
    public void setURL() throws IOException {
        driver = initializeDriver();
        log.info("initialize driver");
        driver.get(properties.getProperty("url"));
        log.info("Start browser");

    }

    @Test(priority = 1)
    public void titleTest() {
        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();
        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle().getText(),"FEATURED COURSES");
        log.info("Title test pass");

    }

//    @Test(priority = 2)
//    public void courseTest() throws IOException {
//        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();
//        LandingPage landingPage1 = new LandingPage(driver);
//        Assert.assertTrue(landingPage1.getIcon().isDisplayed());
//        log.info("course test pass");
//    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        log.info("Browser close");
    }


}
