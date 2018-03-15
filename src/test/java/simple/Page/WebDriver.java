package simple.Page;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriver {
	
	public void startBrowser()
	{
		DesiredCapabilities chro = DesiredCapabilities.chrome();
		chro.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		chro.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		chro.setCapability(CapabilityType.HAS_NATIVE_EVENTS, true);
		chro.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);
		chro.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		chro.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
		chro.setCapability(CapabilityType.ENABLE_PERSISTENT_HOVERING, true);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--test-type");
		chro.setCapability(ChromeOptions.CAPABILITY, options);

		System.setProperty("webdriver.chrome.driver", "src/bin/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver(chro);

	}
}
