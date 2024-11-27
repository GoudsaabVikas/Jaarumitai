import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tC_signup {
	private static WebElement A = null;

		
		
	public static WebElement Account(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[1]/button[2]"));
		return A;
	}
		public static WebElement SEmail(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[1]/input"));
			return A;
				}
		public static WebElement SSubmit(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[6]/button"));
			return A;
		}
		public static WebElement Serror_msg_Email(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[1]/div"));
			return A;
		}
		public static WebElement Serror_msg_Pwd(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div/div"));
			return A;
		}
		public static WebElement Spwd(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[2]/ul/li[2]/button"));
			return A;
			}
		public static WebElement Sotp(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/input"));
			return A;
			}  
		public static WebElement Sotp1(WebDriver driver)
			{
				WebElement A = driver.findElement(By.xpath(" /html/body/main/div[2]/div/div/div[1]/div/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[2]/input"));
				return A;
				}
		public static WebElement Sotptext(WebDriver driver)
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/div/div[2]/div/input"));
			return A;
			} 
		public static WebElement Sotp_msg_otptext(WebDriver driver)  
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[1]/div/div/ul/li/ul/li/span"));
			return A;
			} 
		public static WebElement Sotp_msg_text(WebDriver driver)  
		{
			WebElement A = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/form/div[2]/div/div[2]/div/div"));
			return A;
			} 
	
}
