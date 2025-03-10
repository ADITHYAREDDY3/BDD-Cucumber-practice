package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCode {
    public static WebDriver driver;
    public static String expectedUrl = "https://www.rediff.com/";

    // initialization
    public static void initializeDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(expectedUrl);
    }
}
