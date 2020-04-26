package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase13 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		Thread.sleep(3000);
		WebElement usermenu=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu.click();
		WebElement usermenu1=driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']"));
		usermenu1.click();
		driver.findElement(By.id("tryLexDialogX")).click();
		
		waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srch")).sendKeys("sree1");	
		driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]")).click();	
	Thread.sleep(2000);
		waitforpageelementtoVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'save')]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'save')]")).click();
	
	}

}
