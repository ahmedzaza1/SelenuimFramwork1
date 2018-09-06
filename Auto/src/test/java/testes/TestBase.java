package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;


	@BeforeTest
	public void StartDriver()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.nopcommerce.com/");

	}
	@AfterClass
	public void StopDriver()
	{
		driver.quit();
	}
}
