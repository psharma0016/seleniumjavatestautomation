package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
import pages.LandingPageObject;

public class LandingPageTest {

    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException{
        LandingTest();
    }
    public static void LandingTest() throws InterruptedException{
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chromedriver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LandingPageObject landingPage = new LandingPageObject(driver);

        driver.get("https://www.americasbest.com");
        Thread.sleep(3000);
        landingPage.seeElementSearchByZipSearchBox("60604");
        landingPage.clickGobtn();
        Thread.sleep(5000);
        driver.close();

    }

}
