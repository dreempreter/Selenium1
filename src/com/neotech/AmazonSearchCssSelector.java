package com.neotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchCssSelector {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		//In this example I will use CSS Selector
		//               #(hashtag ) means the Id
		//           #twotabsearchtextbox---> any element with id
		// input#twotabsearchtextbox ---> means any input that has Id twotabsearchtextbox
		
		//       #nav-search-submit-button
		
		
		WebElement searchText = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchText.sendKeys("watch");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		searchButton.click();
		
		Thread.sleep(2000);
		
		
		
driver.close();
	}
}
