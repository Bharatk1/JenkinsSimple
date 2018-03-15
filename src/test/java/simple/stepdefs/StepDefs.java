package simple.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	
	public static WebDriver driver;
	
	

	@Given("^Open the application$")
	public void open_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/bin/chromedriver/chromedriver.exe");
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("test-type");
		cOptions.addArguments("start-maximized");
		cOptions.addArguments("--js-flags=--expose-gc");
		cOptions.addArguments("--enable-precise-memory-info");
		cOptions.addArguments("--disable-popup-blocking");
		cOptions.addArguments("--disable-default-apps");
		cOptions.addArguments("disable-infobars");
		driver = new ChromeDriver(cOptions);
		driver.get("https://www.google.se/?gfe_rd=cr&dcr=0&ei=asCqWrinC4fBtAHCxoGQBA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^Login to application$")
	public void login_to_application() throws Throwable {
		
		

	}

	@Then("^Validate the login page$")
	public void validate_the_login_page() throws Throwable {

	}

}
