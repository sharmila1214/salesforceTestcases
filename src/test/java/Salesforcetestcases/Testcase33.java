package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase33 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
		WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject homeBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();	
		
		driver.findElement(By.xpath("//span[contains(text(),'sharmila Aandhandhandhan...')]")).click();
	
	Thread.sleep(3000);
	}

}
