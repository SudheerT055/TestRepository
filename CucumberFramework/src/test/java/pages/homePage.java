package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	static WebDriver driver = null;
	public homePage(WebDriver driver) {
		homePage.driver = driver;
	}
	public boolean btn_ReactMenuIsDisplayed() {
		return driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).isDisplayed();
	}
	public void clickOnReactMenu() {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	}
	public boolean btn_LogoutIsDisplayed() {
		return driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
	}
	public void clickOnLogoutButton() {
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	public boolean btn_AddtoCartIsDisplayed() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
	}
	public void ClickOnAddtoCart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}
	public boolean badge_CartBadgeIsDisplayed() {
		return driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed();
	}
	public String getText_CartBadge() {
		return driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
	}
	
}
