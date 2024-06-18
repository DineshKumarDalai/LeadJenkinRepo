package stepDefinations;

import PageObjects.AddCustomer;
import PageObjects.EditCustomer;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Helper;

public class EditCustomerSteps extends BaseClass {

	public   AddCustomer addcustomer;
	public LoginPage loginPage;
	public EditCustomer editcustomer;
	
	@Given("User view DashBoard") 
	  public void user_view_dash_board()
	 { 
		searchcustomer = new SearchCustomerpage(Helper.getDriver());
		addcustomer = new AddCustomer(Helper.getDriver());
		editcustomer = new EditCustomer(Helper.getDriver());
		  addcustomer.VerifyDashboard(); 
		  }
	@Then("User click customers under customers menu") 
	  public void User_click_customers_under_customers_menu()  {
	  addcustomer.ClickCustomersTab(); 
	  }
	
	@Then("User Enter email in Search email textbox")
	public void user_enter_email_in_search_email_textbox() {
		searchcustomer.Displaycustomerheading();
		editcustomer.EnterEmailinEmailSearchfield("steve_gates@nopCommerce.com");
		
	}
	@Then("click on Search button")
	public void click_on_search_button() {
	    
		editcustomer.ClickSearchbutton();
	}
	@Then("click on edit button on the result email table")
	public void click_on_edit_button_on_the_result_email_table() {
		editcustomer.ClickResultsetEditbutton();
		
	}
	@Then("user will see the Edit customer details")
	public void user_will_see_the_edit_customer_details() {
		editcustomer.CardinfoDisplay();
		
	}
	@Then("User edit the last name")
	public void user_edit_the_last_name() {
		editcustomer.EnterLastName("Gates");
		
	}
	@Then("user edit the Gender field")
	public void user_edit_the_gender_field() {
		editcustomer.SelectGender();
		
	}
	@Then("User click on save button")
	public void user_click_on_save_button() {
		editcustomer.clickSaveButton();
		searchcustomer.Displaycustomerheading();
	}
}
