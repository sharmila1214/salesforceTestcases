package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase19 extends Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		Thread.sleep(3000);
		WebElement usermenu=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu.click();
		driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();	
		
		waitforpageelementtoVisible(driver.findElement(By.id("quarter_q")));
		WebElement ele=driver.findElement(By.id("quarter_q"));
	Select dropdown=new Select(ele);
	dropdown.selectByIndex(0);
	
	waitforpageelementtoVisible(driver.findElement(By.id("quarter_q")));
	WebElement ele1=driver.findElement(By.id("quarter_q"));
Select dropdown1=new Select(ele1);
dropdown1.selectByIndex(1);

driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']")).click();

Thread.sleep(3000);	
	
	
	}

}
