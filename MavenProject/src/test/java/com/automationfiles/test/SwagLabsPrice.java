package com.automationfiles.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabsPrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		String inventoryXpath = "// div[@class='inventory_list']/div";
		String priceXpath = "//div[@class='inventory_item_price']";
		float temp = 0.0f;
		int i = 0;
		List<WebElement> inventory = driver.findElements(By.xpath(inventoryXpath));
		for (int iter = 1; iter <= inventory.size(); iter++) {
			String individualProductXpath = inventoryXpath + "[" + iter + "]";
			// String individualProductAddCart = individualProductXpath
			// +"/following-sibling::button";
			String priceValue = driver.findElement(By.xpath(individualProductXpath + priceXpath)).getText();
			priceValue = priceValue.replace("$", "");
			float floatPrice = Float.parseFloat(priceValue);
			if (temp < floatPrice) {
				i = iter;
				temp = floatPrice;
			} 
		}
		driver.findElement(By.xpath(inventoryXpath + "[" + i + "]" + priceXpath + "/following-sibling::button"))
				.click();

	}
}
