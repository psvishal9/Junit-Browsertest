package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SocialMedia {
	
	// Create your own annotation and use
	// Add displayname annotation
	// repeat the test case 3 times
	// Make it a parmeterized test using csvsource
	
	WebDriver driver;
	
	@BeforeAll
	public void startbrowser()
	{
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	
	@DisplayName("Lesson 4 Project")
	@ParameterizedTest ( name = "facebook")
	@ValueSource(strings = {"admin", "admin@123"})
	

	public void Testmethod(String username, String pwd)
	{
        driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(pwd);
	}

	
	@AfterAll
	public void closebrowser()
	{
		driver.close();
	}
	
}










