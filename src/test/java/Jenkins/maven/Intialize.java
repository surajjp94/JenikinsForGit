package Jenkins.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intialize {
	
	@Test
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Interviw\\maven\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/p/selenium-vi.html");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Automation Testing Insider: SELENIUM TUTORIAL");
		driver.quit();
		
		
	}

}
