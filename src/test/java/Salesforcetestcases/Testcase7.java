package Salesforcetestcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase7 extends Browser{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
		usermenu.click();
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		driver.findElement(By.id("PersonalInfo_font")).click();
		waitforpageelementtoVisible(driver.findElement(By.xpath("//span[@id='LoginHistory_font']"))) ;
	driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
	waitforpageelementtoVisible(driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")));
	driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
	waitforpageelementtoVisible(driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")));
	driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
WebElement ele=	driver.findElement(By.id("duel_select_0"));
Select list=new Select(ele)	;
list.selectByVisibleText("Reports");
driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();	
waitforpageelementtoVisible(driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")));
		driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")).click();
	Thread.sleep(3000);
		waitforpageelementtoVisible(driver.findElement(By.xpath("//span[@id='EmailSettings_font']")));
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		driver.findElement(By.id("sender_name")).sendKeys("Sweety.1428@gmail.com");
		driver.findElement(By.id("sender_email")).sendKeys("sharmila.a@salesforce.com");
		driver.findElement(By.id("auto_bcc1")).click();
		//driver.findElement(By.xpath("//input[@name='save']")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'cancel')]")).click();
		
		waitforpageelementtoVisible(driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")));
		driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();	
		
		waitforpageelementtoVisible(driver.findElement(By.xpath("//a[@id='Reminders_font']")));
		driver.findElement(By.xpath("//a[@id='Reminders_font']")).click();
		driver.findElement(By.xpath("//input[@id='testbtn']")).click();
		
		
		
		Thread.sleep(3000);	
	
	
	
	}	
	

	}
