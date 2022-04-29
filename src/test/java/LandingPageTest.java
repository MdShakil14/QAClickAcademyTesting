import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObjects.LandingPage;

import java.io.IOException;

public class LandingPageTest extends base{

    @Test
    public void titleTest() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();

        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle().getText(),"FEATURED COURSES");

    }

    @Test
    public void courseTest() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.findElement(By.xpath("//button[normalize-space()='NO THANKS']")).click();

        LandingPage landingPage1 = new LandingPage(driver);
        boolean b = landingPage1.getCourses().isDisplayed();
        Assert.assertTrue(b);

    }

}
