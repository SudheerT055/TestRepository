package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class CheckLoginPage {
	static WebDriver driver = null;
	loginPage loginpage;
	@Given("navigate to login page")
	public void navigate_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	public static WebDriver getDriver() {
		return driver;
	}

	@When("user enters the username")
	public void user_enters_the_username() {
		loginpage = new loginPage(driver);
		if(loginpage.txt_UsernameIsDisplayed()) {
			loginpage.enterUsername("standard_user");
		}
	}

	@And("user enters the password")
	public void user_enters_the_password() {
		loginpage = new loginPage(driver);
		if(loginpage.txt_PasswordIsDisplayed()) {
			loginpage.enterPassword("secret_sauce");
		}
	}

	@And("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		loginpage = new loginPage(driver);
		if(loginpage.btn_LoginIsDisplayed()) {
			loginpage.clickOnLogin();
		}
	}

	

	@When("user enters the invalid username")
	public void user_enters_the_invalid_username() {
		loginpage = new loginPage(driver);
		if(loginpage.txt_UsernameIsDisplayed()) {
			loginpage.enterUsername("invalidusername");
		}
	}

	@Then("user should see the error message")
	public void user_should_see_the_error_message() {
		loginpage.btn_errorMessage();
	}

	@And("user enters the invalid password")
	public void user_enters_the_invalid_password() {
		loginpage = new loginPage(driver);
		if(loginpage.txt_PasswordIsDisplayed()) {
			loginpage.enterPassword("invalidpassword");
		}
	}

	@When("user enters the empty username")
	public void user_enters_the_empty_username() {
		loginpage = new loginPage(driver);
		if(loginpage.txt_UsernameIsDisplayed()) {
			loginpage.enterUsername("");
		}
	}

	@And("user enters the empty password")
	public void user_enters_the_empty_password() {
		loginpage = new loginPage(driver);
		if(loginpage.txt_PasswordIsDisplayed()) {
			loginpage.enterPassword("");
		}
	}
	@Then("exit the browser")
	public void exit_the_browser() {
		driver.quit();
	}
	
}
