package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LandingPageObject {

    WebDriver driver;

    By textbox_search_store = By.xpath("//input[@id='inputSearchBy']");
    By button_go = By.xpath("//div[@class='form-group']//input[@value='GO']");

    public  LandingPageObject(WebDriver driver)
    {
        this.driver = driver;
    }
    public void seeElementSearchByZipSearchBox(String text)
    {
        driver.findElement(textbox_search_store).sendKeys(text);
    }
    public void clickGobtn()
    {
        driver.findElement(button_go).sendKeys(Keys.RETURN);
    }
}
