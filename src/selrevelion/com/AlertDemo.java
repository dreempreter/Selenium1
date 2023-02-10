package selrevelion.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.BaseClass;

public class AlertDemo extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
	setUp();
	
	Thread.sleep(2000);
	driver.findElement(By.name("confirmalertbox")).click();
 Alert confirmAlert=driver.switchTo().alert();
 
 System.out.println("The confirm alert text " + confirmAlert.getText());
 confirmAlert.accept();
 Thread.sleep(2000);
	
driver.findElement(By.name("promptalertbox1234")).click();
	
	Alert promtAlert=driver.switchTo().alert();
promtAlert.sendKeys("Yes");
promtAlert.accept();
Thread.sleep(2000);


	
	
	tearDown();
}
}
