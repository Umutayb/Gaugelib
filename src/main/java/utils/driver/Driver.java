package utils.driver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	public RemoteWebDriver setup(String browserName){
		driver = DriverFactory.driverSetup(browserName, driver);
		return driver;
	}

	public static RemoteWebDriver driver;

	public static WebDriverWait wait;

	public static void teardown(){driver.quit();}
}