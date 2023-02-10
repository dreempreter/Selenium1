package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {
public static void main(String[] args) throws InterruptedException {
	
	
	// \Selenium01\drivers
	

	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.neotechacademy.com/");
	
	Thread.sleep(5000);
	String currentUrl=driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println("title " + title);
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
}

}
