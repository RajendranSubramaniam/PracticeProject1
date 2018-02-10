package MyMavenProject.MavenProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class GcrLogin {
@Test
public void loginGCR() {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/login.php");
	
	
	//System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\Chrome\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("http://www.gcrit.com/build3/admin/login.php");
	
	// gecko driver can be downloaded from https://github.com/mozilla/geckodriver/releases due to Selenium 3
	//Set path for gecko driver
	//System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\Gecko\\geckodriver.exe");
	//Now you can Initialize marionette driver to launch firefox
	//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	//capabilities.setCapability("marionette", true);
	//WebDriver driver=new FirefoxDriver();
	//driver.get("http://www.gcrit.com/build3/admin/login.php");	
	
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	driver.findElement(By.id("tdb1")).click();
	
	String url = driver.getCurrentUrl();
	if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
	System.out.println("Log in is successful - Passed");
    }
	else
	{
	System.out.println("Log in is Unsuccessful - Failed");	
	}	
	
	
	
  }
}
