package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase29 extends Browser{

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
	Thread.sleep(2000);
	driver.findElement(By.xpath("//tr[contains(@class,'dataRow even first')]//a[contains(text(),'tekarch3')]")).click();
	}

}







































