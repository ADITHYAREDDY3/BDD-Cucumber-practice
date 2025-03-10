package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.BrowserSelection;
import Helper.CaptureScreenShot;
import Helper.ReadExcelFile;
import Testscript.Page1;

public class VerifyPage1FB {
WebDriver driver;
Page1 page1;
    @BeforeMethod
	public void setUp() {
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
    	
    	BrowserSelection browser = new BrowserSelection();
    	driver = browser.getBrowser("chrome", "https://www.facebook.com/");

		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		page1 = new Page1(driver);
	}
    
    @Test(priority = 1, dataProvider = "info")
    public void loginTc(String u1, String p1) {
    	page1.getLogin(u1, p1);
    	Assert.assertEquals(0, 0);
    }
    
    @DataProvider
    public Object[][] info()
    {
    	ReadExcelFile exf = new ReadExcelFile();
    	int rowcnt = exf.getRowCount(0);
    	short colcnt = exf.getColumnCount(0);
    	System.out.println("Rows: " + rowcnt + "Columns: " + colcnt);
    	
    	Object[][] dataobj = new Object[rowcnt+1][colcnt];
    	for(int r=0; r <= rowcnt; r++) {
    		for(int c=0; c < colcnt; c++) {
    			dataobj[r][c] = exf.getData(0, r, c);
    		}
    	}
    	return dataobj;
    				
    }
    
    @Test(priority = 2)
    public void verifyForgetPwd()
    {
    	page1.getRecoveredPwd();
    	//Assert.assertEquals(10, 20);
    }
    
    
    @AfterMethod
    public void tearDown(ITestResult r)
    {
    	//fail
    	int actualStatus = r.getStatus();
    	int expectStatus = ITestResult.FAILURE;
    	if(actualStatus == expectStatus)
    	{
    	CaptureScreenShot screenshot = new CaptureScreenShot();
    	screenshot.getErrorScreenshot(driver);
    	}
    	else {
    	//pass
    	driver.quit();
    	}
    }
}
