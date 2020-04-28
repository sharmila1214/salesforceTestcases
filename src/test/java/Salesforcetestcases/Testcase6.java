package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase6 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
launchbrowser("fx");
logintobrowser1();
WebDriver driver= Browser.driver;
WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
usermenu.click();
waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));

driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();

waitforpageelementtoVisible(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")));
driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
Thread.sleep(2000);

waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("a");

waitforpageelementtoVisible(driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();

WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
waitforpageelementtoVisible(ele);
ele.click();

driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
WebElement el=driver.findElement(By.cssSelector("body"));
el.sendKeys("salesforce");

Thread.sleep(2000);
driver.switchTo().defaultContent();
waitforpageelementtoVisible(driver.findElement(By.id("publishersharebutton")));
driver.findElement(By.id("publishersharebutton"));

waitforpageelementtoVisible(driver.findElement(By.xpath("//span[contains(text(),'File')]")));
driver.findElement(By.xpath("//span[contains(text(),'File')]")).click();	
driver.findElement(By.id("chatterUploadFileAction")).click();
waitforpageelementtoVisible(driver.findElement(By.id("chatterFile")));
driver.findElement(By.id("chatterFile")).sendKeys("C:\\Users\\sweet\\Documents\\image1.jpg");
driver.findElement(By.id("publishersharebutton")).click();
Thread.sleep(3000);
WebElement addphoto=driver.findElement(By.xpath("//img[contains(@class,'chatter-photo')]"));
Actions action1=new Actions(driver);
action1.moveToElement(addphoto).perform();
driver.findElement(By.id("uploadLink")).click();
//waitforpageelementtoVisible(driver.findElement(By.id("uploadPhotoContentId")));	
WebElement photoframe=		driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
driver.switchTo().frame(photoframe);
driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).click();
	WebElement photo=driver.findElement(By.xpath("//*[@id='j_id0:uploadFileForm:uploadInputFile']"));
	photo.sendKeys("C:\\Users\\sweet\\Documents\\image1.jpg");

WebElement savepic=driver.findElement(By.xpath("//*[@id='j_id0:uploadFileForm:save']"));	
	savepic.click();
	Thread.sleep(5000);
	Actions action=new Actions(driver);
	action.dragAndDropBy(driver.findElement(By.xpath("//div[contains(@class,'imgCrop_handle imgCrop_handleNW')]")), 100, 200);
	driver.findElement(By.xpath("//*[@id='j_id0:j_id7:save']")).click();
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	}

}
