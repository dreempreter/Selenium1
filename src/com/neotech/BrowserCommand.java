package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

//driver.get("https://www.facebook.com/");
//will not store history
//will wait for page to be loaded

driver.navigate().to("https://www.facebook.com/");

driver.manage().window().maximize(); // makes full page

Thread.sleep(2000);


driver.navigate().refresh();


driver.navigate().to("https://www.amazon.com/");
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();

driver.quit();



	
}
}
