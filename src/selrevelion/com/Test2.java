package selrevelion.com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.BaseClass;

public class Test2 extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	
	//Preparing for our test
   setUp();
	//Do our test
	Thread.sleep(3000);
	
	WebElement username=driver.findElement(By.id("tUsername"));
	username.sendKeys("Admin");
	Thread.sleep(3000);
	
driver.findElement(By.name("tPassword")).sendKeys("Neotech$123");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//Clear up everything
   tearDown();
	
	
	
}
}
