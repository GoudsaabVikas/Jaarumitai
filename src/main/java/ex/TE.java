package ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import tc.TC;

public class TE {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ubuy.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TC.Account(driver).click();
				Actions actions = new Actions(driver);
		actions.moveToElement(TC.Scroll(driver));
		actions.perform();
		TC.Scroll(driver).click();
		TC.Login(driver).click();
		//TC 1
	
		TC.Email(driver).click();
		TC.Email(driver).sendKeys("gunnamamidi@23");
		TC.Submit(driver).click();
		System.out.println(TC.error_msg_Email(driver).getText());
		TC.Email(driver).clear();
		//TC 2
		TC.Email(driver).click();
		TC.Email(driver).sendKeys("Gunna12345");
		System.out.println(TC.error_msg_Email(driver).getText());
		TC.Email(driver).clear();
		//TC 3
		TC.Email(driver).click();
		TC.Email(driver).sendKeys("12345678$ewrE");
		System.out.println(TC.error_msg_Email(driver).getText());
		String Original = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);		
		
		driver.switchTo().window(Original);
		driver.manage().window().maximize();
		

	}

	

}
