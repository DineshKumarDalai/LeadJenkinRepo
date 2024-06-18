package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	private static Helper Helper;    
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;
    public Properties configProp;
     
    private Helper() throws IOException {
        
    	configProp = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/Configuration/config.properties");
		configProp.load(ip);
		
String s = configProp.getProperty("browser");
		
        
		if(s.equalsIgnoreCase("chrome")) {
			 ChromeOptions options  = new ChromeOptions();
		        options.addArguments("--disable-notifications");
		        DesiredCapabilities cap = new DesiredCapabilities();
		        cap.setCapability(ChromeOptions.CAPABILITY, options);
		        options.merge(cap);
			 driver = new ChromeDriver(options);
		}else if(s.equalsIgnoreCase("firefox")) {
			
			 FirefoxOptions options  = new FirefoxOptions();
		        options.addArguments("--disable-notifications");
		        DesiredCapabilities cap = new DesiredCapabilities();
		        cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
		        options.merge(cap);
			 driver = new FirefoxDriver();
		}else {
			System.out.println("Enter driver is Invalid");
		}
	
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
      
     }
    
    
   
    
    
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() throws IOException {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
     public static void tearDown() throws InterruptedException {
         if(driver!=null) {
        	 Thread.sleep(5000);
            // driver.close();
             driver.quit();
         }
         Helper = null;
     }
     
     public static String GetUserName() {
      return "Facebook Username";
     }
     
     public static String GetPassword() {
      return "Facebook password";
     }
	
}
