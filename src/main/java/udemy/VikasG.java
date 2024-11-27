package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VikasG {
	private static WebElement A = null;
	
	public static WebElement register(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[1]/a"));
		return A;
	} 
	public static WebElement login(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/div/a"));
		return A;
	}
	public static WebElement SignUp(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[1]/button"));
		return A;
	}
	
	public static WebElement ckb1(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[5]/div[1]/input[2]"));
		return A;
	}
	/*
	public static WebElement Login(WebDriver driver) 
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div[1]/div/input"));
		return A;
	} */
	public static WebElement Email(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[1]/input"));
		return A;
	}
	public static WebElement pwd(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/input"));
		return A;
	}
	public static WebElement v1(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[1]/div"));
		return A;
	}
	public static WebElement v2(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/div"));
		return A;
	}
	public static WebElement error(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/span"));
		return A;
	}
	public static WebElement ckb2(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/span"));
		return A;
	}
	public static WebElement submit(WebDriver driver)
	{
		WebElement A = driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input"));
		return A;
	}


}
