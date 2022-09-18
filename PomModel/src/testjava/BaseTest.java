package testjava;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import mainjava.BaseClass;



public class BaseTest extends BaseClass{
	public WebDriver driver;
	@BeforeTest
	public void WebBrowserLaunching() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sandhya_Kanchangire\\Downloads\\PomModel NEW\\PomModel\\depend\\chromedriver.exe");

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDownBrowser() {
		this.driver.quit();
	}
}
