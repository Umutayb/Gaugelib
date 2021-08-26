package utils.driver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	public static RemoteWebDriver driver;

	public static WebDriverWait wait;

	public RemoteWebDriver setup(String browserName){
		driver = DriverFactory.driverSetup(browserName, driver);
		wait = new WebDriverWait(driver, 10);
		return driver;
	}

	public void teardown(){driver.quit();}
}