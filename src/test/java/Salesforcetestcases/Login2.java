package Salesforcetestcases;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String spath="C:\\Users\\sweet\\eclipse-workspace\\Salesforce\\src\\test\\java\\sales.properties";
		try {
		Properties prop=new Properties();
		FileInputStream fr=new FileInputStream(spath);
		prop.load(fr);
		System.getProperties().putAll(prop);
		
		System.out.println("the property "+System.getProperty("username"));
		System.out.println("the property "+System.getProperty("password"));
		
		
		WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.salesforce.com/");
      
     WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
login.click();
Thread.sleep(3000);
driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
driver.findElement(By.id("Login")).click();
}
catch(Exception e) {
	System.out.println(e);
}			
		
		
		
		
		
		}

}
