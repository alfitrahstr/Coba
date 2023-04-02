package yopmail.tugas3.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class YopmailMessagePage extends BasePage {
//	private WebDriver driver;
//    By messageFrame = By.id("ifmail");
    //private WebElement messageFrame;
    
    //WebDriver driver = new ChromeDriver() ;
    
//    By messageBody = By.xpath("//body[@id='webmail']");
    //private WebElement messageBody;
	
    
    By clickmessage = By.xpath("//*[@id=\"e_ZwZjZmV0ZGZ1AQZ2ZQNjAQV0ZGt1ZD==\"]/button");
    
    public YopmailMessagePage(ThreadLocal<WebDriver> driver,ThreadLocal<WebDriverWait> explicitWait) {
		super(driver,explicitWait);
    }
    
    public void clickmail() {
    	//clickmail
    	driver.get().switchTo().frame("ifinbox");
    	driver.get().findElement(clickmessage).click();
    	
    	//message
    	driver.get().switchTo().defaultContent();
    	driver.get().switchTo().frame("ifmail");
    	String bodyText = driver.get().findElement(By.id("mail")).getText();
		System.out.println(bodyText);
    }
    
 // Switch to iframe
//    public void testIframe(){
//    	 driver.switchTo().frame(0);
//         String text = ((WebDriver) driver).findElement(By.tagName("h1")).getText();
//         Assert.assertEquals(text, "Iframe Example");
//    }

//	public String getmessageBody() {
//		
//    	return getText("test");
//    }
}
