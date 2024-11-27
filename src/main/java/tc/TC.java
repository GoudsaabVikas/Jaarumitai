package tc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class TC {
	private static WebElement A = null;
	
	
	public static WebElement Account(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/div[3]/ul/li[4]/div"));
		return A;
	}
	public static WebElement Scroll(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/div[3]/ul/li[4]/ul/li[2]/a"));
		
		return A;
	}
	public static WebElement Login(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[1]/button[1]"));
		return A;
	}
	public static WebElement Email(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/form/div[1]/input"));
		return A;
			}
	public static WebElement Submit(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/form/div[3]/button"));
		return A;
	}
	public static WebElement error_msg_Email(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/form/div[1]/div"));
		return A;
	}
	public static WebElement error_msg_Pwd(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/div/div[1]/div/div"));
		return A;
	}
	public static WebElement pwd(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/div/div[1]/div/input"));
		return A;
		}
	public static WebElement otp(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/ul/li[2]/button"));
		return A;
		} 
	public static WebElement otptext(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/div/div[2]/div/input"));
		return A;
		} 
	public static WebElement otp_msg_otptext(WebDriver driver)  
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[1]/div/div/ul/li/ul/li/span"));
		return A;
		} 
	public static WebElement otp_msg_text(WebDriver driver)  
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/div/div[2]/div/div"));
		return A;
		} 
	// Signup
	public static WebElement Signup(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[1]/button[2]"));
		return A;
	}

	
}