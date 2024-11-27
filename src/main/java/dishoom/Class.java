package dishoom;

import org.openqa.selenium.WebDriver;

public class Class {
	WebDriver driver = driver();
	public Class ()
	{
		this.driver=driver;
		driver.get("https://www.amazon.in/");
		
		return;
	}
	private WebDriver driver() {
		// TODO Auto-generated method stub
		return null;
	}

}
