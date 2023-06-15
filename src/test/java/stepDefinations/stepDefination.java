package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
WebDriver driver;
	@Given("user launches Shopping Site")
	public void user_launches_shopping_site() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sbarhate\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://stg.shopwitheg.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	    
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("landing page will be displayed")
	public void landing_page_will_be_displayed() {
	    
	}

}
