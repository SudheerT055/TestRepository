package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.homePage;

public class CheckHomePage {
	WebDriver driver = null;
	homePage homepage;
	@When("user click on the react menu")
	public void user_click_on_the_react_menu() {
		driver = CheckLoginPage.getDriver();
		homepage = new homePage(driver);
		if(homepage.btn_ReactMenuIsDisplayed()) {
			homepage.clickOnReactMenu();
		}
	}

	@Then("logout button should displayed")
	public void logout_button_should_displayed() {
		driver = CheckLoginPage.getDriver();
		homepage = new homePage(driver);
		homepage.btn_LogoutIsDisplayed();
	}

	@When("user clicks on the add to cart button")
	public void user_clicks_on_the_add_to_cart_button() {
		driver = CheckLoginPage.getDriver();
		homepage = new homePage(driver);
		if(homepage.btn_AddtoCartIsDisplayed()) {
			homepage.ClickOnAddtoCart();
		}
		
	}

	@Then("cart badge should show the number")
	public void cart_badge_should_show_the_number() throws IOException {
		driver = CheckLoginPage.getDriver();
		homepage = new homePage(driver);
		if(homepage.badge_CartBadgeIsDisplayed()) {
			String number = homepage.getText_CartBadge();
			if(!number.equals("1")) {
				throw new IOException();
			}
		}
	}
	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
		driver = CheckLoginPage.getDriver();
		homepage = new homePage(driver);
		homepage.btn_ReactMenuIsDisplayed();
	}
}
