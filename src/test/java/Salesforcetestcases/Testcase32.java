package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase32 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
		WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
	driver.findElement(By.id("name_lastcon2")).sendKeys("indian");
	driver.findElement(By.id("con4")).sendKeys("sree");
	driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")).click();
	Thread.sleep(3000);
	}

}
