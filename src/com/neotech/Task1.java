package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/text-box");
	Thread.sleep(2000);
	
	WebElement button = driver.findElement(By.cssSelector("#userName"));
	button.sendKeys("Murad Bayramov");
	Thread.sleep(2000);
	WebElement search=driver.findElement(By.cssSelector("#userEmail"));
	Thread.sleep(2000);
	search.sendKeys("murad-bayramov-95@mail.ru");
Thread.sleep(2000);

WebElement el = driver.findElement(By.id("currentAddress"));

el.sendKeys("182 main street, Hudson Falls New York, 12839");
Thread.sleep(5000);

WebElement element = driver.findElement(By.cssSelector("#permanentAddress"));
element.sendKeys("182 main street, Empire, Hudson Falls");
Thread.sleep(2000);

driver.findElement(By.id("submit")).click();
Thread.sleep(5000);

	driver.close();
	
}
}
