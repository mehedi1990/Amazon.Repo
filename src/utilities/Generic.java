package utilities;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic {
	


// public static Logger Log = Logger.getLogger(Logger.class.getName()); 
			public static Logger log=Logger.getLogger("lio");
				//initialization Driver
			 public static WebDriver driver=null;
			//open browses
//			 @Parameters({"url","browser"})
				public static void launchBrowser( String browser) {
					try {
						if(browser.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
						driver= new FirefoxDriver();
					}
						else if(browser.equalsIgnoreCase("chrome")) {
							System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
							driver = new ChromeDriver();
						}
						else if(browser.equalsIgnoreCase("edge")) {
							System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
							driver = new EdgeDriver();
						}else{
							throw new IllegalArgumentException();
						}
					//	driver.get(url);
							}catch(Exception e) {
								System.err.println("issue with"+ e.getMessage());
					}
				}
				
				// loading page
				public static void pageLoad(String url) {
					try {
					driver.get(url);
					Thread.sleep(4000);
				}catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}}
			 
			// maximizing page
			public static void pageMaximize() {
				try {
				driver.manage().window().maximize();
			}catch(Exception e) {
				System.err.println("issue with " + e.getMessage());
			}}
			// navigate to page
		/*	public void navigateTo(String webpage) {
				try {
					driver.navigate().to(url);
				}catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}	
			}  */
			// navigate back to previous page
				public void navigateBack() {
					try {
						driver.navigate().back();
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// refresh page
				public void refresh() {
					try {
						driver.navigate().back();
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				//-------------------IMPLICIT WAIT------------------------
				//implicit wait
				public void implicitWait(int sec) {
					try {
						driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				//----------------EXPLICIT WAIT----------------
				//Explicit wait() BY XPATH presenceOfElementLocated
				
				public void explicitWaitByxpath_presenceOfElementLocated(String locators ,int sec) {
					try {
						WebDriverWait wait = new WebDriverWait(driver, sec); 
					//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators))).click(); 
          
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				//Explicit wait() By CssSelector presenceOfElementLocated
				
					public void explicitWaitByCssSelector_presenceOfElementLocated(String locators ,int sec) {
						try {
						WebDriverWait wait = new WebDriverWait(driver, sec); 
			//		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locators))).click(); 

						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
					//Explicit wait() until alertIsPresent
					
					public void explicitWait_alertIsPresent(int sec) {
						try {
							WebDriverWait wait = new WebDriverWait(driver, sec); 
				//			wait.until(ExpectedConditions.alertIsPresent()); 

						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//Explicit wait() until elementToBeClickable By XPATH
					
							public void explicitWaitByxpath_elementToBeClickable( String locators ,int sec) {
								try {
							WebDriverWait wait = new WebDriverWait(driver, sec); 
			//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locators))); 

								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}
			//Explicit wait() until elementToBeClickable By CssSelector
							
							public void explicitWaitByCssSeelctor_elementToBeClickable( String locators ,int sec) {
								try {
							WebDriverWait wait = new WebDriverWait(driver, sec); 
				//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locators))); 

								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}		
			//Explicit wait() until frame To B eAvailable And Switch To It By CssSelector
							
				public void explicitWaitByCssSeelctor_frameToBeAvailableAndSwitchToIt( String locators ,int sec) {
								try {
							WebDriverWait wait = new WebDriverWait(driver, sec); 
				//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(locators))); 

								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}		
				//Explicit wait() until frame To Be Available And Switch To It By XPATH
				
					public void explicitWaitByXpath_frameToBeAvailableAndSwitchToIt( String locators ,int sec) {
									try {
								WebDriverWait wait = new WebDriverWait(driver, sec); 
				//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(locators))); 

									}catch(Exception e) {
										System.err.println("issue with " + e.getMessage());
									}	
								}
					//Explicit wait() until presence Of All Elements Located By XPATH
					
						public void explicitWaitByXpath_presenceOfAllElementsLocatedBy( String locators ,int sec) {
										try {
									WebDriverWait wait = new WebDriverWait(driver, sec); 
			//			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locators))); 

										}catch(Exception e) {
											System.err.println("issue with " + e.getMessage());
										}}	
			//Explicit wait() until presence Of All Elements Located By CssSelector
										
					public void explicitWaitByCssSelector_presenceOfAllElementsLocatedBy( String locators ,int sec) {
									try {
								WebDriverWait wait = new WebDriverWait(driver, sec); 
				//				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locators))); 

											}catch(Exception e) {
								System.err.println("issue with " + e.getMessage());
											}	
					}	
			//Explicit wait() until visibility Of Element Located By Xpath
					
			public void explicitWaitByxpath_visibilityOfElementLocated( String locators ,int sec) {
				try {
			WebDriverWait wait = new WebDriverWait(driver, sec); 
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators))).click(); 

						}catch(Exception e) {
			System.err.println("issue with " + e.getMessage());
						}	
								}										
			//Explicit wait() until visibility Of Element Located By CssSelector

			public void explicitWaitByCssSelector_visibilityOfElementLocated( String locators ,int sec) {
				try {
			WebDriverWait wait = new WebDriverWait(driver, sec); 
	//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators))).click(); 

						}catch(Exception e) {
			System.err.println("issue with " + e.getMessage());			}	}
			//-----------------FLUENT WAIT----------------------------------------------------------
			//Fluent wait
				public void fluentWait(int sec) {
					try {
						FluentWait wait = new FluentWait(driver);
						//Specify the timout of the wait
						wait.withTimeout(sec, TimeUnit.SECONDS);
						//Sepcify polling time
						wait.pollingEvery(5, TimeUnit.SECONDS);
						//Specify what exceptions to ignore
						wait.ignoring(NoSuchElementException.class);
						//This is how we specify the condition to wait on.
			//			wait.until(ExpectedConditions.alertIsPresent());	
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
			//----------------------------------------------------
				//---------------BUTTON LINK ----------------
				// button, link click ByXpath
				public void clickByXpath(String locators) {
					try {
						if(driver.findElement(By.xpath(locators)).isDisplayed()) {
						driver.findElement(By.xpath(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, link click ClassName
				public void clickByClassName(String locators) {
					try {
						if(driver.findElement(By.className(locators)).isDisplayed()) {
						driver.findElement(By.className(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, link click by ID
				public  void clickByID(String locators) {
					try {
						if(driver.findElement(By.id(locators)).isDisplayed()) {
						driver.findElement(By.id(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, link click By CssSelector
				public void clickByCssSelector(String locators) {
					try {
						if(driver.findElement(By.cssSelector(locators)).isDisplayed()) {
						driver.findElement(By.cssSelector(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, link click By TagName
				public  void clickByTagName(String locators) {
					try {
						if(driver.findElement(By.tagName(locators)).isDisplayed()) {
						driver.findElement(By.tagName(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, link click By link text
				public void clickByLinkText(String locators) {
					try {
						if(driver.findElement(By.linkText(locators)).isDisplayed()) {
						driver.findElement(By.linkText(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, linK click By partial link text
				public  void clickByPartial_linkText(String locators) {
					try {
						if(driver.findElement(By.partialLinkText(locators)).isDisplayed()) {
						driver.findElement(By.partialLinkText(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// button, link click ByName
				public  void clickByName(String locators) {
					try {
						if(driver.findElement(By.name(locators)).isDisplayed()) {
						driver.findElement(By.name(locators)).click(); }
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				} 
				//----------------------------------------------------------------
				// -------------TEXT BOX -------------------
					//  Text Box filed Type ByXpath
					public  void typeByXpath(String locators,String values) {
						try {
							 
							driver.findElement(By.xpath(locators)).clear();
							driver.findElement(By.xpath(locators)).sendKeys(values);
							
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//  Text Box filed Type By CssSelector
					public  void typeByCssSelector(String locators,String values) {
						try {
							 
							driver.findElement(By.cssSelector(locators)).clear();
							driver.findElement(By.cssSelector(locators)).sendKeys(values);
							
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//  Text Box filed Type By ClassName
					public void typeByClassName(String locators,String values) {
						try {
							 
							driver.findElement(By.className(locators)).clear();
							driver.findElement(By.className(locators)).sendKeys(values);
							
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//  Text Box filed Type ByName
					public  void typeByName(String locators,String values) {
						try {
							 
							driver.findElement(By.name(locators)).clear();
							driver.findElement(By.name(locators)).sendKeys(values);
							
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//  Text Box filed Type By link text
					public  void typeByLinkText(String locators,String values) {
						try {
							 
							driver.findElement(By.linkText(locators)).clear();
							driver.findElement(By.linkText(locators)).sendKeys(values);
							
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//  Text Box filed Type By TagName
					public  void typeByTagName(String locators,String values) {
						try {
							 
							driver.findElement(By.tagName(locators)).clear();
									
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
				//---------------------------------------------------------------
				//----------- CHECK BOX-----------------------	
						// check Box-click ByXpath
							public  void clickByXpath_CheckBox(String locators) {
								try {
									if(driver.findElement(By.xpath(locators)).isDisplayed()) {
										if(driver.findElement(By.xpath(locators)).isEnabled()) {
										   if(driver.findElement(By.xpath(locators)).isSelected()){	
									           driver.findElement(By.xpath(locators)).click();}
										     else {
											   System.out.println(" enter else to click check Box");
											   driver.findElement(By.xpath(locators)).click();
										       }}
										else {
											System.out.println("check Box is not enabled");
										}}
								else {
										System.out.println("check Box is not displayed");
										
										   }
									
					     }catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// check Box-click By CssSelector
							public  void clickByCssSelector_CheckBox(String locators) {
								try {
									if(driver.findElement(By.cssSelector(locators)).isDisplayed()) {
										if(driver.findElement(By.cssSelector(locators)).isEnabled()) {
										   if(driver.findElement(By.cssSelector(locators)).isSelected()){	
									           driver.findElement(By.cssSelector(locators)).click();}
										     else {
											   System.out.println(" enter else to click check Box");
											   driver.findElement(By.cssSelector(locators)).click();
										       }}
									  else {
											System.out.println("check Box is not enabled");
										}}
							   else {
										System.out.println("check Box is not displayed");
										
										   }
									
					 }catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// check Box click By TagName
							public  void clickByTagName_CheckBox(String locators) {
								try {
									if(driver.findElement(By.tagName(locators)).isDisplayed()) {
										if(driver.findElement(By.tagName(locators)).isEnabled()) {
										   if(driver.findElement(By.tagName(locators)).isSelected()){	
									           driver.findElement(By.tagName(locators)).click();}
										     else {
											   System.out.println(" enter else to click check Box");
											   driver.findElement(By.tagName(locators)).click();
										       }}
										else {
											System.out.println("check Box is not enabled");
										}}
									else {
										System.out.println("check Box is not displayed");
										
										   }
									
					       }catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// check Box click By ClassNmae
							public  void clickByClassName_CheckBox(String locators) {
								try {
									if(driver.findElement(By.className(locators)).isDisplayed()) {
										if(driver.findElement(By.className(locators)).isEnabled()) {
										   if(driver.findElement(By.className(locators)).isSelected()){	
									           driver.findElement(By.className(locators)).click();}
										     else {
											   System.out.println(" enter else to click check Box");
											   driver.findElement(By.className(locators)).click();
										       }}
										else {
											System.out.println("check Box is not enabled");
										}}
									else {
										System.out.println("check Box is not displayed");
										
										   }
									
					       }catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
				//------------------------------------------------------------------------
				//----------------RADIO BUTTON------------------			
						// select radio button click ByXpath
							public void clickByxpath_radioButton(String locators) {
								try {
										
									// Store all the elements of same category in the list of WebLements
									 List<WebElement> oRadioButton = driver.findElements(By.xpath(locators));
									 // Create a boolean variable which will hold the value (True/False)
									 boolean bValue = false;
									 // This statement will return True, in case of first Radio button is selected
									 bValue = oRadioButton.get(0).isSelected();
									
									 // This will check that if the bValue is True means if the first radio button is selected
									 if(bValue == true){
									// This will select Second radio button, if the first radio button is selected by default
									oRadioButton.get(1).click();
									 }else{
									// If the first radio button is not selected by default, the first will be selected
									oRadioButton.get(0).click(); }  
									
										
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// select radio button click By CssSelector
							public void clickByCssSelector_radioButton(String locators) {
								try {
										
									// Store all the elements of same category in the list of WebLements
									 List<WebElement> oRadioButton = driver.findElements(By.cssSelector(locators));
									 // Create a boolean variable which will hold the value (True/False)
									 boolean bValue = false;
									 // This statement will return True, in case of first Radio button is selected
									 bValue = oRadioButton.get(0).isSelected();
									
									 // This will check that if the bValue is True means if the first radio button is selected
									 if(bValue == true){
									// This will select Second radio button, if the first radio button is selected by default
									oRadioButton.get(1).click();
									 }else{
									// If the first radio button is not selected by default, the first will be selected
									oRadioButton.get(0).click(); }  
									
										
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// select radio button click By ClassName
							public void clickByClassName_radioButton(String locators) {
								try {
										
									// Store all the elements of same category in the list of WebLements
									 List<WebElement> oRadioButton = driver.findElements(By.className(locators));
									 // Create a boolean variable which will hold the value (True/False)
									 boolean bValue = false;
									 // This statement will return True, in case of first Radio button is selected
									 bValue = oRadioButton.get(0).isSelected();
									
									 // This will check that if the bValue is True means if the first radio button is selected
									 if(bValue == true){
									// This will select Second radio button, if the first radio button is selected by default
									oRadioButton.get(1).click();
									 }else{
									// If the first radio button is not selected by default, the first will be selected
									oRadioButton.get(0).click(); }  
									
										
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// select radio button click By tagName
							public void clickBytagName_radioButton(String locators) {
								try {
										
									// Store all the elements of same category in the list of WebLements
									 List<WebElement> oRadioButton = driver.findElements(By.tagName(locators));
									 // Create a boolean variable which will hold the value (True/False)
									 boolean bValue = false;
									 // This statement will return True, in case of first Radio button is selected
									 bValue = oRadioButton.get(0).isSelected();
									
									 // This will check that if the bValue is True means if the first radio button is selected
									 if(bValue == true){
									// This will select Second radio button, if the first radio button is selected by default
									oRadioButton.get(1).click();
									 }else{
									// If the first radio button is not selected by default, the first will be selected
									oRadioButton.get(0).click(); }  
									
										
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
				//-------------------------------------------------------------------------
				// -------------------SCROLL TO DESIRED ELEMENT --------------------			
				// scroll to  until desired element found and click ByXpath
							public void scrollBYxpath_TOElement(String locators) {
								try {
										
									JavascriptExecutor scroll= (JavascriptExecutor)driver;
									
									       WebElement flag=driver.findElement(By.xpath(locators));
									       scroll.executeScript("arguments[0].scrollIntoView();",flag);
									       driver.findElement(By.xpath(locators)).click();   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// scroll to  until desired element found and click By CssSelector
							public void scrollBYCssSelector_TOElement(String locators) {
								try {
										
									JavascriptExecutor scroll= (JavascriptExecutor)driver;
									
									       WebElement flag=driver.findElement(By.cssSelector(locators));
									       scroll.executeScript("arguments[0].scrollIntoView();",flag);
									       driver.findElement(By.cssSelector(locators)).click();   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
							// scroll to  until desired element found and click By CssSelector
							public void scrollBYlinkText_TOElement(String locators) {
								try {
										
									JavascriptExecutor scroll= (JavascriptExecutor)driver;
									
									       WebElement flag=driver.findElement(By.linkText(locators));
									       scroll.executeScript("arguments[0].scrollIntoView();",flag);
									       driver.findElement(By.linkText(locators)).click();   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
			//--------------SCROLL DOWN, UP ,MIDDLE------------------------				
					//	 scroll to  window middle	
							public void scrollTO_middleWindow() {
								try {    
									    JavascriptExecutor jse = (JavascriptExecutor)driver;
									    jse.executeScript("window.scrollBy(0,460)", "");
									    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

									       
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
					//Scrolling window down 
							public void scrollTO_downWindow() {
								try {    
									JavascriptExecutor jse = (JavascriptExecutor)driver;
									jse.executeScript("window.scrollBy(0,5000)", "");
									jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
									Thread.sleep(5000);       
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}			
							//Scrolling window up 
							public void scrollTO_upWindow() {
								try {    
									JavascriptExecutor jse = (JavascriptExecutor)driver;
									jse.executeScript("window.scrollBy(0,-5000)", "");
									jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
									Thread.sleep(5000);       
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}
			//-------------------------------------------------------
			//---------------TOOL TIP--------------------------------------				
							//  check tool tip text By link text
							public void checkBylinktext_ToolTipText(String locators) {
								try {    
									WebElement tooltip=driver.findElement(By.linkText(locators));
									Actions actions=new Actions(driver);
									actions.moveToElement(driver.findElement(By.linkText(locators))).perform();
									String tooltiptext=tooltip.getText() ;
									System.out.println(tooltiptext);

									Thread.sleep(4000);   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
						//  check tool tip text ByXpath
							public void checkByxpath_ToolTipText(String locators) {
								try {    
									WebElement tooltip=driver.findElement(By.xpath(locators));
									Actions actions=new Actions(driver);
									actions.moveToElement(driver.findElement(By.xpath(locators))).perform();
									String tooltiptext=tooltip.getText() ;
									System.out.println(tooltiptext);

									Thread.sleep(4000);   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
						//  check tool tip text By CssSelector
							public void checkByCssSelector_ToolTipText(String locators) {
								try {    
									WebElement tooltip=driver.findElement(By.cssSelector(locators));
									Actions actions=new Actions(driver);
									actions.moveToElement(driver.findElement(By.cssSelector(locators))).perform();
									String tooltiptext=tooltip.getText() ;
									System.out.println(tooltiptext);

									Thread.sleep(4000);   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
						//  check tool tip text By Partial link text
										public void checkByPartiallinktext_ToolTipText(String locators) {
											try {    
										WebElement tooltip=driver.findElement(By.partialLinkText(locators));
										Actions actions=new Actions(driver);
										actions.moveToElement(driver.findElement(By.partialLinkText(locators))).perform();
										String tooltiptext=tooltip.getText() ;
										System.out.println(tooltiptext);

												Thread.sleep(4000);   
												}catch(Exception e) {
												System.err.println("issue with " + e.getMessage());
											}}	
				//--------------------------------------------------------------------------
				//----------------HOVER OVER-------------------------						
							// Hover over on webElement BY CssSelector
							public void checkByCssSelector_Hoverover(String locators) {
								try {    

									WebElement element=driver.findElement(By.cssSelector(locators));
									Actions actions=new Actions(driver);
									actions.moveToElement(element).perform();
									
								Thread.sleep(2000);
									   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
							// Hover over on webElement ByXpath
							public void checkByXpath_Hoverover(String locators) {
								try {    

									WebElement element=driver.findElement(By.xpath(locators));
									Actions actions=new Actions(driver);
									actions.moveToElement(element).perform();
									
								Thread.sleep(2000);
									   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
							// Hover over on webElement BY link Text
							public void checkByLinkText_Hoverover(String locators) {
								try {    

									WebElement element=driver.findElement(By.linkText(locators));
									Actions actions=new Actions(driver);
									actions.moveToElement(element).perform();
									
								Thread.sleep(2000);
									   
									}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}}	
							// Hover over on webElement------BY Partial link Text
							public void checkByPartialLinkText_Hoverover(String locators) {
							try {    

							WebElement element=driver.findElement(By.partialLinkText(locators));
							Actions actions=new Actions(driver);
							actions.moveToElement(element).perform();
									
						Thread.sleep(2000);
									   
							}catch(Exception e) {
								System.err.println("issue with " + e.getMessage());
								}}
			//--------------------------------------------------------------------------				
			//----------------- iFrame---------------------------
							// use wait pack for switching frame to frame 
			// switch iFrame by index and XPATH
			 public void switchTo_iFrameByindexClickByXpath(String locators ,int index) {
				 try {
				driver.switchTo().frame(index); 
				driver.findElement(By.xpath(locators)).click();}
				 catch(Exception e) {
					 System.err.println("issue with " + e.getMessage());
				 }
			 }
			//switch iFrame by index and XPATH
			public void switchTo_iFrameByindexClickByCssSelector(String locators ,int index) {
				 try {
				driver.switchTo().frame(index); 
				driver.findElement(By.cssSelector(locators)).click();}
				 catch(Exception e) {
					 System.err.println("issue with " + e.getMessage());
				 }
			}
			//switch iFrame by id/name Click by CssSelector
			public void switchTo_iFrameByNameClickByCssSelector(String locators) {
				try {
				 WebElement element=driver.findElement(By.cssSelector(locators));
				driver.switchTo().frame(element); 
				driver.findElement(By.cssSelector(locators)).click();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());	
				}
			}
			//switch iFrame by id/name Click by XPATH
			public void switchTo_iFrameByNameClickByxpath(String locators,String value) {
				 try {
				driver.switchTo().frame(value); 
				driver.findElement(By.xpath(locators)).click();}
				 catch(Exception e) {
					 System.err.println("issue with " + e.getMessage());
				 }
			}
			//switch iFrame by 	WebElement by tag name
			public void switchTo_iFrameByTagName(String locators) {
				try {
				List<WebElement> se_frame=driver.findElements(By.tagName(locators));
				System.out.println(se_frame.size());	}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//switch iFrame by 	WebElement by XPATH
			public void switchTo_iFrameByXpath(String locators) {
				try {
				List<WebElement> se_frame=driver.findElements(By.xpath(locators));
				System.out.println(se_frame.size());
				String example=driver.findElement(By.xpath(locators)).getText();
				System.out.println(example);}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//switch iFrame by 	WebElement by CssSelector
			public void switchTo_iFrameByCssSelector(String locators) {
				try {
				List<WebElement> se_frame=driver.findElements(By.xpath(locators));
				System.out.println(se_frame.size());
				String example=driver.findElement(By.xpath(locators)).getText();
				System.out.println(example);}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//switch  back to default  by index from iFrame
			public void switchBackFrom_iFrameByindex(int index) {
				try {
				driver.switchTo().frame(index);}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//switch  back to default  by default content from iFrame
			public void switchBackFrom_iFrameByParentframe() {
				try {
				driver.switchTo().parentFrame();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//switch  back to default  by default content from iFrame
			public void switchBackFrom_iFrameBydefaultcontent() {
				driver.switchTo().defaultContent();
			}
			//----------------------------------------------------------
			// --------Alert--------
			//accept alert By XPATH
			public void alert_acceptByxpath(String locators) {
				try {
			driver.findElement(By.xpath(locators)).click();

			Alert con=driver.switchTo().alert();
			Thread.sleep(2000);
			String text=driver.switchTo().alert().getText();
			System.out.println("Alert text is: " + text);
			con.accept();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//accept alert By CssSelector
			public void alert_acceptByCssSelector(String locators) {
				try {
			driver.findElement(By.cssSelector(locators)).click();

			Alert con=driver.switchTo().alert();
			Thread.sleep(2000);
			String text=driver.switchTo().alert().getText();
			System.out.println("Alert text is: "+ text);
			con.accept();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//dismiss alert By CssSelector
			public void alert_DismissByCssSelector(String locators) {
				try {
			driver.findElement(By.cssSelector(locators)).click();

			Alert con=driver.switchTo().alert();
			Thread.sleep(3000);
			con.dismiss();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//Dismiss alert By XPATH
			public void alert_DismissByxpath(String locators) {
				try {
			driver.findElement(By.xpath(locators)).click();

			Alert con=driver.switchTo().alert();
			Thread.sleep(2000);
			con.dismiss();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//send test data to alert By XPATH
			public void alert_sendkeysByxpath(String locators, String values) {
				try {
			driver.findElement(By.xpath(locators)).click();

			Alert con=driver.switchTo().alert();
			Thread.sleep(2000);
			String text=driver.switchTo().alert().getText();
			System.out.println("Alert text is: "+ text);
			con.sendKeys(values);
			con.accept();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//send test data to alert By CssSelector
			public void alert_sendkeysByCssSelector(String locators, String values) {
				try {
			driver.findElement(By.cssSelector(locators)).click();

			Alert con=driver.switchTo().alert();
			Thread.sleep(2000);
			String text=driver.switchTo().alert().getText();
			System.out.println("Alert text is: "+ text);
			con.sendKeys(values);
			con.accept();}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//------------------------------------------------------------------
			//--------Auto suggestion----------------
			//Auto suggestion click by XPATH
			//Firstly use text box field with test data 
			public void clickByXpath_autoSuggestion(String locators, String values) {
				try {
					//driver.findElement(By.xpath(locators)).sendKeys(values);
				List<WebElement> allOptions = driver.findElements(By.xpath(locators));
					System.out.println(allOptions.size());
					Thread.sleep(3000);
					
					for (int i = 0; i < allOptions.size(); i++) {
					String option = allOptions.get(i).getText();
					System.out.println(option);
					
					if(option.equalsIgnoreCase("printer")) {
				
					allOptions.get(i).click();
					//Thread.sleep(4000);
			}}}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//Auto suggestion click by CssSelector
			//Firstly use text box field with test data 
			public void clickByCssSelector_autoSuggestion(String locators, String values) {
				try {
					//driver.findElement(By.xpath(locators)).sendKeys(values);
				List<WebElement> allOptions = driver.findElements(By.cssSelector(locators));
					System.out.println(allOptions.size());
					Thread.sleep(3000);
					
					for (int i = 0; i < allOptions.size(); i++) {
					String option = allOptions.get(i).getText();
					System.out.println(option);
					
					if(option.equalsIgnoreCase("printer")) {
				
					allOptions.get(i).click();
					//Thread.sleep(4000);
			}}}
				catch(Exception e) {
					System.err.println("issue with " + e.getMessage());
				}
			}
			//-----------------------------------------------------------------
			//-----------handle windows/tabs----------------
			// handling window by XPATH
			// firstly write parent window URL than click on child window
				public void handleswindow_Byxpath(String locators) {
					try {
						//driver.get("https://accounts.google.com/ServiceLogin");
						
						driver.findElement(By.xpath(locators)).click();
						
							Thread.sleep(3000);
						
						Set<String>	s=driver.getWindowHandles();
						Iterator<String>i=s.iterator();
						String mainwind=i.next();
						
						String childwind=i.next();
						driver.switchTo().window(childwind);
						System.out.println(" tittle of child window is  : " + driver.getTitle());
						
						System.out.println("main window is : "+ mainwind + " child window is : "+ childwind);
						
						driver.switchTo().window(mainwind);
						System.out.println( "tittle of main window is : "+driver.getTitle());
						Thread.sleep(2000);
						
					}catch(Exception e) {
						System.err.println("issue with " + e.getMessage());
					}	
				}
				// handling window by CssSelector
				// firstly write parent window URL than click on child window
					public void handleswindow_ByCssSelector(String locators) {
						try {
							//driver.get("https://accounts.google.com/ServiceLogin");
							
							driver.findElement(By.cssSelector(locators)).click();
							
								Thread.sleep(3000);
							
							Set<String>	s=driver.getWindowHandles();
							Iterator<String>i=s.iterator();
							String mainwind=i.next();
							
							String childwind=i.next();
							driver.switchTo().window(childwind);
							System.out.println(" tittle of child window is  : " + driver.getTitle());
							
							System.out.println("main window is : "+ mainwind + " child window is : "+ childwind);
							
							driver.switchTo().window(mainwind);
							System.out.println( "tittle of main window is : "+driver.getTitle());
							Thread.sleep(2000);
							
						}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
					//--------------------------------------------------
			// ----------------link count -----------
			// link count by tag name
					public void linkCount_tagName(String locators) {
						try {
							//driver.get("https://accounts.google.com/ServiceLogin");
							 List<WebElement> links = driver.findElements(By.tagName(locators));
								System.out.println(links.size());
									// using for loop
								//for (int i = 1; i<=links.size(); i=i+1){
								//System.out.println(links.get(i).getText());
									
									// using enhanced for loop 
								for(WebElement x :links) {
									System.out.println(x.getText());
							
						}}catch(Exception e) {
							System.err.println("issue with " + e.getMessage());
						}	
					}
					// link count by XPATH
							public void linkCount_Xpath(String locators) {
								try {
									//driver.get("https://accounts.google.com/ServiceLogin");
									 List<WebElement> links = driver.findElements(By.xpath(locators));
										System.out.println(links.size());
											// using for loop
										//for (int i = 1; i<=links.size(); i=i+1){
										//System.out.println(links.get(i).getText());
											
											// using enhanced for loop 
										for(WebElement x :links) {
											System.out.println(x.getText());
									
								}}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}
				//---------------------------------------------------------------
				//-------------Table Handle---------------------
					//table handle by XPATH	with nested for loop		
							public void handleTableFirst_ByXpath(String locators, String locators2) {
								try {
					WebElement table=driver.findElement(By.xpath(locators));
									//Get all web elements by tag name 'tr'
						List<WebElement>row=table.findElements(By.tagName("tr"));
									//printing total row number
									System.out.println(row.size());

									// counting column

					List<WebElement>column=table.findElements(By.tagName("th"));

									//printing total column number
					System.out.println(column.size());
					WebDriverWait wait=new WebDriverWait(driver,30);
				//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators)));
					for(int i=1;i<row.size();i++) {
									for(int j=1;j<column.size();j++) {
						//System.out.println(driver.findElement(By.xpath("//div[@class='col-md-12 pt-3']/table/tbody/tr[+ i +]/td[+ j +]")).getText());
							//*[@id="mainForm"]/div[2]/div[2]/div/table/tbody/tr[5]/td[3]
					System.out.println(driver.findElement(By.xpath(locators2)).getText());
									
									}
								}
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}	
							//table handle by CssSelector with nested for loop 			
							public void handleTableFirst_CssSelector(String locators, String locators2) {
								try {
					WebElement table=driver.findElement(By.cssSelector(locators));
									//Get all web elements by tag name 'tr'
						List<WebElement>row=table.findElements(By.tagName("tr"));
									//printing total row number
									System.out.println(row.size());

									// counting column

					List<WebElement>column=table.findElements(By.tagName("th"));

									//printing total column number
					System.out.println(column.size());
					WebDriverWait wait=new WebDriverWait(driver,30);
	//				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locators)));
					for(int i=1;i<row.size();i++) {
									for(int j=1;j<column.size();j++) {
						//System.out.println(driver.findElement(By.xpath("//div[@class='col-md-12 pt-3']/table/tbody/tr[+ i +]/td[+ j +]")).getText());
							//*[@id="mainForm"]/div[2]/div[2]/div/table/tbody/tr[5]/td[3]
					System.out.println(driver.findElement(By.xpath(locators2)).getText());
									
									}
								}
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	}
				//table handle By XPATH	with enhanced for loop		
							public void handleTable_ByXpathForEnhanced(String locators) { 
								try {
						WebElement table=driver.findElement(By.xpath(locators));

									List<WebElement>row=table.findElements(By.tagName("tr"));
									//printing total row number
									System.out.println(row.size());

									//counting column

									List<WebElement>column=table.findElements(By.tagName("th"));
									//printing total column number
									System.out.println(column.size());

									List<WebElement>column_att=null;

									//Retrieve all column name 
										for(WebElement i :row){
											//System.out.print(i.getText()+ "-");
											System.out.println(" ");
											column_att=i.findElements(By.tagName("td"));
										//System.out.println();
										
										
										// reading all column attribute
							//List<WebElement>column_attribute=table.findElements(By.tagName("td"));
										for(WebElement k :column_att){
											System.out.print(k.getText()+"|");
											
										} System.out.println();
										}}catch(Exception e) {
										System.out.println(e);	
										}
									}
							//table handle By CssSelector	with enhanced for loop		
							public void handleTable_ByCssSelectorForEnhanced(String locators) { 
								try {
						WebElement table=driver.findElement(By.cssSelector(locators));

									List<WebElement>row=table.findElements(By.tagName("tr"));
									//printing total row number
									System.out.println(row.size());

									//counting column

									List<WebElement>column=table.findElements(By.tagName("th"));
									//printing total column number
									System.out.println(column.size());

									List<WebElement>column_att=null;

									//Retrieve all column name 
										for(WebElement i :row){
											//System.out.print(i.getText()+ "-");
											System.out.println(" ");
											column_att=i.findElements(By.tagName("td"));
										//System.out.println();
										
										
										// reading all column attribute
							//List<WebElement>column_attribute=table.findElements(By.tagName("td"));
										for(WebElement k :column_att){
											System.out.print(k.getText()+"|");
											
										} System.out.println();
										}}catch(Exception e) {
										System.out.println(e);	
										}
									}
				//-----------------------------------------------------------------------
				//------------Handle Drag and drop---------------------------
				// handle Drag And Drop by XPATH
							public void dragAndDropByXpath(String locators,String locators2) {
								try {
									// if its inside a frame  than switch to frame after use Actions class
					// WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
							//		driver.switchTo().frame(frame);				
				WebElement drag = driver.findElement(By.xpath(locators));
			  WebElement drop = driver.findElement(By.xpath(locators2));
									Actions actions = new Actions(driver);
									actions.dragAndDrop(drag, drop).build().perform();
									Thread.sleep(2000);
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}
							// handle Drag And Drop by XPATH
							public void dragAndDropBYCssSelector(String locators,String locators2) {
								try {
									// if its inside a frame  than switch to frame after use Actions class
					// WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
							//		driver.switchTo().frame(frame);				
				WebElement drag = driver.findElement(By.cssSelector(locators));
			  WebElement drop = driver.findElement(By.cssSelector(locators2));
									Actions actions = new Actions(driver);
									actions.dragAndDrop(drag, drop).build().perform();
									Thread.sleep(2000);
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}							
							// handle Drag And Drop by XPATH
							public void dragAndDropBYid(String locators,String locators2) {
								try {
									// if its inside a frame  than switch to frame after use Actions class
					// WebElement frame= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
							//		driver.switchTo().frame(frame);				
				WebElement drag = driver.findElement(By.id(locators));
			  WebElement drop = driver.findElement(By.id(locators2));
									Actions actions = new Actions(driver);
									actions.dragAndDrop(drag, drop).build().perform();
									Thread.sleep(2000);
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}
			//--------------------------------------
			// ------------click-----------				
			// right click By link text
						public void rightClick_BylinkText(String locators) {
								try {
									Actions action=new Actions(driver);
									WebElement rightclick=driver.findElement(By.linkText(locators));
									action.contextClick(rightclick).build().perform();
								}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}				
			// right click By XPATH
						public void rightClick_Byxpath(String locators) {
											try {
									Actions action=new Actions(driver);
									WebElement rightclick=driver.findElement(By.xpath(locators));
										action.contextClick(rightclick).build().perform();
									}catch(Exception e) {
												System.err.println("issue with " + e.getMessage());
											}	
										}
				//	right click By CssSelector	
						public void rightClick_ByCssSelector(String locators) {
							try {
					Actions action=new Actions(driver);
					WebElement rightclick=driver.findElement(By.cssSelector(locators));
						action.contextClick(rightclick).build().perform();
					}catch(Exception e) {
								System.err.println("issue with " + e.getMessage());
							}	
						}
			//--------------------------------------------------------------
			//-------------Double click-------------
			// double click by CssSelector			
						public void doubleClick_ByCssSelector(String locators) {
							try {
					Actions action=new Actions(driver);
					WebElement click=driver.findElement(By.cssSelector(locators));
						action.doubleClick(click).build().perform();
					}catch(Exception e) {
								System.err.println("issue with " + e.getMessage());
							}	
						}
			//double click by XPATH			
						public void doubleClick_BYxpath(String locators) {
							try {
					Actions action=new Actions(driver);
					WebElement click=driver.findElement(By.xpath(locators));
						action.doubleClick(click).build().perform();
					}catch(Exception e) {
								System.err.println("issue with " + e.getMessage());
							}	
						}
						//double click by link text			
						public void doubleClick_BylinkText(String locators) {
							try {
					Actions action=new Actions(driver);
					WebElement click=driver.findElement(By.linkText(locators));
						action.doubleClick(click).build().perform();
					}catch(Exception e) {
								System.err.println("issue with " + e.getMessage());
							}	}
					//-----------------------------
					//-----------MOVE TO ELEMENT-------------
							//Move to element  by link text	 with Actions class		
							public void moveToElement_BylinkText(String locators) {
								try {
						Actions action=new Actions(driver);
					    WebElement click=driver.findElement(By.linkText(locators));
							action.moveToElement(click).build().perform();
						}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}
							//Move to element By XPATH with Actions class		
							public void moveToElement_ByXPATH(String locators) {
								try {
						Actions action=new Actions(driver);
					    WebElement click=driver.findElement(By.xpath(locators));
							action.moveToElement(click).build().perform();
						}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
					}	
							//Move to element  by CssSeledtor	 with Actions class		
							public void moveToElement_ByXCssSELECTOR(String locators) {
								try {
						Actions action=new Actions(driver);
					    WebElement click=driver.findElement(By.cssSelector(locators));
							action.moveToElement(click).build().perform();
						}catch(Exception e) {
									System.err.println("issue with " + e.getMessage());
								}	
							}				
			}
						
												

				



					



