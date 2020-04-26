package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase12 extends Browser {

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
		
	WebElement e2=	driver.findElement(By.id("fcf"));
	Select dropdown=new Select(e2);
	dropdown.selectByIndex(5);
	
	driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fname")).sendKeys("narao");	
	WebElement e3=	driver.findElement(By.id("fcol1"));
	Select dropdown1=new Select(e3);
	dropdown1.selectByIndex(1);	
	WebElement e4=	driver.findElement(By.id("fop1"));
	Select dropdown2=new Select(e4);
	dropdown2.selectByIndex(3);	
	driver.findElement(By.id("fval1")).sendKeys("a");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[3]//table[1]//tbody[1]//tr[1]//td[2]//input[1]")).click();
	
	}

}
