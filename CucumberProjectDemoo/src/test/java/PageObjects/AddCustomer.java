package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinations.BaseClass;
import utilities.Helper;

public class AddCustomer extends BaseClass {

	
	public AddCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	private By DashBoard = By.xpath("//a[text()='John Smith']//..");
	private By CustomersTab_Button = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	private By CustomerschildTab_Button = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	private By AddNew_Button = By.xpath("//a[@class='btn btn-primary']");
	private By Email_Textbox = By.name("Email");
	private By Password_Textbox = By.id("Password");
	private By FirstName_textbox = By.id("FirstName");
	private By LastName_Textbox = By.id("LastName");
	private By GenderMale_Radio = By.id("Gender_Male");
	private By GenderFemale_Radio = By.id("Gender_Female");
	private By DateOfBirth_Select = By.id("DateOfBirth");
	private By CompanyName_Textbox = By.id("Company");
	//private By NewsLetter_Textbox = By.xpath("//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']/..");
	private By NewsLetter_Textbox =By.xpath("//input[@class='k-input k-readonly']");
	private By Save_Button = By.name("save");
	By Customersuccessmsg = By.xpath("//div[@class='alert alert-success alert-dismissable']");
	
	/*
	 * private By SelectmonthYear_button = By.xpath("//a[@aria-live='assertive']");
	 * private By SelectBetweenYear_button =
	 * By.xpath("//a[contains(text(),'2020 - 2029')]"); private By SlectYear_button
	 * = By.xpath("//a[contains(text(),'2024')]"); private By SelectMonth_button =
	 * By.xpath("//a[text()='Oct']"); private By SelectDate_button = By.xpath("")
	 */
	
	
	
	public void VerifyDashboard()  {
		
		String s =	Helper.getDriver().findElement(DashBoard).getText();
		Assert.assertEquals(s, "John Smith");
		
	}
	
	public void ClickCustomersTab()  {
		
		
		Helper.getDriver().findElement(CustomersTab_Button).click();
		Helper.getDriver().findElement(CustomerschildTab_Button).click();
		
	}
	
	public void ClickAddNewButton()  {
		
		Helper.getDriver().findElement(AddNew_Button).click();
	}
	
	public void VerifySucessmsg()  {
		
		Helper.getDriver().findElement(Customersuccessmsg).isDisplayed();
		
	}
	
    public void ClicksaveButton()  {
    	
    	Helper.getDriver().findElement(Save_Button).click();
    	
    }
	
	
	public void AddCustomer(String email,String psw,String firstName,String LastName,String genderFemale,String Dob,String Companyname,String Newletter) {
		
		
		Helper.getDriver().findElement(Email_Textbox).sendKeys(email);
		Helper.getDriver().findElement(Password_Textbox).sendKeys(psw);
		Helper.getDriver().findElement(FirstName_textbox).sendKeys(firstName);
		Helper.getDriver().findElement(LastName_Textbox).sendKeys(LastName);
		
		if(Helper.getDriver().findElement(GenderFemale_Radio).getAttribute("id").equalsIgnoreCase(genderFemale)) {
			Helper.getDriver().findElement(GenderFemale_Radio).click();
		}else {
			System.out.println("pass");
			System.out.println(Helper.getDriver().findElement(GenderFemale_Radio).getText());
			Helper.getDriver().findElement(GenderMale_Radio).click();
		}
		Helper.getDriver().findElement(DateOfBirth_Select).sendKeys(Dob);
		Helper.getDriver().findElement(CompanyName_Textbox).sendKeys(Companyname);
		
		Helper.getDriver().findElement(NewsLetter_Textbox).sendKeys(Newletter);
		
	}
	
}
