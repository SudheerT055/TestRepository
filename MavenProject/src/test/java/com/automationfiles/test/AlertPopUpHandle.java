package com.automationfiles.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments ("--remote-allow-origins=*");
		
		RemoteWebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
				
		WebElement ele_withOK = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		ele_withOK.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		Alert infoAlert =  driver.switchTo().alert();
		String text = infoAlert.getText();
		System.out.println(text);
		infoAlert.sendKeys("Helloworld");
		Thread.sleep(3000);
		infoAlert.accept();

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		infoAlert =  driver.switchTo().alert();
		infoAlert.sendKeys("Helloworld");
		Thread.sleep(3000);
		infoAlert.dismiss();
		
	}
}
