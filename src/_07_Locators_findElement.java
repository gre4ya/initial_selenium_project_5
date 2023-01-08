import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

import java.util.List;

public class _07_Locators_findElement {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();

        driver.findElement(By.id("card-1")).click();

        List<WebElement> items = driver.findElements(By.xpath("//ul/li/a"));

        for (WebElement item : items) {
            System.out.println(item.getText());
            System.out.println(item.isDisplayed());
            System.out.println(item.isEnabled());
        }
        Driver.quitDriver();
    }
}
