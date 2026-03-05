
package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.wooberly.com/siteadmin");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement email = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("email"))
        );

        email.click();
        email.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        email.sendKeys(Keys.DELETE);
        email.sendKeys("Sakthi@gmail.com");

        System.out.println("Email entered successfully");
        
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
        );
        password.click();
        password.sendKeys(Keys.chord(Keys.COMMAND, "a"));
        password.sendKeys(Keys.DELETE);
        password.sendKeys("Sakthi");

        System.out.println("password entered successfully");
        
        WebElement submits = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']"))
        );
        submits.click();
        
    }
}
