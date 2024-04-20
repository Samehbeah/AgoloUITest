package tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.ReadPropertiesFile;

public class TestBase {

	String url;
	public static WebDriver driver;

	@BeforeSuite
	public void setUpEnvironment()
	{

		System.out.println("HELLO");
		Properties properties= ReadPropertiesFile.getData("configs//config.properties");
		url = properties.getProperty("url");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();


	}

	@AfterSuite
	public void clean() {

		driver.close();

	}

}
