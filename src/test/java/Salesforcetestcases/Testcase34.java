package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase34 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
		WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject homeBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'sharmila Aandhandhandhan...')]")).click();
		//driver.findElement(By.id("tryLexDialogX")).click();	
		
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		//driver.findElement(By.id("tryLexDialogX")).click();	
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		Thread.sleep(2000);
		waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		driver.findElement(By.id("lastName")).sendKeys("abcd");

		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		Thread.sleep(2000);
	}

}
