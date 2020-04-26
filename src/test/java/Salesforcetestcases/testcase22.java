package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class testcase22 extends Browser{

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
	WebElement ele=driver.findElement(By.id("fcf"));
	Select dropdown=new Select(ele);
	dropdown.selectByIndex(1);
	//logout
	WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
	usermenu.click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	Thread.sleep(3000);
	//login
	logintobrowser1();
	WebElement usermenu3=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	usermenu3.click();
	//click on leads
	driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
	Thread.sleep(2000);
	//waitforpageelementtoVisible(driver.findElement(By.xpath("(//input[@name='go'])[1]")));
	driver.findElement(By.xpath("(//input[@name='go'])[1]")).click();
	}

}
