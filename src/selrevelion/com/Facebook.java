package selrevelion.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.BaseClass;

public class Facebook extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	

driver.findElement(By.id("tUsername")).sendKeys("Admin");

driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");

WebElement dd = driver.findElement(By.id("dAcademicYear_list"));

Select selYear = new Select(dd);
selYear.selectByValue("15");
	
	Thread.sleep(3000);
	
	List<WebElement> options=selYear.getOptions();

	for(WebElement option : options)
	{ 
		System.out.println(option.getText() + " ");
	}
	
	tearDown();
	
}
}
