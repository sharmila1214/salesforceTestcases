package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase18 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		Thread.sleep(3000);
		WebElement usermenu=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu.click();
		//click on  oppertunities
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();	
	//click on stuck oppurtunities link
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
	
	}

}
