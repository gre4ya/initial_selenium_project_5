import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _06_Locators_linkText_partialLinkText {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        TechGlobalUtil.getFrontendTesting();
        driver.findElement(By.id("card-1")).click();
        Waiter.pause(2);

        WebElement redApple = driver.findElement(By.linkText("Red Apple"));

        System.out.println(redApple.isDisplayed() ? "\"Red Apple\" element display verification PASSED" :
                "\"Red Apple\" element display verification FAILED");
        System.out.println(redApple.isEnabled() ? "\"Red Apple\" element display verification PASSED" :
                "\"Red Apple\" element enability verification FAILED");
        System.out.println(redApple.getText().equals("Red Apple"));

        WebElement greenApple = driver.findElement(By.linkText("Green Apple"));

        System.out.println(greenApple.isDisplayed());
        System.out.println(greenApple.isEnabled());
        System.out.println(greenApple.getText().equals("Green Apple"));

        WebElement pineapple = driver.findElement(By.partialLinkText("Pine"));

        System.out.println(pineapple.isDisplayed());
        System.out.println(pineapple.isEnabled());
        System.out.println(pineapple.getText().equals("Pineapple"));


        Driver.quitDriver();

    }
}
