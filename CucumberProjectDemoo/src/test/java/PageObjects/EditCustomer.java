package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import stepDefinations.BaseClass;
import utilities.Helper;

public class EditCustomer extends BaseClass {
	
	public EditCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private By EnterEmail_Textbox = By.id("SearchEmail");
	private By Search_Button = By.id("search-customers");
	private By ResultSetEdit_button = By.xpath("//table[@id='customers-grid']//tbody/tr/td[7]/a");
	private By CardInfo = By.xpath("//div[text()='Customer info']");
	private By EditTableLastName_Textbox = By.id("LastName");
	private By EditTableGender_Radiobutton = By.id("Gender_Male");
	private By EditTableSaveButton = By.xpath("//button[@name='save']");
	
	
	
	public void EnterEmailinEmailSearchfield(String email) {
		Helper.getDriver().findElement(EnterEmail_Textbox).isDisplayed();
		Helper.getDriver().findElement(EnterEmail_Textbox).sendKeys(email);
	}
	
	public void ClickSearchbutton() {
		Helper.getDriver().findElement(Search_Button).isDisplayed();
		Helper.getDriver().findElement(Search_Button).click();
	}
	
	public void CardinfoDisplay() {
		Helper.getDriver().findElement(CardInfo).isDisplayed();
		String s = Helper.getDriver().findElement(CardInfo).getText();
		Assert.assertEquals(s, "Customer info");
	}
	
	public void ClickResultsetEditbutton() {
		Helper.getDriver().findElement(ResultSetEdit_button).isDisplayed();
		Helper.getDriver().findElement(ResultSetEdit_button).click();
	}
	
	public void EnterLastName(String lastname) {
		Helper.getDriver().findElement(EditTableLastName_Textbox).isDisplayed();
		Helper.getDriver().findElement(EditTableLastName_Textbox).clear();
		Helper.getDriver().findElement(EditTableLastName_Textbox).sendKeys(lastname);
	}
	
	public void SelectGender() {
		Helper.getDriver().findElement(EditTableGender_Radiobutton).isDisplayed();
		Helper.getDriver().findElement(EditTableGender_Radiobutton).click();
	}
	
	public void clickSaveButton() {
		Helper.getDriver().findElement(EditTableSaveButton).isDisplayed();
		Helper.getDriver().findElement(EditTableSaveButton).click();
	}
}
