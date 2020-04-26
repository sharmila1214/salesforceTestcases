package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase28 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
	//click + tab
	WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	usermenu2.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
	Thread.sleep(4000); 
	WebElement contact=driver.findElement(By.id("fcf"));
	Select recentcontact=new Select(contact);
	recentcontact.selectByIndex(2);
	Thread.sleep(3000);
	}

}
