package com.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {
	
	@Test
	public void searchProduct() {
		
		//By using bonigarcia driver manager
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Fetching the data
		driver.get("https://www.google.com/");
		driver.getTitle(); 
		
		//finding element
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("New York");
	}

}
