package com.selenium.testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YoutubeLink{
	
	@Test
	public void webpage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		System.out.println(driver.getCurrentUrl() + "Title: " + driver.getTitle());
		driver.quit();
	}
}

/* public class demoLink{
	public void webpage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("URl");
		driver.getTitle();
		driver.getCurrentUrl();
	}
} */