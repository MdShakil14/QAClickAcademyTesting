import org.testng.annotations.Test;

import java.io.IOException;

public class HomepageTest extends base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");
    }
}
