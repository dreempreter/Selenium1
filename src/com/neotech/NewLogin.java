package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLogin {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.com/");	
		Thread.sleep(2000);
		
		
		WebElement searchText=driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("clothes");
		WebElement searchButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input"));
		searchButton.click();
	
		// /*[@id="nav-search-submit-button"]
		Thread.sleep(1000);
		
		driver.close();
		
		//There are 8 locators to find the elements in the DOM
		
		//  //*[@id='nav-search-submit-text']/input
		
		//input[@id='nav-search-submit-button']
		

	}
}
