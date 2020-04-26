package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase21 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
	//click + tab
	WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	usermenu2.click();
	
	//click on leads 
	driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
	driver.findElement(By.id("fcf")).click();
	Thread.sleep(3000);
	WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
	usermenu.click();
	//waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
	
	
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
Thread.sleep(2000);
	driver.close();
	}

}
