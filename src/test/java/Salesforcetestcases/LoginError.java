package Salesforcetestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginError {

	public static void main(String[] args) throws Exception {
		
		
		//File file = new File("C:\\\\Users\\\\sweet\\\\eclipse-workspace\\\\Salesforce\\\\salesforce.properities");
		//String spath="C:\\Users\\sweet\\eclipse-workspace\\Salesforce\\salesforce.properities";  
//		FileInputStream fileInput = null;
//		try {
//			fileInput = new FileInputStream(spath);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		Properties prop = new Properties();
//		
//		//load properties file
//		try {
//			prop.load(fileInput);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		String spath="C:\\Users\\sweet\\eclipse-workspace\\Salesforce\\src\\test\\java\\sales.properties";
		try {
		Properties prop=new Properties();
		FileInputStream fr=new FileInputStream(spath);
		prop.load(fr);
		System.getProperties().putAll(prop);
		
		System.out.println("the property "+System.getProperty("username"));
		System.out.println("the property "+System.getProperty("password"));
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

		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		Thread.sleep(4000);
	
		driver.findElement(By.id("Login")).click();
		}
		catch(Exception e) {
		
			System.out.println(e);
		}		
			
		

	}

}
