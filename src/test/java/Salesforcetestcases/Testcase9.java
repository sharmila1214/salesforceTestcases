package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase9 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
		usermenu.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
	}

}
