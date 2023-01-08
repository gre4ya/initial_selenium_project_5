import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_Driver_Navigation {
    public static void main(String[] args) {
       /*
       TEST CASE
       Go to https://www.techglobalschool.com
       Refresh the page
       Navigate to https://www.amazon.com/
       Navigate back to TechGlobal website
       Navigate forward Amazon website
       Validate the URL of the page
       Validate the title of the page


       EXPECTED RESULT:
       URL  = https://www.amazon.com/
       Title = Amazon.com. Spend less. Smile more.
        */

        System.setProperty("webdriver.chrome.driver", "/Users/gre4ya/IdeaProjects/initial_selenium_project_5/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        System.out.println(driver.getCurrentUrl().equals("https://www.amazon.com/") ?
                "URL Validation PASSED" : "URL Validation FAILED");

        System.out.println(driver.getTitle().equals("Amazon.com. Spend less. Smile more.") ?
                "Title Validation PASSED" : "Title Validation FAILED");

        driver.quit();
    }
}
