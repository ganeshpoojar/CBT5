package pack1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class NewTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	  public void testA() throws MalformedURLException {	  
		/*URL r = new URL ("http://localhost:4444/wd/hub");
		DesiredCapabilities d = new DesiredCapabilities();
		*/
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.quit();
}
}