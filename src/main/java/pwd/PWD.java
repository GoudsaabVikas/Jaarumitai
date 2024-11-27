package pwd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import tc.TC;

public class PWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ubuy.co.in/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TC.Account(driver).click();
				Actions actions = new Actions(driver);
		actions.moveToElement(TC.Scroll(driver));
		actions.perform();
		TC.Scroll(driver).click();
		TC.Login(driver).click();
		TC.Email(driver).sendKeys("gunnamamidi@gmail.com");
		//Pwd 1
		TC.pwd(driver).click();
		TC.pwd(driver).sendKeys("gunnamamidi@23");
		TC.Submit(driver).click();
		TC.pwd(driver).clear();
		TC.Submit(driver).click();
		System.out.println(TC.error_msg_Pwd(driver).getText());
		//Pwd 2
		TC.pwd(driver).click();
		TC.pwd(driver).sendKeys("Gunna12345");
		//System.out.println(TC.error_msg_Pwd(driver).getText());
		TC.pwd(driver).clear();
		System.out.println(TC.error_msg_Pwd(driver).getText());
		//PWd 3
		TC.pwd(driver).click();
		TC.pwd(driver).sendKeys("12345678$ewrE");
		TC.pwd(driver).clear();
		System.out.println(TC.error_msg_Pwd(driver).getText());
		//otp 
		TC.otp(driver).click();
		//otp test 1
		TC.otptext(driver).click();
		TC.otptext(driver).sendKeys("gunnamamidi@23");
		TC.Submit(driver).click();
		System.out.println(TC.otp_msg_otptext(driver).getText());
		TC.otptext(driver).clear();
		TC.Submit(driver).click();
		System.out.println(TC.otp_msg_text(driver).getText());
		
		//otp 2
		TC.otptext(driver).click();
		TC.otptext(driver).sendKeys("123456");
		TC.Submit(driver).click();
		System.out.println(TC.otp_msg_otptext(driver).getText());
		TC.otptext(driver).clear();
		TC.Submit(driver).click();
		System.out.println(TC.otp_msg_text(driver).getText());
		
		//otp 3
		TC.otptext(driver).click();
		TC.otptext(driver).sendKeys("ABCDwsww");
		TC.Submit(driver).click();
		System.out.println(TC.otp_msg_otptext(driver).getText());
		TC.otptext(driver).clear();
		TC.Submit(driver).click();
		System.out.println(TC.otp_msg_text(driver).getText());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.ubuy.co.in/customer/account/login");
		driver.manage().window().maximize();
		
	}

}
