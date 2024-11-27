package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tc.TC;

public class TE {
	WebDriver driver = null;

	public static void main(String[] args) {
	 
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		VikasG.register(driver).click();
		//VikasG.ckb1(driver).click();
		VikasG.login(driver).click();
		VikasG.Email(driver).click();
		VikasG.v1(driver).click();
		VikasG.pwd(driver).click();
		VikasG.v2(driver).click();
		VikasG.ckb2(driver).click();
		VikasG.submit(driver).click();
		VikasG.error(driver).click();
	}

}
