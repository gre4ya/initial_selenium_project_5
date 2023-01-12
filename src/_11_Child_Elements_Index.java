import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class _11_Child_Elements_Index {
    public static void main(String[] args) {
        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the headers below
        Programming Languages
        Automation Tools
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");

        driver.findElement(By.id("dropdown-button")).click();
        driver.findElement(By.id("frontend-option")).click();
        driver.findElement(By.id("card-2")).click();

        String[] expectedElements = {"Programming Languages", "Automation Tools"};

        List<WebElement> h3Elements = driver.findElements(By.cssSelector(".SubPageLayout_subpageContent__kRwff h3"));

        for (int i = 0; i < h3Elements.size(); i++) {
            System.out.println("Element \"" + h3Elements.get(i).getText() + "\"" +
                    (h3Elements.get(i).isDisplayed() ? " Is Displayed" : "Is Not Dispayed"));

            System.out.println((h3Elements.get(i).getText().equals(expectedElements[i]) ?
                    "Text Validation PASSED" : "Text Validation FAILED"));
        }

        Driver.quitDriver();
    }
}
