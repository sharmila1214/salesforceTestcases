package Salesforcetestcases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Testcase8 extends Browser{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("fx");
		logintobrowser1();
		WebDriver driver= Browser.driver;
		WebElement usermenu=driver.findElement(By.xpath("//div[@id='userNavButton']"));
		usermenu.click();
		driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
		Thread.sleep(2000);
		ArrayList<String> windowtabs=new ArrayList(driver.getWindowHandles());
		System.out.println(windowtabs.size());
		driver.switchTo().window(windowtabs.get(1));
	driver.close();
	}

}
