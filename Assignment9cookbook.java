package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Assignment9cookbook {
	
	
	WebDriver driver;  
	WebDriverWait wait;
  @Test
  public void Radiobuttonclick() throws InterruptedException {
	 driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	 
	 driver.manage().window().maximize();
	 wait = new  WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(250));
	 
	 driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/p[2]/input[2]")).click();
	
	 wait = new  WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(250));
     
	driver.findElement(By.name("abs")).click();
	 wait = new  WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(250));
	
	
	 }
	 
  
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions options=new ChromeOptions();

	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(options);
	//  driver=new ChromeDriver();
	  //WebDriver driver=new ChromeDriver();
		driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
		 
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
	  
  }

}
