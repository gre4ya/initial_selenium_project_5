import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Assignment01_Facebook {
    public static void main(String[] args) {

        try {

            WebDriver driver = Driver.getDriver();

            driver.get("https://www.facebook.com/");

            driver.manage().window().maximize();

            System.out.println(driver.getTitle().equals("Facebook - log in or sign up") ?
                    "Title Validation PASSED" : "Title Validation FAILED");

            System.out.println(driver.getCurrentUrl().equals("https://www.facebook.com/") ?
                    "URL Validation PASSED" : "URL Validation FAILED");

            //System.out.println(driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']")).isDisplayed() ?
            //       "Logo Validation PASSED" : "Logo Validation FAILED");

            System.out.println(driver.findElement(By.cssSelector("img[class*='fb_logo']")).isDisplayed() ?
                    "Logo Validation PASSED" : "Logo Validation FAILED");


            //driver.findElement(By.xpath("//img[contains(@class, 'fb_logo')]")).isDisplayed();

            System.out.println(driver.findElement(By.tagName("h2")).isDisplayed() ?
                    "Heading2 Validation PASSED" : "Heading2 Validation FAILED");

            System.out.println(driver.findElement(By.id("email")).isDisplayed() ?
                    "\"Email or Phone Number\" box Validation PASSED" : "\"Email or Phone Number\" box Validation FAILED");

            System.out.println(driver.findElement(By.id("pass")).isDisplayed() ?
                    "\"Password\" input box Validation PASSED" : "\"Password\" input box Validation FAILED");

            System.out.println(driver.findElement(By.xpath("//button[@name='login']")).isDisplayed() ?
                    "\"Log In\" button IS Displayed" : "\"Log In\" button IS NOT Displayed");

            System.out.println(driver.findElement(By.xpath("//button[@name='login']")).isEnabled() ?
                    "\"Log In\" button IS Enabled" : "\"Log In\" button IS NOT Enabled");

            System.out.println(driver.findElement(By.cssSelector("._6ltj>a")).isDisplayed() ?
                    "\"Forgot Password?\" Link Validation PASSED" : "\"Forgot Password?\" Link Validation FAILED");

//            System.out.println(driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).isDisplayed() ?
//                    "\"Create New Account\" Button Validation PASSED" : "\"Create New Account\" Button Validation FAILED");

            System.out.println(driver.findElement(By.xpath("//a[contains(@class, '_42ft')]")).isDisplayed() ?
                    "\"Create New Account\" Button Validation PASSED" : "\"Create New Account\" Button Validation FAILED");
        }
        catch (Exception e){
            System.out.println("TEST FAILED due to: " + e.getMessage());;
        }
        finally {Driver.quitDriver();}
    }
}
