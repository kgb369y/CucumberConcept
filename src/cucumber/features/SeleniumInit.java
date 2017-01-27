package cucumber.features;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SeleniumInit {

	public WebDriver run() throws IOException {
        
        String currentLocation = new File(".").getCanonicalPath();
        String driverPath = new File(currentLocation + File.separator + "drivers" + File.separator + "chrome" + File.separator + "win_chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", driverPath);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		WebDriver driver = new ChromeDriver(capabilities);
        System.out.println(driver.toString());
        return driver;
        
	}
}
