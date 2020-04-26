package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase6 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
launchbrowser("fx");
logintobrowser1();
WebDriver driver= Browser.driver;
WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
usermenu.click();
driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();

driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
//driver.findElement(By.xpath("//input[@id='lastName']")).Keyssendclear();

driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
Thread.sleep(2000);
//driver.switchTo().window(driver.getWindowHandle());
//WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
//waitforpageelementtoVisible(ele);
//ele.click();
Thread.sleep(3000);
//driver.findElement(By.cssSelector("body")).sendKeys("sharmila");
//driver.findElement(By.id("publishersharebutton")).click();
waitforpageelementtoVisible(driver.findElement(By.id("publisherAttachContentPost")));
driver.findElement(By.id("publisherAttachContentPost")).click();	
//driver.findElement(By.id("chatterUploadFileAction")).click();
//driver.findElement(By.id("chatterFile")).sendKeys("C:\\Users\\sweet\\Documents\\image1.jpg");
//driver.findElement(By.id("publishersharebutton")).click();
Thread.sleep(3000);
	
	}

}
