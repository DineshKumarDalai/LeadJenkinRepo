package stepDefinations;

import PageObjects.AddCustomer;
import PageObjects.SearchCustomerpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Helper;

public class SearchCustomerSteps extends BaseClass {
	
	public SearchCustomerpage searchcustomer;
	public AddCustomer addcustomer;
	
	@Given("User can view the DashBoard") 
	  public void user_can_view_the_dash_board()
	 { 
		searchcustomer = new SearchCustomerpage(Helper.getDriver());
		addcustomer = new AddCustomer(Helper.getDriver());
		  addcustomer.VerifyDashboard(); 
		  }
	@Then("User click customers under customers Tab") 
	  public void User_click_customers_under_customers_tab()  {
	  addcustomer.ClickCustomersTab(); 
	  }
	
	@When("User is on Search Page")
	public void user_is_on_search_page() {
		searchcustomer.Displaycustomerheading();
		
	}
	@Then("User enater the Email in Email Search box")
	public void user_enater_the_email_in_email_search_box() {
		searchcustomer.EnaterEmail("ramesh@yourstore.com");
		searchcustomer.EnterCompanyName("NewSpice");
		searchcustomer.EnterFirstName("Ramesh");
		searchcustomer.EnterlastName("Dutt");
		searchcustomer.SelectDobMonth("4");
		searchcustomer.SelectDobDay("23");
		
	}
	@When("User click on search button")
	public void user_click_on_search_button() {
		searchcustomer.ClickSearchButton();
		
	}
	@Then("User will see the searched email is display on tabular format")
	public void user_will_see_the_searched_email_is_display_on_tabular_format() {
		searchcustomer.ResultSetEmail();
		
	}
	


}
