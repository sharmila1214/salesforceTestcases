package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase10 extends Browser{

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
		waitforpageelementtoVisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		driver.findElement(By.id("acc2")).sendKeys("sharmi");
		WebElement e1=driver.findElement(By.id("acc6"));
		Select dropdown1=new Select(e1);
		dropdown1.selectByIndex(6);
		
		
		WebElement e2=driver.findElement(By.id("00N5w00000HZF2v"));
		Select dropdown2=new Select(e2);
		dropdown2.selectByIndex(1);
	
	
	}

}
