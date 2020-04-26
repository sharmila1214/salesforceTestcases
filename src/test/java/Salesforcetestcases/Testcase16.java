package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase16 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		Thread.sleep(3000);
		WebElement usermenu=driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		usermenu.click();
		//clicking oppertunities
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='listRelatedObject opportunityBlock title']")).click();
		driver.findElement(By.id("tryLexDialogX")).click();
		//create oppurtunity
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();	
	Thread.sleep(4000);
	//passing values
	driver.findElement(By.id("opp3")).sendKeys("little");
	driver.findElement(By.id("opp4")).sendKeys("sree1");
	driver.findElement(By.id("opp9")).click();
	driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
	
	
	WebElement stage=driver.findElement(By.xpath("//select[@id='opp11']"));
	waitforpageelementtoVisible(stage);
	Select dropdown1=new Select(stage);
	dropdown1.selectByIndex(2);
	
	WebElement leadsource=driver.findElement(By.id("opp6"));
	waitforpageelementtoVisible(leadsource);
	Select dropdown2=new Select(leadsource);
	dropdown2.selectByIndex(2);
	driver.findElement(By.id("opp12")).sendKeys("0");
	driver.findElement(By.id("opp17")).sendKeys("tekarch");
	driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	
	}

}
