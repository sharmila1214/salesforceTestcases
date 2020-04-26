package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase23 extends Browser{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
	
	//click + tab
	WebElement usermenu2=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	usermenu2.click();
	
	//click on leads and click on view
	driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();
	driver.findElement(By.id("tryLexDialogX")).click();
	WebElement ele=driver.findElement(By.id("fcf"));
	Select dropdown=new Select(ele);
	dropdown.selectByIndex(3);
	
	driver.findElement(By.xpath("(//input[@name='go'])[1]")).click();
	}

}
