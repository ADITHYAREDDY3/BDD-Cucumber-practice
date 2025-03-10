package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SigninPage 
{
    WebDriver driver;

    By signinLink = By.linkText("Sign in");
    By username = By.name("login");
    By password = By.id("password");
    By signinBtn = By.name("proceed");
    By captcha = By.linkText("« Back to login page");


    
    public SigninPage(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this); // Initialize the elements
    }


    public void clickSignInLink() 
    {
    	driver.findElement(signinLink).click();
    }

    public void enterUsername(String usernameText) 
    {
    	driver.findElement(username).sendKeys("yourUsername");
    }

    public void enterPassword(String passwordText) 
    {
    	driver.findElement(password).sendKeys("yourPassword");

    }

    public void clickSigninBtn() 
    {
    	driver.findElement(signinBtn).click();
    }

    public boolean capchaIsVisible() 
    {
        return driver.findElement(captcha).isDisplayed();
    }
    

}