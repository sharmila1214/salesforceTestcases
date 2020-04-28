package Salesforcetestcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase36 extends Browser{

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
	driver.findElement(By.id("timePickerItem_41")).click();
	
	Thread.sleep(2000);
	waitforpageelementtoVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
	driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	

	
	
	Thread.sleep(3000);
	}

}
