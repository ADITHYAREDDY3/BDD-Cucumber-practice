package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseCode;
import utility.CreateAcctPage;

public class RediffCreateAct 
{
	CreateAcctPage createaccount=new CreateAcctPage(BaseCode.driver);
	@Given("User is on Rediff homepage")
	public void user_is_on_rediff_homepage() 
	{
		Assert.assertEquals(BaseCode.driver.getCurrentUrl(), BaseCode.expectedUrl);
		System.out.println("Home page is valid and visible");
	}

	@When("User clicks on the create new account link")
	public void user_clicks_on_the_link() 
	{
	    createaccount.clickCreateAccountLink();
	    System.out.println("Create new account page is opened");
	}

	@When("User fills in all the required details")
	public void user_fills_in_all_the_required_details() 
	{
	    createaccount.enterFullName("ramesh");
	    System.out.println("Full name is entered");
	    createaccount.enterRediffId("Gancha2398");
	    System.out.println("New RediffID is entered");
	    createaccount.clickCheckAvailability();
	    createaccount.enterNewPassword("Kamal@12123");
	    System.out.println("New password is entered");
	    createaccount.enterConfirmPassword("Kamal@12123");
	    System.out.println("entered the password to conform");
	    createaccount.clickCheckBox();
	 
	    createaccount.enterMobileNumber("7865452905");
	    System.out.println("Mobile number is entered");
	    createaccount.selectDOB("23", "JUN", "1998");
	    System.out.println("Date-of-birth is selected");
	    createaccount.selectMaleGender();
	    System.out.println("Male is selected");
	    createaccount.selectCountry("India");
	    System.out.println("Country is selected");
	    //createaccount.enterCapcha();
	    System.out.println("Capcha is entered");
	}

	@When("User clicks the submit button")
	public void user_clicks_the_button() 
	{
		// createaccount.clickCreateAccountButton();
		System.out.println("Clicked on the create account button");
	}

	@Then("User created the account")
	public void user_created_the_account() 
	{
	    System.out.println("Account is created");
	}

}