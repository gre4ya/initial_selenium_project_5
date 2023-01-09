import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Practice01 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle().equals("Facebook - log in or sign up") ?
                "Title Validation PASSED" : "Title Validation FAILED");

        System.out.println(driver.getCurrentUrl().equals("https://www.facebook.com/") ?
                "URL Validation PASSED" : "URL Validation FAILED");

        System.out.println(driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']")).isDisplayed() ?
                "Logo Validation PASSED" : "Logo Validation FAILED");

        System.out.println(driver.findElement(By.tagName("h2")).isDisplayed() ?
                "Heading2 Validation PASSED" : "Heading2 Validation FAILED");

        System.out.println(driver.findElement(By.id("email")).isDisplayed() ?
                "\"Email or Phone Number\" box Validation PASSED" : "\"Email or Phone Number\" box Validation FAiled");

        System.out.println(driver.findElement(By.id("passContainer")).isDisplayed() ?
                "\"Password\" input box Validation PASSED" : "\"Password\" input box Validation FAILED");

        System.out.println();

        Driver.quitDriver();


    }
}
