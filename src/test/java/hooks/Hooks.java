package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseCode;

public class Hooks{
	@Before
	public void atStart()
	{
		BaseCode.initializeDriver();
	}
	@After
	public void closePage()
	{
		BaseCode.driver.quit();
	}

}