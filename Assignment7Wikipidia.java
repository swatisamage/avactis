package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Assignment7Wikipidia {
	
	WebDriver driver;
	
  @Test
  public void AssignmentWikipedia() throws InterruptedException {
	  ChromeOptions options=new ChromeOptions();

	  options.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.wikipedia.org/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  
		 WebElement myElement=driver.findElement(By.id("js-link-box-en"));
		  myElement.click(); 
		  Thread.sleep(5000);
		 
	 
		 WebElement myElement1= driver.findElement(By.name("search"));
		  
		  myElement1.sendKeys("Selenium");
		  Thread.sleep(5000); 
		 
	    WebElement myElement2=driver.findElement(By.xpath("//div[@class='cdx-search-input cdx-search-input--has-end-button cdx-typeahead-search__input']//button[text()='Search' ]"));
		 myElement2.click();
		 Thread.sleep(5000);      
			
		  String expectedpageTitle="Selenium - Wikipedia";
			  String actualpageTitle=driver.getTitle();
			  System.out.println(actualpageTitle);
			  
			//  assertEquals(actualpageTitle,expectedpageTitle,"Test case is failed! as page title is not as expected");
			 
			  if(expectedpageTitle.equals(actualpageTitle))
			  {
				  System.out.println("Test case is passed");
			  }
			  else
			  {
				  System.out.println("Test case is Failed");
			  }
			  
			  WebElement actualHeading=driver.findElement(By.id("firstHeading" ));
			  String expectedHeading=actualHeading.getText();
			  System.out.println("Expected Heading is:"+expectedHeading);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.wikipedia.org/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
  

}
