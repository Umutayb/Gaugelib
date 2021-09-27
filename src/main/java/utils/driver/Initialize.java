package utils.driver;

import utils.PropertiesReader;
import utils.StringUtilities;
import utils.Utilities;

public class Initialize extends Utilities {

    PropertiesReader reader = new PropertiesReader("properties-from-pom.properties");
    StringUtilities strUtils = new StringUtilities();

    Driver driver = new Driver();

    public void init(){
        String browser = reader.getProperty("browser");
        driver.setup(strUtils.firstLetterCapped(browser));
    }

    public void terminate(){
        driver.teardown();
    }

}
