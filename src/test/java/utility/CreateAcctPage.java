package utility;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAcctPage {

    WebDriver driver;

    // Define locators using By
    By createLink = By.linkText("Create Account");
    By fullname = By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input");
    By rediffID = By.xpath("//td[@valign='bottom']/input[@type='text']");
    By checkAvailability = By.xpath("//td[@valign='bottom']/input[@type='button']");
    By newpassword = By.id("newpasswd");
    By cnfnewpassword = By.id("newpasswd1");
    By checkBox = By.className("nomargin");
    By mobilenum = By.id("mobno");
    By countr = By.id("country");
    By day = By.xpath("//tbody/tr[22]/td[3]/select[1]");
    By month = By.xpath("//tbody/tr[22]/td[3]/select[2]");
    By year = By.xpath("//tbody/tr[22]/td[3]/select[3]");
    By selectMale = By.xpath("//input[@value='m']");
    By capcha = By.className("captcha");
    By createactbtn = By.id("Register");

    // Constructor to initialize WebDriver
    public CreateAcctPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with the elements
    public void clickCreateAccountLink() {
        driver.findElement(createLink).click();
    }

    public void enterFullName(String name) {
        driver.findElement(fullname).sendKeys(name);
    }

    public void enterRediffId(String rediffId) {
        driver.findElement(rediffID).sendKeys(rediffId);
    }

    public void clickCheckAvailability() {
        driver.findElement(checkAvailability).click();
    }

    public void enterNewPassword(String password) {
        driver.findElement(newpassword).sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        driver.findElement(cnfnewpassword).sendKeys(password);
    }

    public void clickCheckBox() {
        driver.findElement(checkBox).click();
    }

    public void enterMobileNumber(String mobile) {
        driver.findElement(mobilenum).sendKeys(mobile);
    }

    public void selectCountry(String country) {
        Select s1 = new Select(driver.findElement(countr));
        s1.selectByVisibleText(country);
    }

    public void selectDOB(String date, String mob, String yob) {
        Select d = new Select(driver.findElement(day));
        d.selectByValue(date);

        Select m = new Select(driver.findElement(month));
        m.selectByVisibleText(mob);

        Select y = new Select(driver.findElement(year));
        y.selectByValue(yob);
    }

    public void selectMaleGender() {
        driver.findElement(selectMale).click();
    }

    public void enterCapcha()  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capcha please: ");
        driver.findElement(capcha).isDisplayed();
        driver.findElement(capcha).sendKeys(sc.nextLine());
    }

    public void clickCreateAccountButton() {
        driver.findElement(createactbtn).click();
        
    }
}
