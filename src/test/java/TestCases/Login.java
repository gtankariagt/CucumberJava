package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	WebDriver driver = null;
	
	
	public void setUp()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Driver/chromedriver");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	public void openTheURL(String url)
	{
		driver.navigate().to(url);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}


}
