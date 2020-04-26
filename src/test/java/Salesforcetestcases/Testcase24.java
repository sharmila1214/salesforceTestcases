package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase24 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
	//click + tab
	WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	usermenu2.click();
	
	//click on leads and click on view
	driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='new']")).click();
	driver.findElement(By.id("name_lastlea2")).sendKeys("ABCD");
	driver.findElement(By.id("lea3")).sendKeys("ABCD");
	driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	Thread.sleep(3000);
	
	}

}
