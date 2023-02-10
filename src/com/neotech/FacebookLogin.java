package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	
WebDriver driver = new ChromeDriver();


driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys("murad-bayramov-95@mail.ru");
	
Thread.sleep(1000);
	
driver.findElement(By.name("pass")).sendKeys("Gulparemsin8");
	
Thread.sleep(1000);

driver.findElement(By.name("login")).click();
Thread.sleep(5000);
}
}
