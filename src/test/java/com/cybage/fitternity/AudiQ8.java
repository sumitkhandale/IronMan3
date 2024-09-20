package com.cybage.fitternity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AudiQ8 {
	WebDriver driver;

	@BeforeTest
	public void Launch_Browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
	}

	@Test
	public void List_Of_Data() throws InterruptedException {
		WebElement list = driver.findElement(By.name("fromPort"));
		Select s = new Select(list);
		Thread.sleep(2000);
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}

	}

	@AfterTest
	public void Close_Browser() {
		driver.close();
	}
}
