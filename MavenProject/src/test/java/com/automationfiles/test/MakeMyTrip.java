package com.automationfiles.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println("Window is maximized");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build()
				.perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("drag and drop is successfully ");
	}

}
