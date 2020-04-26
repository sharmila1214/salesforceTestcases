package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase25 extends Browser{

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
	driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
	driver.findElement(By.id("name_lastcon2")).sendKeys("tekarch3");
	driver.findElement(By.id("con4")).sendKeys("sree1");
	driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
	
	
	}

}
