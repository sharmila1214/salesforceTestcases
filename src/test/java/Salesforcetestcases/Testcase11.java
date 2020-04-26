package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase11 extends Browser {

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
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("rao");
		driver.findElement(By.id("devname")).sendKeys("sree");
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
	Thread.sleep(3000);
	}

}
