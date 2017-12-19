package junitpack;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class junit_webpage_response_time {

	int		i, count;
	String	strChromeDriver = "C:/Users/alexyang/Desktop/driver/ChromeDriver.exe", 
			strTargetURL = "https://wr-qa-vsaas.kalay.us";
	String	xpathLoginOnWelcom = "//*[@id=\"root\"]/div/section/form/div[3]/span", 
			xpathIconOnWelcome = "//*[@id=\"root\"]/div/section/form/div[2]/div[1]/div[1]", 
			xpathEmailOnOAuth = "//*[@id=\"id_email\"]", 
			xpathLoginOnOAuth = "//*[@id='submit']", 
			xpathPlanMgmt = "//*[@id=\"header\"]/div/ul/li[1]/span/span[2]", 
			xpathPlanAdd = "//*[@id=\"add_card_box\"]/a", 
			xpathUserInfo = "//*[@id=\"header\"]/div/ul/li[2]/span/span[2]", 
			xpathViewInvoice = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[1]/small/a", 
			xpathBuyInfo = "//*[@id=\"root\"]/div/div[2]/div[1]/h2/span", 
			xpathBack = "//*[@id=\"root\"]/div/div[2]/div[1]/h2/span[1]", 
			xpathLogout = "//*[@id=\"root\"]/div/div[2]/div[2]/ul/li[2]/small/a";
	long	t1,		// Start of test 
			t2, 	// time of clicking login button on Welcome Page
			t3, 	// time of finding email field on OAuth login Page
			t4, 	// Device List Page
			t5, 	// Plan Mgmt. Page
			t6,		// Add New Plan Page
			t7, 	// back from Checkout Page
			t8, 
			t9, 
			t10, 
			t11;
	
	@Test
	public void start() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:/Users/alexyang/Desktop/geckodriver.exe");
//		System.setProperty("webdriver.ie.driver", "D:/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", strChromeDriver);
		
//		IE
//		WebDriver driverChrome= new InternetExplorerDriver();
			
//		Firefox change language
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("intl.accept_languages", "en");
//		WebDriver driverChrome = new FirefoxDriver(profile);
		
		// Chrome change language		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en");
		WebDriver driverChrome = new ChromeDriver(options);
		
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driverChrome.manage().window().maximize();
		
		// navigate to Welcome page
		t1 = System.currentTimeMillis();
System.out.println("t1=" + t1);
		driverChrome.navigate().to(strTargetURL);

		{
			WebElement	weWelcome, 
						weEmail, 
						weOAuthLogin, 
						wePlanMgmt, 
						weAddPlan, 
						weChooseMonthlyPlan, 
						weBack;
			
			for (i = 0; i < 50; i++) {
				weWelcome = driverChrome.findElement(By.xpath(xpathLoginOnWelcom));
				t2 = System.currentTimeMillis();
				if (weWelcome instanceof WebElement) {
					try {
						weWelcome.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t2=" + t2);
			
//*[@id="root"]/div/div[2]/span

			// wait for 'Login' button on OAuth page
			for (i = 0; i < 50; i++) {
				weEmail = driverChrome.findElement(By.xpath(xpathEmailOnOAuth));
				t3 = System.currentTimeMillis();
				if (weEmail instanceof WebElement) {
					try {
						weEmail.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t3=" + t3);
		
			// input 'Email', 'Password', and click 'Login' button
			driverChrome.findElement(By.id("id_email")).sendKeys("tely_chiang@tutk.com");
			//driverChrome.findElement(By.id("id_password")).clear();
			driverChrome.findElement(By.id("id_password")).sendKeys("Tutkwelcomeqa1");
			weOAuthLogin = driverChrome.findElement(By.xpath(xpathLoginOnOAuth));
			weOAuthLogin.click();
			
			// wait for 'Plan Mgmt.' can be clicked
			for (i = 0; i < 50; i++) {		// wait maximum time is 10,000 milliseconds
				wePlanMgmt = driverChrome.findElement(By.xpath(xpathPlanMgmt));
				t4 = System.currentTimeMillis();
				if (wePlanMgmt instanceof WebElement) {
					try {
						wePlanMgmt.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t4=" + t4);

			// wait 'Add Plan' element
			for (i = 0; i < 50; i++) {		// wait maximum time is 10,000 milliseconds
				weAddPlan = driverChrome.findElement(By.xpath(xpathPlanAdd));
				t5 = System.currentTimeMillis();
				if (weAddPlan instanceof WebElement) {
					try {
						weAddPlan.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t5=" + t5);

			// wait 'Plan List' element
			for (i = 0; i < 50; i++) {		// wait maximum time is 10,000 milliseconds
				weChooseMonthlyPlan = driverChrome.findElement(By.xpath("//*[@id=\"card_list\"]/li[4]/div/ul/li/a/div/span[2]"));
				t6 = System.currentTimeMillis();
				if (weChooseMonthlyPlan instanceof WebElement) {
					try {
						weChooseMonthlyPlan.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t6=" + t6);

			// wait 'BACK' button on Checkout Page
			for (i = 0; i < 50; i++) {		// wait maximum time is 10,000 milliseconds
				weBack = driverChrome.findElement(By.xpath(xpathBack));
				t7 = System.currentTimeMillis();
				if (weBack instanceof WebElement) {
					try {
						weBack.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t7=" + t7);
		}
		
		// time calculation of 'View Buy Invoice Info.' function
		{
			WebElement	weUserInfo, 
						weViewInvoice, 
						weLogout, 
						weIconOnWelcome;

			for (i = 0; i < 50; i++) {
				weUserInfo = driverChrome.findElement(By.xpath(xpathUserInfo));
				if (weUserInfo instanceof WebElement) {
					try {
						weUserInfo.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
			
			for (i = 0; i < 50; i++) {
				weViewInvoice = driverChrome.findElement(By.xpath(xpathViewInvoice));
				t8 = System.currentTimeMillis();
				if (weViewInvoice instanceof WebElement) {
					try {
						weViewInvoice.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t8=" + t8);
			
			for (i = 0; i < 50; i++) {
				weUserInfo = driverChrome.findElement(By.xpath(xpathUserInfo));
				t9 = System.currentTimeMillis();
				if (weUserInfo instanceof WebElement) {
					try {
						weUserInfo.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t9=" + t9);
		
			// time calculation of logout function
			for (i = 0; i < 50; i++) {
				weUserInfo = driverChrome.findElement(By.xpath(xpathUserInfo));
				if (weUserInfo instanceof WebElement) {
					try {
						weUserInfo.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
			
			for (i = 0; i < 50; i++) {
				weLogout = driverChrome.findElement(By.xpath(xpathLogout));
				t10 = System.currentTimeMillis();
				if (weLogout instanceof WebElement) {
					try {
						weLogout.click();
						break;
					} catch (Exception ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t10=" + t10);
			
			for (i = 0; i < 50; i++) {
				weIconOnWelcome = driverChrome.findElement(By.xpath(xpathIconOnWelcome));
				t11 = System.currentTimeMillis();
				if (weIconOnWelcome instanceof WebElement) {
					try {
						weIconOnWelcome.click();
						break;
					} catch (Exception 	ignored) {
						;
					}
				}
				Thread.sleep(200);
			}
System.out.println("t11=" + t11);
		}
		
System.out.println("[" + count + "]===== Welcome Page: [" + (t2 - t1) + "]=====");
System.out.println("[" + count + "]===== OAuth Login Page: [" + (t3 - t2) + "]=====");
System.out.println("[" + count + "]===== Login completed: [" + (t4 - t3) + "]=====");
System.out.println("[" + count + "]===== Plan Mgmt.: [" + (t5 - t4) + "]=====");
System.out.println("[" + count + "]===== Add Plan: [" + (t6 - t5) + "]=====");
System.out.println("[" + count + "]===== Checkout Yearly Plan: [" + (t7 - t6) + "]=====");
System.out.println("[" + count + "]===== View Invoice: [" + (t9 - t8) + "]=====");
System.out.println("[" + count + "]===== Logout: [" + (t11 - t10) + "]=====");

		// end of test
		driverChrome.close();  
	    driverChrome.quit();
	}
}