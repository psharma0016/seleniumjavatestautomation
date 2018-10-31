package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LandingPageObject;

public class LandingPageTestUsingTestNG {

    private static WebDriver driver = null;

    @BeforeTest
    public void setUpTest(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chromedriver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }


    @Test
    public static void LandingTest() throws InterruptedException{

        LandingPageObject landingPage = new LandingPageObject(driver);

        driver.get("https://www.americasbest.com");
        Thread.sleep(3000);
        landingPage.seeElementSearchByZipSearchBox("60604");
        landingPage.clickGobtn();
        Thread.sleep(5000);


    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
        System.out.println("Test Completed Successfully.");

    }

}
