package Salesforcetestcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase37 extends Browser{

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
	waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'Monday April 27, 2020')]")));
	driver.findElement(By.xpath("//a[contains(text(),'Monday April 27, 2020')]")).click();
	
	waitforpageelementtoVisible(driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")));
	driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")).click();
	
	
			
driver.findElement(By.xpath("//a[@title='Combo (New Window)']")).click();
	
	
	ArrayList<String> windowtabs=new ArrayList(driver.getWindowHandles());
	System.out.println(windowtabs.size());
	driver.switchTo().window(windowtabs.get(1));
	driver.get("https://na172.salesforce.com/widg/combobox.jsp?form=editPage&field=evt5&display=1&cnt=5");
	driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
	
	driver.switchTo().window(windowtabs.get(0));
	
WebElement ele=	driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	ele.click();
		driver.findElement(By.id("timePickerItem_42")).click();
		waitforpageelementtoVisible(driver.findElement(By.xpath("//input[@id='IsRecurrence']")))	;
		driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();	;
		
		waitforpageelementtoVisible(driver.findElement(By.xpath("//input[@id='rectypeftw']")))	;
		driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();	;
		
		waitforpageelementtoVisible(driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")))	;
		driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();	
		//driver.findElement(By.xpath("//div[@id='datePicker']//td[contains(text(),'12')]")).click();
		driver.findElement(By.xpath("//select[@id='calMonthPicker']//option[contains(text(),'May')]")).click();
		driver.findElement(By.xpath("//div[@id='datePicker']//td[contains(text(),'12')]")).click();
	driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
	
	//waitforpageelementtoVisible(driver.findElement(By.xpath("//a[@title='Month View']")))	;
	driver.findElement(By.xpath("//img[@class='monthViewIcon']")).click();
	Thread.sleep(3000);
	
	}

}
