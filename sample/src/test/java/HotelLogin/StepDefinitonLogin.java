package HotelLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelLoginPageFactory;

public class StepDefinitonLogin {
	
	private WebDriver driver;
	private HotelLoginPageFactory hlpg;
	
	@Given("^User is in login page$")
	public void user_is_in_login_page() throws Throwable {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hlpg = new HotelLoginPageFactory(driver);
		
		driver.get("file:///D:/hotelBooking/login.html");
		
	}

	@Then("^Check the heading of the page$")
	public void check_the_heading_of_the_page() throws Throwable {
		
		String strHeading = driver.findElement(By.xpath(".//*[@id='mainCnt']/div[1]/div[1]/h1")).getText();
		if(strHeading.contentEquals("Hotel Booking Application"))
			System.out.println("Heading matched...");
		else
			System.out.println("Heading not matched...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		
	}

	@When("^User enters valid username and password and clicks on login button$")
	public void user_enters_valid_username_and_password_and_clicks_on_login_button() throws Throwable {
		
		hlpg.setPfuName("capgemini");
		hlpg.setPfuPwd("capg1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hlpg.setPfLogin();
		driver.close();
		
	}

	@Then("^Hotel booking page should be displayed$")
	public void hotel_booking_page_should_be_displayed() throws Throwable {
		
		driver.navigate().to("file:///D:/hotelBooking/hotelbooking.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		
	}

	@When("^User enters invalid username and password and clicks on login button$")
	public void user_enters_invalid_username_and_password_and_clicks_on_login_button() throws Throwable {
		
		hlpg.setPfuName("capgemi");
		hlpg.setPfuPwd("capg1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hlpg.setPfLogin();
		driver.close();
		
	}

	@Then("^Error message should be displayed as invalid username and password$")
	public void error_message_should_be_displayed_as_invalid_username_and_password() throws Throwable {
		
		System.out.println("Error in details");
		
	}
	
	@When("^User enters either invalid username or password$")
	public void user_enters_either_invalid_username_or_password() throws Throwable {
		
		hlpg.setPfuName("");
		hlpg.setPfuPwd("capg1234");
		hlpg.setPfLogin();
		
	}

	@Then("^Error message should be displayed as invalid username or password$")
	public void error_message_should_be_displayed_as_invalid_username_or_password() throws Throwable {
		
		System.out.println("Username or password has not been entered");
		
	}

	@When("^User does not enter neither username nor password$")
	public void user_does_not_enter_neither_username_nor_password() throws Throwable {
		
		hlpg.setPfuName("");
		hlpg.setPfuPwd("");
		hlpg.setPfLogin();
		
	}

	@Then("^Error message should be displayed as fields are empty$")
	public void error_message_should_be_displayed_as_fields_are_empty() throws Throwable {
		
		System.out.println("Username and password has not been entered");
		
	}
	
}
