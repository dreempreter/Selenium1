package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public final static String url1 = "http://sis.neotechacademy.com:9000/Test/";
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get(url1);
	
	
	
	
	
	
	
}
}
