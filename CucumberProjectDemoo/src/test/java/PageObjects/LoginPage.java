package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinations.BaseClass;
import utilities.Helper;

public class LoginPage extends BaseClass{

	public Properties configProp;
	
	 public LoginPage (WebDriver webDriver)
	  {
	   PageFactory.initElements(webDriver, this);
	  }
	  
	//LoginPage Locators
		private By Name_Textbox = By.name("Email");
		private By Password_Textbox = By.name("Password");
		private By Login_button = By.xpath("//button[@type='submit']");
		private By LogOut_button = By.xpath("//a[text()='Logout']");
	  
	    
		public void LoginApplication(String un,String psw)  {
			/*
			 * configProp = new Properties(); FileInputStream ip = new
			 * FileInputStream(System.getProperty("user.dir") +
			 * "/Configuration/config.properties"); configProp.load(ip);
			 * 
			 * String un = configProp.getProperty("username"); String psw =
			 * configProp.getProperty("password");
			 */
			
			/*
			 * genericmethods.SendKey_ByLocators(driver, Name_Textbox, un,
			 * "User Name Enter Sucessfully"); genericmethods.SendKey_ByLocators(driver,
			 * Password_Textbox, psw, "Password Enter Sucessfully");
			 */
			
			
			Helper.getDriver().findElement(Name_Textbox).clear();
			
			Helper.getDriver().findElement(Name_Textbox).sendKeys(un);
			//logger.info("User Name Enter Sucessfully");
			
			Helper.getDriver().findElement(Password_Textbox).clear();
			Helper.getDriver().findElement(Password_Textbox).sendKeys(psw);
			//logger.info("Password Enter Sucessfully");
		}
		
		public void ClickLoginButton() throws InterruptedException {
			//genericmethods.ClickOn_ByLocators(driver, Login_button, "LoginButton clicked sucessfully");
			
			Helper.getDriver().findElement(Login_button).click();
			Thread.sleep(5000);
			//logger.info("Login button click sucessfully");
		}
		
		public void ClickLogOutButton() {
			//genericmethods.ClickOn_ByLocators(driver, Login_button, "LoginButton clicked sucessfully");
			Helper.getDriver().findElement(LogOut_button).click();
			//logger.info("Login button click sucessfully");
		}
}
