import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _02_Recap_Validate_Google {
    public static void main(String[] args) {

        /*
        TEST CASE 3
        Go to https://www.google.com/
        Validate the page title is "Google"
        Validate the page url is "https://www.google.com/"
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle().equals("Google") ?
                "Title Validation PASSED" : "Title Validation FAILED");

        System.out.println(driver.getCurrentUrl().equals("https://www.google.com/") ?
                "URL Validation PASSED" : "URL Validation FAILED");

        /*
        EST CASE 4
        Go to https://www.google.com/
        Enter "Software Engineer in Test" to search input box
        Click the search button
        Validate the first result contains the text "Software Engineer in Test"
         */

        driver.get("https://www.google.com/");
        Waiter.pause(2);
        //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Software Engineer in Test");
        driver.findElement(By.name("q")).sendKeys("Software Engineer in Test");
        Waiter.pause(2);
        //driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
        driver.findElement(By.name("btnK")).click();
        Waiter.pause(2);

        System.out.println(
                driver.findElement(
                        By.xpath(
                                "(//div[@class='yuRUbf'])[1]")).getText().contains("Software Engineer in Test")
                        ? "Validation PASSED" : "Validation FAILED");
        Waiter.pause(2);

        Driver.quitDriver();
    }
}
