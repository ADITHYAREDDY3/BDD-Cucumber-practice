package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseCode;
import utility.SigninPage;

public class RediffSignin 
{
	SigninPage signinpage=new SigninPage(BaseCode.driver);

	@Given("User is on the Rediff homepage")
	public void user_is_on_the_rediff_homepage() 
	{
		Assert.assertEquals(BaseCode.driver.getCurrentUrl(), BaseCode.expectedUrl);
		System.out.println("Home page is valid and visible");
//		BaseCode.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@Given("User is on the Sign In page")
	public void user_is_on_the_sign_in_page() 
	{
	    signinpage.clickSignInLink();
	    System.out.println("Sign in page is visible");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) 
	{
	    signinpage.enterUsername(username);
	    System.out.println("Username is entered");
	    signinpage.enterPassword(password);
	    System.out.println("Password is entered");
	    
	}

	@When("User clicks the Sign In button")
	public void user_clicks_the_sign_in_button() 
	{
	    signinpage.clickSigninBtn();
	    System.out.println("Sign-in button is clicked");
	}

	@Then("Security capcha should appear")
	public void security_capcha_should_appear() 
	{
	    Assert.assertTrue(signinpage.capchaIsVisible());
	    System.out.println("Sign-in is working");
	}


}