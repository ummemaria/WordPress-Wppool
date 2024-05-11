package bd.com.Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public static WebDriver driver;

@BeforeSuite
public void start() {
	
String browser = System.getProperty("browser", "edge");
	
	if (browser.contains("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	}
	else if (browser.contains("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	
}
@AfterSuite

public void close(){
	
	driver.quit();
}
}
