import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class _10_Child_Elements {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com//");

        List<WebElement> headerItems = driver.findElements(By.cssSelector("#comp-kuiqjiulitemsContainer a"));

        //driver.findElements(By.xpath("//ul[@id='comp-kuiqjiulitemsContainer']//a"));
        String[] expectedElements = {"HOME", "INTRO SESSION", "APPLY NOW", "COURSES", "CONTACT"};

        for (int i = 0; i < headerItems.size(); i++) {
            System.out.println(headerItems.get(i).getText().equals(expectedElements[i]));
            System.out.println(headerItems.get(i).isDisplayed());
            System.out.println(headerItems.get(i).isEnabled());
        }

        Driver.quitDriver();



    }
}
