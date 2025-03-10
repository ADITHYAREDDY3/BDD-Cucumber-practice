package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page2 {
	
	WebDriver driver;
	public Page2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.id("email");
	By password = By.name("pass");
	By log = By.xpath("//button[@name='login']");
	By forget = By.linkText("Forgotten password?");
	
	public void getLogin(String user , String pass)
	{
		WebElement email = driver.findElement(username);
		email.sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(log).click();
	}
	
	public void getRecoveredPwd()
	{
		driver.findElement(forget).click();
	}

}
