import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {

        /*
        Go to https://techglobal-training.netlify.app/
        Validate the company logo is displayed
         */

        System.setProperty("webdriver.chrome.driver", "/Users/gre4ya/IdeaProjects/initial_selenium_project_5/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://techglobal-training.netlify.app/");
        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.id("logo"));

        System.out.println(logo.isDisplayed() ? "Logo Validation PASSED" : "Logo Validation FAILED");

        driver.quit();

    }
}
