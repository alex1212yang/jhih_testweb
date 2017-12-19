package junitpack;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class junit_purchase_plan {

	@Test
	public void Purchase_Plan() throws Exception {
				//System.setProperty("webdriver.gecko.driver", "C:/Users/alexyang/Desktop/driver/geckodriver.exe");
				//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/driver/IEDriverServer.exe");
				System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/Desktop/driver/ChromeDriver.exe");
		
//		IE
		//WebDriver driverChrome= new InternetExplorerDriver();
			
//		Firefox change language			
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("intl.accept_languages", "en");
//		WebDriver driverChrome = new FirefoxDriver(profile);
		
//      Chrome change language		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en");
		WebDriver driverChrome = new ChromeDriver(options);
				
		//profile
//				FirefoxProfile profile= new FirefoxProfile();
//				profile.setPreference("plugin.default_plugin_disabled", false);
//				profile.setPreference("extensions.autoDisableScopes", 15);
//				profile.setPreference("extensions.enableScopes", 15);
//				profile.setPreference("plugin.state.java", 2);
//				WebDriver driverChrome = new FirefoxDriver(profile);
				
				//System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/Desktop/ChromeDriver.exe");
				//WebDriver driverChrome = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driverChrome, 10);
				driverChrome.manage().window().maximize();
				driverChrome.navigate().to("https://vsaas.kalay.us/");
		//°j°é		for(int i = 0 ; i < 10; i++){
				Thread.sleep(5000);
				driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).click();
				Thread.sleep(5000);
		//login-Add Camera
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("c24571111@gmail.com");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password")).sendKeys("Alex2457");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
				Thread.sleep(10000);
//				driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).sendKeys("H8DDXGD2T936NK88111A");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).sendKeys("888888ii");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).sendKeys("auto_test");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='pickColorModal']/div/div/div[3]/div/div[2]/span")).click();
//				Thread.sleep(3000);
//				String Add_Camera = "auto_test";
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.1']")));
//				String element1 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.1']")).getText();
//			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			    if(Add_Camera.equals(element1) == true){
//			    		System.out.println("Add_Camera = pass");
//			    }else{
//			    		System.out.println("Add_Camera = fail");	
//			    	 }		
		//1.Monthy - Event 7day
				driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
				driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
				driverChrome.findElement(By.xpath("//*[@id='card_list']/li[1]/div/ul/li/a")).click();
				driverChrome.findElement(By.id("checkoutBtn")).click();
				Thread.sleep(15000);
				driverChrome.switchTo().defaultContent();
				
//				for IE disable
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
				
//				For Chrome and Firefox open
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
				
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_email")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_email")).sendKeys("demo-buyer-4@tutk.com");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1.Monthy - Event 7day = pass");
		//1_1.Monthy - Event 30day
			    Thread.sleep(30000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[2]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(15000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_1.Monthy - Event 30day = pass");
		//1_2.Monthy - Fulltime 7day
			    Thread.sleep(30000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[3]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(5000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_2.Monthy - Fulltime 7day = pass");
		//1_3.Monthy - Fulltime 30day
			    Thread.sleep(30000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[4]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(5000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_3.Monthy - Fulltime 30day = pass");
		//1_4.Yearly - Event 7day
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[1]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(5000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_4.Yearly - Event 7day = pass");
		//1_5.Yearly - Event 30day
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[2]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(5000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_5.Events 5000 times = pass");
		//1_6.Yearly - Fulltime 7day
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[3]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(5000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_6.Yearly - Fulltime 7day = pass");
		//1_7.Yearly - Fulltime 30day
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[4]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("checkoutBtn")).click();
			    Thread.sleep(5000);
				driverChrome.switchTo().defaultContent();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='loadLogin']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("login_password")).sendKeys("demo1234");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("submitLogin")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("continue")).click();
			    System.out.println("1_7.Yearly - Fulltime 30day = pass"); 
			    
		//2.Back to plan management page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    System.out.println("2.Back to plan management page = pass");
		//3.Monthy - Event 7day-Back to choose plan page
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[1]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3.Monthy - Event 7day-Back to choose plan page = pass");
		//3_1.Monthy - Event 30day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[2]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_1.Monthy - Event 30day-Back to choose plan page = pass");
		//3_2.Monthy - Fulltime 7day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[3]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_2.Monthy - Fulltime 7day-Back to choose plan page = pass");   
		//3_3.Monthy - Fulltime 30day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[4]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_3.Monthy - Fulltime 30day-Back to choose plan page = pass");   
		//3_4.Yearly - Event 7day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[1]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_4.Yearly - Event 7day-Back to choose plan page = pass");   
		//3_5.Yearly - Event 30day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[2]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_5.Yearly - Event 30day-Back to choose plan page = pass");   
		//3_6.Yearly - fulltime 7day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[3]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_6.Yearly - fulltime 7day-Back to choose plan page = pass"); 	    
		//3_7.Yearly - fulltime 30day-Back to choose plan page
			    Thread.sleep(5000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.add_card_icon")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/span")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//*[@id='card_list']/li[4]/div/ul/li/a")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    System.out.println("3_7.Yearly - fulltime 30day-Back to choose plan page = pass");     
			    
			    
		//4.Binding a camera on plan
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//li[@id='plan_box']/a[2]/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("img-H8DDXGD2T936NK88111A")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.blockBtn2.bindingBtn")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='success-dialog']/div/div/div[2]/div/div/div")).click();
			    Thread.sleep(3000);
			    System.out.println("4.Binding a camera on plan = pass");  
		//8.Cancel Remove Binding camera	    
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("span.close_s")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("unbindingCheck")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='unbind-camera-dialog']/div/div/div[2]/div/div")).click();
			    System.out.println("8.Cancel Remove Binding camera = pass");
		//7.Remove Binding camera
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("span.close_s")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("unbindingCheck")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='unbind-camera-dialog']/div/div/div[2]/div/div[2]")).click();
			    System.out.println("7.Remove Binding camera = pass"); 
		//5.Binding a camera on plan-back button1
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//li[@id='plan_box']/a[2]/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/span")).click();
			    System.out.println("5.Binding a camera on plan-back button1 = pass"); 
		//6.Binding a camera on plan-back button2
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//li[@id='plan_box']/a[2]/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("img-H8DDXGD2T936NK88111A")).click();
			    Thread.sleep(3000);
			    //driverChrome.findElement(By.linkText("ªð¦^")).click();
			    //driverChrome.findElement(By.linkText("Back")).click();
			    driverChrome.findElement(By.xpath("//*[@id='bind-camera-dialog']/div/div/div[2]/div/div/div[1]/a")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/span")).click();
			    Thread.sleep(3000);
			    System.out.println("6.Binding a camera on plan-back button2 = pass");   
			    
			  //Binding a camera on plan
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//li[@id='plan_box']/a[2]/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("img-H8DDXGD2T936NK88111A")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("div.blockBtn2.bindingBtn")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='success-dialog']/div/div/div[2]/div/div/div")).click();
			    Thread.sleep(3000);
		//9.Remove Plan with camera
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li/span/span[2]")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.cssSelector("a.remove-plan > div")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("terminationCheck")).click();
			    Thread.sleep(3000);
			    driverChrome.findElement(By.id("btn-delete-event")).click(); 
			    System.out.println("9.Remove Plan with camera = pass");   

			    driverChrome.close();  
			    driverChrome.quit();
		  		
			}
		}    
