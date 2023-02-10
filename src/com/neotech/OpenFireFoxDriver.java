package com.neotech;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxDriver {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
	
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	
	String actualUrl = driver.getCurrentUrl();
	String exceptedUrl ="https://www.youtube.com/";
	
	if(actualUrl.equals(exceptedUrl))
	{
		System.out.println("Title = " + driver.getTitle());
		
	}
	else
	{
		System.out.println(" The Url is wrong");
	}
	Thread.sleep(5000);
	driver.close();
	
}
}
