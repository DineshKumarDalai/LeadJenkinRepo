package stepDefinations;

import org.openqa.selenium.support.PageFactory;

import PageObjects.AddCustomer;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Helper;

public class AddCustomerSteps extends BaseClass {

	public   AddCustomer addcustomer;
	public LoginPage loginPage;
	
	 @Given("User can view DashBoard") 
	  public void user_can_view_dash_board()
	 { 
		  addcustomer = new AddCustomer(Helper.getDriver());
		  addcustomer.VerifyDashboard(); 
		  }
	  
	  @Then("click customers under customers Tab") 
	  public void click_customers_under_customers_tab()  {
	  addcustomer.ClickCustomersTab(); 
	  }
	  
	  @Then("click AddNew button")
	  public void click_add_new_button() { 
		  addcustomer.ClickAddNewButton();
		  }
	  
	  @Then("Fill All the fields")
	  public void fill_all_the_fields() {
	  
	  addcustomer.AddCustomer("ramesh@yourstore.com", "abcdef", "Ramesh", "Dutt",
	  "Gender_Female", "04/23/1990", "NewSpice", "Test store 2"); 
	  }
	  
	  @Then("Click on Save Button")
	  public void click_on_save_button()  { 
		  addcustomer.ClicksaveButton(); 
		  }
	  
	  @Then("User can view Confirmation message {string}") 
	  public void user_can_view_confirmation_message(String string) { 
		  addcustomer.VerifySucessmsg(); 
		  }
	 

	
}
