package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MavenJunkinsTestCase {
	 WebDriver driver;
	@BeforeClass
	public void openGoogle()
	{ 
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Related Jar Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
	}
	
	@Test
	public void enterText()
	{
		driver.findElement(By.name("q")).sendKeys("Selenium Intigration with Maven");
		driver.findElement(By.name("q")).submit();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}
	
	@AfterClass
	public void CloseWebDriver()
	{
		driver.quit();
	}

}
