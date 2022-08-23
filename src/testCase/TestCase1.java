package testCase;

import org.testng.annotations.Test;

import base.Config;
import object_locator.Locator;
import testData.TestDataValues;

public class TestCase1 extends Config {
	Locator locators=new Locator();
	TestDataValues value=new TestDataValues();
	
	
	@Test
	
		public void signIn() {
		
		 pageLoad(value.fb_url);
			// sending text in text box field on fb email
			typeByXpath(locators.fbEmail_locator,value.fbEmail_value);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// sending text in text box field on fb password
				typeByXpath(locators.fbpassword_locator,value.fbPassworb_value);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					// click on login button 
				//clickByXpath(locators.buttonFb_locator);
				clickByName(locators.buttonFb_locator);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	
}}
