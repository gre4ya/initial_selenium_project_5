import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {

        // 1. Set up
        System.setProperty("webdriver.chrome.driver", "/Users/gre4ya/IdeaProjects/initial_selenium_project_5/chromedriver");

        // 2. Test validation
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com/"); // no cashes (cash keep history)

        if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title Validation PASSED");
        else System.out.println("Title Validation FAILED");
        if(driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL Validation PASSED");
        else System.out.println("URL Validation FAILED");
        // driver.navigate().to("https://www.techglobalschool.com/"); // keep cashes

        //driver.manage().window().fullscreen();

        // 3. Teardown
        Thread.sleep(2000);

        //driver.close();  // close the current window
        driver.quit(); // close the whole application

    }
}
