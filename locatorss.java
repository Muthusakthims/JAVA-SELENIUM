package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//URL & print title
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		
		//ID & send keys
		driver.findElement(By.id("inputUsername")).sendKeys("ABCDEFGH");
		System.out.println("Mail id is updated");
		
		driver.findElement(By.name("inputPassword")).sendKeys("ABCDEFGHIJ");
		System.out.println("Password is updated");
		
		//button click
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("button is clicked");
		
		//Error CSS Selector
	    WebElement element =driver.findElement(By.cssSelector("p.error"));
		System.out.println(element.getText());

		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//xpath
		findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("SAKTHI");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("SAKTHI@gmail.com");
	
}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}
}