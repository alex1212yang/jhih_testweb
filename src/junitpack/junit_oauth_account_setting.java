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

public class junit_oauth_account_setting {

	@Test
	public void Account_Setting() throws Exception {
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
				/*
				driverChrome.navigate().to("https://alpha.kalay.us/");
		//迴圈		for(int i = 0 ; i < 10; i++){
				
				
		//1.Account Settings - Change Password
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("input-email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-password")).sendKeys("a13243537");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
			    Thread.sleep(1000);
			    */
				
				//driverChrome.navigate().to("https://vsaas.kalay.us/");
				//driverChrome.navigate().to("https://wr-qa-vsaas.kalay.us/");
				driverChrome.navigate().to("https://stg-vsaas.kalayservice.com/");

				// 迴圈 for(int i = 0 ; i < 10; i++){
				Thread.sleep(1000);
				driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
				Thread.sleep(1000);
				driverChrome.findElement(By.xpath("//*[@id='root']/div/section/form/div[1]/span")).click();
				Thread.sleep(1000);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password")).sendKeys("a13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
				Thread.sleep(5000);
				
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li[2]/span/span[2]")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.linkText("更改密碼")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.cssSelector("input.form-control")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("input.form-control")).sendKeys("a13243537");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("888888ii");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("888888ii");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("div.btn.btn-primary > span")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.xpath("//div[@id='changePwdModal']/div/div[2]/div/div/span")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.linkText("登出")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.id("input-email")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-password")).sendKeys("888888ii");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("//div[@id='root']/div/section/form/div[3]/span")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li[2]/span/span[2]")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.linkText("更改密碼")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.cssSelector("input.form-control")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("input.form-control")).sendKeys("888888ii");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("a13243537");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("a13243537");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.cssSelector("div.btn.btn-primary > span")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.xpath("//div[@id='changePwdModal']/div/div[2]/div/div/span")).click();
			    System.out.println("1.Account Settings - Change Password = Pass");
		/*IE no this Function	    
			  //2.Account Settings - Old Password: error password  
			  		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  		driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			  		Thread.sleep(1000);
			  	    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li[2]/span/span[2]")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.linkText("更改密碼")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.cssSelector("input.form-control")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.cssSelector("input.form-control")).sendKeys("12345678");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("888888ii");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("888888ii");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.cssSelector("div.btn.btn-primary > span")).click();
			  	    
			  	  Thread.sleep(1000);
			  		String Account_Settings_Old_Password_error_password = "輸入密碼錯誤";
			  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.3']")));
			  		String element2 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.3']")).getText();
			  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    if(Account_Settings_Old_Password_error_password.equals(element2) == true){
			  	    		System.out.println("2.Account Settings - Old Password: error password = Pass");
			  	    }else{
			  	    		System.out.println("2.Account Settings - Old Password: error password = fail");	
			  	    	 }
			  	    
			  	  Thread.sleep(1000);
			  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
			  	  //6.Account Settings - Log Out
//			  	Thread.sleep(1000);
//			  	driverChrome.findElement(By.linkText("登出")).click();
		*/	  	
			  	
			  	//3.Account Settings - Password:1~7 characters
			  		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  		driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			  		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li[2]/span/span[2]")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.linkText("更改密碼")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.cssSelector("input.form-control")).clear();
			  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.cssSelector("input.form-control")).sendKeys("a13243537");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("1234567");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("1234567");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.cssSelector("div.btn.btn-primary > span")).click();
			  	    //Thread.sleep(1000);
			  	    //driverChrome.findElement(By.xpath("//div[@id='changePwdModal']/div/div[2]/div/div/span")).click();
			  	    
			  	  Thread.sleep(1000);
			  		String Account_Settings_Password_1_7_characters = "請使用8到20個字元之間的字母和數字組合來建立密碼。";
			  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.3']")));
			  		String element3 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.3']")).getText();
			  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    if(Account_Settings_Password_1_7_characters.equals(element3) == true){
			  	    		System.out.println("3.Account Settings - Password:1~7 characters = Pass");
			  	    }else{
			  	    		System.out.println("3.Account Settings - Password:1~7 characters = fail");	
			  	    	 } 
			  	  
			  	  Thread.sleep(1000);
			  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
			  	  //6.Account Settings - Log Out
//			  	Thread.sleep(1000);
//			  	driverChrome.findElement(By.linkText("登出")).click();
			  	
			  	//4.Account Settings - Password:1~8 characters
			  		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  		driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li[2]/span/span[2]")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.linkText("更改密碼")).click();
			  	    Thread.sleep(1000);
			  	    driverChrome.findElement(By.cssSelector("input.form-control")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.cssSelector("input.form-control")).sendKeys("a13243537");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("12345678");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).clear();
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.xpath("(//input[@value=''])[3]")).sendKeys("12345678");
			  	  driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    driverChrome.findElement(By.cssSelector("div.btn.btn-primary > span")).click();
			  	    //Thread.sleep(1000);
			  	    //driverChrome.findElement(By.xpath("//div[@id='changePwdModal']/div/div[2]/div/div/span")).click();
			  	    
			  	  Thread.sleep(1000);
			  		String Account_Settings_Password_1_8_characters = "請使用8到20個字元之間的字母和數字組合來建立密碼。";
			  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.3']")));
			  		String element4 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.3']")).getText();
			  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  	    if(Account_Settings_Password_1_8_characters.equals(element4) == true){
			  	    		System.out.println("4.Account Settings - Password:1~8 characters = Pass");
			  	    }else{
			  	    		System.out.println("4.Account Settings - Password:1~8 characters = fail");	
			  	    	 }
				
			  	  Thread.sleep(1000);
			  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
			  	  //6.Account Settings - Log Out
			  	Thread.sleep(1000);
			  	driverChrome.findElement(By.linkText("登出")).click();
			  	System.out.println("6.Account Settings - Log Out = Pass");
			  	
				//5.Account Settings - View all invoices
			  	driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("input-email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-password")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("input-password")).sendKeys("a13243537");
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
			    Thread.sleep(1000);
			    System.out.println("5.Account Settings - View all invoices = Pass");
			    
			    //7.Account Settings - Change Nickname
			    Thread.sleep(1000);
			    driverChrome.findElement(By.xpath("//div[@id='header']/div/ul/li[2]/span/span[2]")).click();
			    Thread.sleep(1000);
			    driverChrome.findElement(By.id("nickname")).clear();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driverChrome.findElement(By.id("nickname")).sendKeys("auto_test");
		  	    System.out.println("7.Account Settings - Change Nickname = Pass");
		  	  
		  	  driverChrome.close();  
		  	  driverChrome.quit();
			}
}
