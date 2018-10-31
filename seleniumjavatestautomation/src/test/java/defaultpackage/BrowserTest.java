package defaultpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

    public static void main(String[] args) throws InterruptedException{
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path: "+ projectPath);

        System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //System.setProperty("webdriver.chromedriver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\iedriver\\IEDriverServer.exe");
        //WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.americasbest.com");
        Thread.sleep(10000);
        WebElement viewAllStores = driver.findElement(By.xpath("//li[@class=\"view-store\"]//a"));
        driver.findElement(By.xpath("//li[@class=\"view-store\"]//a")).click();
        Thread.sleep(3000);

        //driver.close();
    }

}
