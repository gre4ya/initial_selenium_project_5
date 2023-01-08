import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {

        try {
            WebDriver driver = Driver.getDriver();

            driver.get("https://techglobal-training.netlify.app/");
            Waiter.pause(2);

            driver.findElement(By.id("dropdown-button")).click();
            Waiter.pause(2);

            driver.findElement(By.id("frontend-option")).click();
            Waiter.pause(2);

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(2);

            // TechGlobalUtil.getFrontendTesting(); can replace lines 13 - 23

            System.out.println(driver.findElement(By.id("main_heading")).isDisplayed() ?
                    "\"Locators\" item display validation is PASSED" : "\"Locators\" item display validation is FAILED");

            System.out.println(driver.findElement(By.id("main_heading")).getText().equals("Locators") ?
                    "\"Locators\" text validation is PASSED" : "\"Locators\" text validation is FAILED");
        }
        catch (Exception e){System.out.println("TEST FAILED due to: " + e.getMessage());}
        finally {Driver.quitDriver();}
    }

}
