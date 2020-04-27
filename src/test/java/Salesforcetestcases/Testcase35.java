package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase35 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
		WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu2.click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[contains(@name,'customize')]")).click();
	
		
		driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Content')]")).click();
	//Select dr=new Select(ele);	
	//dr.selectByIndex(3);
		
	driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
	driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[contains(text(),'sharmila Aandhandhandhan...')]")).click();
	//driver.findElement(By.id("tryLexDialogX")).click();	
	WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
	usermenu.click();
	//waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
Thread.sleep(2000);
logintobrowser1();
	//driver.close();

	
	}

	
	
}
