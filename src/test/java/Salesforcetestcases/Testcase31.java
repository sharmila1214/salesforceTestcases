package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase31 extends Browser {

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
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.id("fname")).sendKeys("abcd");
		driver.findElement(By.id("devname")).sendKeys("efgh");
	
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")).click();
	
	Thread.sleep(3000);
	
	
	
	
	
	
	}

}
