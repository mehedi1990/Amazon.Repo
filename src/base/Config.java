package base;

import org.apache.log4j.Category;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utilities.Generic;

public class Config extends Generic {
/*	@BeforeSuite
	public void beforeSuite() {
		log.debug("before suite");
	}
	*/
	
	@Parameters("browser")
		@BeforeMethod
		
		public void browserInit(String browser)throws InterruptedException{
		//	System.out.println("Starting the browser");
			log.info("starting the browser");
			if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
				driver= new FirefoxDriver();
			}
				else if(browser.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
					driver= new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("egde")) {
					System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
					driver = new EdgeDriver();
				}
				else {
					throw new IllegalArgumentException("Browser undefined");
				}
				//maximizing page
			pageMaximize();
			 // url
		//	driver.get(url);
			//Thread.sleep(5000);
			
			}
	
	
	@AfterMethod
		public void afterMethod() {
			
			log.info("close the browser");
			driver.close();
		}
	
/*	@AfterSuite
	public void afterSuite() {
		log.debug("after suite");
		
	}	*/	
	
	
	
}
