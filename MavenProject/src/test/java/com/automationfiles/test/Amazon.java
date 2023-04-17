package com.automationfiles.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles");
		search.submit();
		String xpathName = "//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span";
		String xpathRatingLink = "//following::span[contains(@aria-label,'out of')]/span[@class='a-size-base']";
		List<WebElement> listOfElements = driver
				.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
		for (int i = 1; i <= listOfElements.size(); i++) {
			try {
				String xpathAllSearch = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[" + i
						+ "]";
				WebElement bookName = driver.findElement(By.xpath(xpathAllSearch + xpathName));
				WebElement rating = driver.findElement(By.xpath(xpathAllSearch + xpathName + xpathRatingLink));
				if (bookName.getText().contains("Redmi")) {
					System.out.println("-----------------------------");
					System.out.println(bookName.getText());
					System.out.println("rating : " + rating.getText());
					System.out.println("-----------------------------");
				}
			} catch (NoSuchElementException e) {
				continue;
			}
		}
		driver.close();
	}
}
