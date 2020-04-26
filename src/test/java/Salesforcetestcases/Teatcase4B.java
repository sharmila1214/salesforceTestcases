package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teatcase4B {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.salesforce.com/");
	      
	     WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	login.click();
	driver.findElement(By.id("username")).sendKeys("rakesh");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("sru123");
	driver.findElement(By.id("Login")).click();
	driver.quit();
	}

}
