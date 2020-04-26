package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase17 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		Thread.sleep(3000);
		WebElement usermenu=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu.click();
		//clicking oppertunities
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();	
		driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();

	}

}
