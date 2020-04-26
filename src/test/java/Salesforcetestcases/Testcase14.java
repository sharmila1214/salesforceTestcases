package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase14 extends Browser{

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("ext-gen152")).click();
				driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
				waitforpageelementtoVisible(driver.findElement(By.id("ext-gen154")));
				driver.findElement(By.id("ext-gen154")).click();
				driver.findElement(By.xpath("(//span[contains(text(),'25')])[2]")).click();
	driver.findElement(By.id("ext-gen63")).click();;
	waitforpageelementtoVisible(driver.findElement(By.xpath("//input[contains(@name,'memorizenew')]")));
	driver.findElement(By.xpath("//input[contains(@name,'memorizenew')]")).click();
	
	waitforpageelementtoVisible(driver.findElement(By.id("report_name")));
	driver.findElement(By.id("report_name")).sendKeys("shl");
	
			waitforpageelementtoVisible(driver.findElement(By.id("devName")));
	driver.findElement(By.id("devName")).sendKeys("str");
	driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	Thread.sleep(3000);
	}

}
