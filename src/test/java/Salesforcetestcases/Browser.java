package Salesforcetestcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {


		// TODO Auto-generated method stub
		public static WebDriver driver=null;
		static void launchbrowser(String sbrowser) {
		if(sbrowser.startsWith("fx")) {	
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanuma\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
				driver = new FirefoxDriver();}
		else {
			System.out.println("You have not given browser type correctly");
		}
		driver.manage().window().maximize(); 
		driver.get("https://www.salesforce.com/");
		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		login.click();

		}
		static void quitbrowser() {
		driver.quit();
		}
		static void logintobrowser1() {
			String spath="C:\\Users\\sweet\\eclipse-workspace\\Salesforce\\src\\test\\java\\sales.properties";
			try {
			Properties prop=new Properties();
			FileInputStream fr=new FileInputStream(spath);
			prop.load(fr);
			System.getProperties().putAll(prop);
			
			System.out.println("the property "+System.getProperty("username"));
			System.out.println("the property "+System.getProperty("password"));
			driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("Login")).click();
			Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
	
		static void waitforpageelementtoVisible(WebElement eletowait) {
			WebDriverWait wait=new WebDriverWait(Browser.driver,30);
			wait.until(ExpectedConditions.visibilityOf(eletowait));
		}
	}


