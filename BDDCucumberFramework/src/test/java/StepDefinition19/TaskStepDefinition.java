package StepDefinition19;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import PageRepository.TaskNewCustomerCreation;
import Utilities.BaseClass;
import Utilities.FetchDataFromExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskStepDefinition extends BaseClass {
	
	WebDriver driver = BaseClass.initializeDriver();
	TaskNewCustomerCreation object = new TaskNewCustomerCreation(driver);
	
	@Given("user opens the browser URL")
	public void user_opens_the_browser_url() {
	
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as(String userName) {
	  object.enterUserName(userName);
	}

	@Given("user enters the password as {string}")
	public void user_enters_the_password_as(String pwd) {
	 object.enterPwd(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		object.clickLogin();
	}

	@Then("user is on the homepage of the application")
	public void user_is_on_the_homepage_of_the_application() {
	    String currentURL = getCurrentURL();
	    if (currentURL.contains("homepage")) {
			System.out.println("User Successfully Navigated into Homepage");
		}
	}

	@Given("user navigates into New Customer Page")
	public void user_navigates_into_new_customer_page() {
		object.clickOnNewCustomer();
	}
	
	

	@Given("user entered below details in the respective fields")
	public void user_entered_below_details_in_the_respective_fields(io.cucumber.datatable.DataTable userTable) {

                 List<List<String>> data = userTable.asLists(String.class);
                 object.enteralldetails(data);
                 
                 JavascriptExecutor js = (JavascriptExecutor)driver;
                 js.executeScript("window.scrollBy(0,-500)", "");
                 
	}
	
	@Given("User clicks on Gender button")
	public void user_clicks_on_gender_button() {
	   object.selectGender();
	}

	
	
	@Given("User clicks on Submit button")
	public void user_clicks_on_submit_button() {
	   object.clickOnSubmit();
	}

	@Then("Customer should be created successfully")
	public void customer_should_be_created_successfully() {
		 String currentURL1 = getCurrentURL();
		    if (currentURL1.contains("CustomerReg")) {
				System.out.println("User Successfully created registered");
			}
	}

	@Then("User captures and stores the Customer ID in Excel and saves it")
	public void user_captures_and_stores_the_customer_id_in_excel_and_saves_it() throws IOException {
	    String custID = object.custIDRef();
	    FetchDataFromExcel.writeData(1, 1, custID);
	    driver.quit();
	}
	
	@Given("user navigates into New Account Page")
	public void user_navigates_into_new_account_page() {
	    object.newAccountPageNavigation();
	}

	@Given("user fetch customer ID from excel and enter into customer ID field")
	public void user_fetch_customer_id_from_excel_and_enter_into_customer_id_field() throws IOException {
		
		String custID = FetchDataFromExcel.readData(1, 1);
		object.enterCustID(custID);
	}

	@Given("user enter initial deposit amount value")
	public void user_enter_initial_deposit_amount_value() {
	   object.depositFieldvalue();
	}

	@Given("User clicks on Submit button in Account Page")
	public void user_clicks_on_submit_button_in_account_page() {
	   object.submitButton();
	}

	@Then("Account ID should be created successfully")
	public void account_id_should_be_created_successfully() {
		 String currentURL2 = getCurrentURL();
		    if (currentURL2.contains("AccCreateMsg")) {
				System.out.println("User Successfully generated the Account");
			}
	}

	@Then("User captures and stores the Account ID in Excel and saves it")
	public void user_captures_and_stores_the_account_id_in_excel_and_saves_it() throws IOException {
		String acctID = object.acctIDRef();
	    FetchDataFromExcel.writeData2(1, 2, acctID);
	    driver.quit();
	}

	
	@Given("user scroll into log out")
	public void user_scroll_into_log_out() {
	   
		object.scrollLogout();
	}

	@When("user clicks log out")
	public void user_clicks_log_out() {
	    object.clicksLogout();
	}

	@Then("user successfully logged out")
	public void user_successfully_logged_out() {
	   object.successfulLogout();
	   driver.quit();
	}




}
