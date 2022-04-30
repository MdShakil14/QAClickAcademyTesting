import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.Properties;


public class base {
    public WebDriver driver;
    public Properties properties = new Properties();

    public WebDriver initializeDriver() throws IOException {


        String path = "D:\\Coding\\Automation Project\\TESTNG DEMO 2\\Maven project\\QAClickAcademyTesting\\src\\main\\resources\\data.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        String browsername = properties.getProperty("browser");

        if (Objects.equals(browsername, "chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Programming Related Software\\Selenium\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (Objects.equals(browsername, "firefox")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Programming Related Software\\Selenium\\firefox driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (Objects.equals(browsername, "IE")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Programming Related Software\\Selenium\\Internet Explorer\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return driver;
    }
}
