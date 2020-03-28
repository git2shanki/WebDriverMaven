package com.w2a.webDriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		System.setProperty("webdriver.chrome.driver",
				  "C:\\My Data\\Self Development\\EClipse SetUp Files\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
				
	}
	
	@Test
	public void doLogin(){
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("reach2shankar@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("shankar");
		
	    
		
	}
}
