package com.automationfiles.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBestSeller {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("books");
		search.submit();
		
		String xpathBestSeller = "//span[@class='a-badge-text']";
		String xpathName = "//following::span[@class='a-size-medium a-color-base a-text-normal']";
		
			
		List<WebElement> allSearchResults = driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
		
		for(int i = 1; i<= allSearchResults.size();i++) {
			String xpath_Individual = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/div["+i+"]";
			try {
				WebElement bestSeller = driver.findElement(By.xpath(xpath_Individual+xpathBestSeller));
				if(bestSeller.getText().equals("Best seller")) {
					System.out.println(driver.findElement(By.xpath(xpath_Individual+xpathBestSeller+xpathName)).getText());
					System.out.println("------------------------------------------------------");
				}
			}catch(NoSuchElementException e) {
				continue;
			}
		}
		driver.close();
	}

}
