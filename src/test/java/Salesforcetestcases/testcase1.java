package Salesforcetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Thread.sleep(3000);

				driver.get("https://www.salesforce.com/");
				//WebDriverWait wait=new WebDriverWait(driver,30);
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement( By.xpath("//a[contains(text(),'Login')]"))));

				WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
				login.click();
				//WebDriverWait wait=new WebDriverWait(driver,30);
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));

				driver.findElement(By.id("username")).sendKeys("sweety.1428@gmail.com");
				Thread.sleep(4000);
			
				driver.findElement(By.id("Login")).click();
	}

}
