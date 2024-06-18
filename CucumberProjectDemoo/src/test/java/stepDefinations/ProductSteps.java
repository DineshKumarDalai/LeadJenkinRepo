package stepDefinations;

import PageObjects.AddCustomer;
import PageObjects.EditCustomer;
import PageObjects.LoginPage;
import PageObjects.Productpage;
import PageObjects.SearchCustomerpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Helper;

public class ProductSteps extends BaseClass {
	
	public LoginPage loginPage;
	public AddCustomer addcustomer;
	public SearchCustomerpage searchcustomer;
	public EditCustomer editcustomer;
	public Productpage productpage;
	
	
	@Given("User will see the catalog menu in menu bar")
	public void user_will_see_the_catalog_menu_in_menu_bar() {
		searchcustomer = new SearchCustomerpage(Helper.getDriver());
		productpage = new Productpage(Helper.getDriver());
		productpage.clcikCatalog();
		
	}
	@Then("User click product under catalog menu")
	public void user_click_product_under_catalog_menu() {
		productpage.ClickProductLink();
	}
	@Then("user verify the product table")
	public void user_verify_the_product_table() throws InterruptedException {
		//productpage.CountNoRows();
		//productpage.pagination();
		productpage.ClickArraowPagination();
		productpage.ClickBackArrowpagination();
	}

}
