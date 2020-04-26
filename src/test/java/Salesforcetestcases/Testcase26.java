package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase26 extends Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
	//click + tab
	WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	usermenu2.click();
	driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
	Thread.sleep(3000); 
	//click on create view and passing values
	driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	driver.findElement(By.id("fname")).sendKeys("sree");
	driver.findElement(By.id("devname")).sendKeys("sri");
	driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
	Thread.sleep(3000);
	
	}

}
