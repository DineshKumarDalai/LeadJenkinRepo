package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import stepDefinations.BaseClass;
import utilities.Helper;

public class SearchCustomerpage extends BaseClass {

	
	public SearchCustomerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	private By CustomerHeading_img = By.xpath("//h1[contains(text(),'Customers')]");
	private By CustomerEmail = By.id("SearchEmail");
	private By CustomerFirstName_Textbox = By.id("SearchFirstName");
	private By CustomerLastName_Textbox = By.id("SearchLastName");
	private By CustomerDobMonth_Select = By.id("SearchMonthOfBirth");
	private By CustomerDobDay_Select = By.id("SearchDayOfBirth");
	private By CustomerCompany_Textbox = By.id("SearchCompany");
	private By Search_button = By.id("search-customers");
	
	private By ResultSetEmail_Textbox = By.xpath("//table[@id='customers-grid']//tbody/tr/td[2]");
	
	
	
	public void Displaycustomerheading() {
		Helper.getDriver().findElement(CustomerHeading_img).isDisplayed();
	}
	public void EnaterEmail(String email) {
		Helper.getDriver().findElement(CustomerEmail).isDisplayed();
		Helper.getDriver().findElement(CustomerEmail).sendKeys(email);
	}
	
	public void EnterFirstName(String firstname) {
		Helper.getDriver().findElement(CustomerFirstName_Textbox).isDisplayed();
		Helper.getDriver().findElement(CustomerFirstName_Textbox).sendKeys(firstname);
	}
	
	public void EnterlastName(String lastname) {
		Helper.getDriver().findElement(CustomerLastName_Textbox).isDisplayed();
		Helper.getDriver().findElement(CustomerLastName_Textbox).sendKeys(lastname);
	}
	
	public void SelectDobMonth(String month) {
		Helper.getDriver().findElement(CustomerDobMonth_Select).isDisplayed();


		Select sel = new Select(Helper.getDriver().findElement(CustomerDobMonth_Select));
		sel.selectByVisibleText(month);
		
	}
	
	public void SelectDobDay(String day) {
		Helper.getDriver().findElement(CustomerDobDay_Select).isDisplayed();
		
		Select sel = new Select(Helper.getDriver().findElement(CustomerDobDay_Select));
		sel.selectByVisibleText(day);
		
	}
	
	public void EnterCompanyName(String companyName) {
		Helper.getDriver().findElement(CustomerCompany_Textbox).isDisplayed();
		Helper.getDriver().findElement(CustomerCompany_Textbox).sendKeys(companyName);
	}
	
	public void ClickSearchButton() {
		Helper.getDriver().findElement(Search_button).isDisplayed();
		Helper.getDriver().findElement(Search_button).click();
	}
	
	public void ResultSetEmail() {
		Helper.getDriver().findElement(ResultSetEmail_Textbox).isDisplayed();
		String s=Helper.getDriver().findElement(ResultSetEmail_Textbox).getText();
		System.out.println("Email is "+s);
		Assert.assertEquals(s, Helper.getDriver().findElement(ResultSetEmail_Textbox).getText());
	}
	
	
}
