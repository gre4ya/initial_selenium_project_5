import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

import java.util.List;

public class Assignment03_TechGlobalTraining {
    public static void main(String[] args) {
        /*
        TEST CASE 1
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Programming Languages list items below
        Java
        JavaScript
        C#
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

//      driver.get("https://techglobal-training.netlify.app/");
//
//      driver.findElement(By.id("dropdown-button")).click();
//      driver.findElement(By.id("frontend-option")).click();
//      driver.findElement(By.id("card-2")).click();

        String[] expectedLanguages = {"Java","JavaScript","C#"};
        List<WebElement> languages = driver.findElements(By.xpath("(//ul)[2]/li"));

        for (int i = 0; i < languages.size(); i++) {
            System.out.println("Expected element - \"" + expectedLanguages[i] + "\"");
            System.out.println("Actual element - \"" + languages.get(i).getText() + "\"");
            System.out.println(languages.get(i).getText().equals(expectedLanguages[i]) ?
                    "Validation PASSED\n" : "Validation FAILED\n");
        }

        /*
        TEST CASE 2
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Automation Tools list items below
        Selenium WebDriver
        WebDriverIO
        Cypress
        Playwright
         */

        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

        String[] expectedTools = {"Selenium WebDriver", "WebDriverIO", "Cypress", "Playwright"};
        List<WebElement> tools = driver.findElements(By.xpath("(//ul)[3]/li"));

        for (int i = 0; i < languages.size(); i++) {
            System.out.println("Expected element - \"" + expectedTools[i] + "\"");
            System.out.println("Actual element - \"" + tools.get(i).getText() + "\"");
            System.out.println(tools.get(i).getText().equals(expectedTools[i]) ?
                    "Validation PASSED\n" : "Validation FAILED\n");
        }
        Driver.quitDriver();
    }
}
