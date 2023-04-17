package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	static WebDriver driver = null;
	public loginPage(WebDriver driver) {
		loginPage.driver = driver;
	}

	public boolean txt_UsernameIsDisplayed() {
		return driver.findElement(By.id("user-name")).isDisplayed();
	}
	public void enterUsername(String username) {
		driver.findElement(By.id("user-name")).sendKeys(username);
	}
	public boolean txt_PasswordIsDisplayed() {
		return driver.findElement(By.id("password")).isDisplayed();
	}
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	public boolean btn_LoginIsDisplayed() {
		return driver.findElement(By.id("login-button")).isDisplayed();
	}
	public void clickOnLogin() {
		driver.findElement(By.id("login-button")).click();
	}
	public boolean btn_errorMessage() {
		return driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
	}
	
	
}
