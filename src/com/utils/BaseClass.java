package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	/**
	 * This method will create the driver
	 * 
	 */
	public static WebDriver driver;
public static void setUp()
{
	ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
	
	switch(ConfigsReader.getProperty("browser").toLowerCase())
	{
	case"chrome":
		System.setProperty("webdriver.chrome.driver",  Constants.CHROME_DRIVER_PATH);
		
		driver = new ChromeDriver();
		break;
	case"firefox":
		System.setProperty("webdriver.chrome.driver",  Constants.GECKO_DRIVER_PATH);
		driver = new FirefoxDriver();
		break;
		default:
			throw new RuntimeException("Browser is NOT supported!!!");
			
			
	}
	driver.manage().window().maximize();
	driver.get(ConfigsReader.getProperty("url"));
}

/**
 * This method will quit the browser
 */
public static void tearDown()
{
	if(driver!= null)
		driver.quit();
}


}
