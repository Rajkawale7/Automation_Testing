package com.selenium.testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateWebPages {
	
	@Test
	public void Netflix() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://WWW.Netflix.com");
		driver.getCurrentUrl();
		driver.getTitle();
		driver.close();
	}
	
	@Test(priority = 1)
	public void Amazon() {
		
		WebDriverManager.chromedriver().setup();             //Repeated for practice purpose
		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.amazon.com/");
		driver1.getTitle();
		driver1.close();
	}
	
	@Test(priority = 2)
	public void YouTube() {
		WebDriverManager.chromedriver().setup();            //Repeated for practice purpose
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.close();
	}
	
	@Test(priority = 3)
	public void DisneyHotStar() {
		WebDriverManager.chromedriver().setup();	        //Repeated for practice purpose
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hotstar.com/");
		driver.getTitle();
		driver.close();
	}
}
