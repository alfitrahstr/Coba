package yopmail.tugas3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasedWebTestUsingThreadLocalParalel {
	//WebDriver driver;
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		//headless
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				//options.addArguments("--headless","--disable-gpu");
				driver.set(new ChromeDriver(options));
		//driver.set(new ChromeDriver());
		explicitWait.set(new WebDriverWait(driver.get(),Duration.ofMinutes(5)));
		//WebDriverWait wait = new WebDriverWait(driver.get(), Duration.ofMinutes(10)) ;
		
		driver.get().get("https://yopmail.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.get().quit();
	}
}
