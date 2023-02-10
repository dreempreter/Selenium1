package selrevelion.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class HarryPoterSearch extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	WebElement searchDDElement = driver.findElement(By.id("searchDropdownBox"));
	Select selectDD = new Select(searchDDElement);
	
	//Print all the options of the dropDown
	/*List<WebElement> optionList=selectDD.getOptions();
	for( WebElement option: optionList)
	System.out.println(option.getText());*/
	
	//three different ways to select one dropfown
	selectDD.selectByVisibleText("Books");
	WebElement searchTxt=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//	searchTxt.sendKeys("Murad");
//	Thread.sleep(1000);
//	searchTxt.clear();
//	Thread.sleep(1000);
//	searchTxt.sendKeys("Bayramov");
//	Thread.sleep(1000);
	
	searchTxt.sendKeys("Harry Potter");
	Thread.sleep(1000);
	WebElement searchBtn=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']/input"));
	
	searchBtn.submit();
	Thread.sleep(1000);
	
	//FindElement vs FindElements
	//return with xPath
	
	//Find elements 
	//return with xPath inside a list
	
	
//	//It will click on the first element with xPath
//	WebElement element = driver.findElement(By.xpath("//li[@class='a-spacing-micro']"));
//	element.click();
	
	List<WebElement> elementList=driver.findElements(By.xpath("//li[@class='a-spacing-micro']"));
	
	System.out.println("There are ---> " + elementList.size() + "<--elements with xPath ");
	
	for(WebElement el :elementList)
	{
		String elementText=el.getText();
		if(elementText.equals("Kindle Unlimited Eligible")) {
			el.click();
			break;
		}
		
		System.out.println(elementText);
		
		
	}
	
	
	Thread.sleep(3000);
	
	
	
	
	
	
	tearDown();
	
	
	
	
	
}
}
