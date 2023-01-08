import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _04_Locators_className_name {
    public static void main(String[] args) {
    /*
    TEST CASE
    Go to https://techglobal-training.netlify.app/
    Select "Frontend Testing" from the "Practices" dropdown
    Select the "Locators" card
    Validate the "Kiwi", "Orange" and "Grapes" items are displayed
     */
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

            System.out.println(driver.findElement(By.id("item_kiwi")).isDisplayed() ?
                    "\"Kiwi\" item validation is PASSED" : "\"Kiwi\" item validation is FAILED");

            System.out.println(driver.findElement(By.name("item_orange")).isDisplayed() ?
                   "\"Orange\" item validation is PASSED" : "\"Orange\" item validation is FAILED");

            System.out.println(driver.findElement(By.className("item_grapes")).isDisplayed() ?
                    "\"Grapes\" item validation is PASSED" : "\"Grapes\" item validation is FAILED");
        }
        catch (Exception e){System.out.println("TEST FAILED due to: " + e.getMessage());}
        finally {Driver.quitDriver();}
    }
}
