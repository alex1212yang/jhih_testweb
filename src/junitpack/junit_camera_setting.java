package junitpack;

import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class junit_camera_setting {

	@Test
	public void Camera_Setting() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:/Users/alexyang/Desktop/geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/Desktop/ChromeDriver.exe");
		
//		IE
		//WebDriver driverChrome= new InternetExplorerDriver();
		
//		Firefox change language			
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("intl.accept_languages", "en");
//		WebDriver driverChrome = new FirefoxDriver(profile);
		
//      	Chrome change language		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en");
		WebDriver driverChrome = new ChromeDriver(options);
		
		
//		FirefoxProfile profile= new FirefoxProfile();
//		profile.setPreference("plugin.default_plugin_disabled", false);
//		profile.setPreference("extensions.autoDisableScopes", 15);
//		profile.setPreference("extensions.enableScopes", 15);
//		profile.setPreference("plugin.state.java", 2);
//		WebDriver driverChrome = new FirefoxDriver(profile);
		
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/Desktop/ChromeDriver.exe");
		//WebDriver driverChrome = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		driverChrome.manage().window().maximize();
		/*
		driverChrome.navigate().to("https://alpha.kalay.us/");
//迴圈		for(int i = 0 ; i < 10; i++){
		driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
		
//Add Camera
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("input-email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("input-password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("input-password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/section/form/div[3]/span")).click();
		Thread.sleep(1000);
		*/
		driverChrome.navigate().to("https://k2-alpha.kalay.us/");

		// 迴圈 for(int i = 0 ; i < 10; i++){
		Thread.sleep(5000);
		driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("c24571111@gmail.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("Aa13243537");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(10000);
		
		//1.add camera
//		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).sendKeys("H8DDXGD2T936NK88111A");
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).sendKeys("888888ii");
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).sendKeys("auto_test");
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
//		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driverChrome.findElement(By.xpath("//*[@id='pickColorModal']/div/div/div[3]/div/div[2]/span")).click();
//		Thread.sleep(3000);
//		String Add_Camera = "auto_test";
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.1']")));
//		String element1 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.1']")).getText();
//	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    if(Add_Camera.equals(element1) == true){
//	    		System.out.println("1.Add_Camera = pass");
//	    }else{
//	    		System.out.println("1.Add_Camera = fail");	
//	    	 }

		/*
	    //Liveview icon
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
		Thread.sleep(1000);
		driverChrome.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.0']")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.1.1.0'")).click();
		//driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//1_1.Open molamola plugin
		Point coordinates = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.1'")).getLocation();
		Robot robot = new Robot();
		robot.mouseMove(coordinates.getX()+100,coordinates.getY()+70);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.0.0']")).click();
		Thread.sleep(1000);
		driverChrome.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.0']")).click();
		Thread.sleep(1000);
	    System.out.println("1_1.Open molamola plugin = Pass");
	    */
	    
	    //1_2.Liveview icon page success
	    //driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(15000);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$H8DDXGD2T936NK88111A.0.0']")).click();
	    Thread.sleep(5000);
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(5000);
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/span")).click();
	    Thread.sleep(5000);
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[3]")).click();
	    Thread.sleep(5000);
	    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div/span[2]")).click();
	    Thread.sleep(5000);
	    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div/span[1]")).click();
	    Thread.sleep(1000);
	    driverChrome.findElement(By.cssSelector("span.-text-top")).click();
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div/h2/span")).click();
	    Thread.sleep(1000);
	    System.out.println("1_2.Liveview icon page success = Pass");
	    
	    
	  //2.Back to Live view page
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("2.Back to Live view page = Pass");
	   /* 
	  //4.Change password
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).sendKeys("888888II");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).sendKeys("888888II");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div[2]/div/div[4]/div/div")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/div/div/div")).click();
	    System.out.println("4.Change password = Pass");
	    */
	  //5.Change password: blank
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).clear();
	    //driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driverChrome.findElement(By.id("input-undefined")).sendKeys("888888II");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).sendKeys("888888II");
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    Thread.sleep(1000);
  		//String Change_password_blank = "請輸入您的密碼";
  		String Change_password_blank = "Please enter your password.";
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.1.0.1']")));
  		String element5 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.1.0.1']")).getText();
  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	    if(Change_password_blank.equals(element5) == true){
  	    		System.out.println("5.Change password: blank = pass");
  	    }else{
  	    		System.out.println("5.Change password: blank = fail");	
  	    	 }
  	    driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
  	    
  	//6.Change Confirm Password: blank
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).sendKeys("888888II");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    //driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).sendKeys("888888II");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    Thread.sleep(1000);
  		//String Change_Confirm_Password_blank = "密碼與確認密碼不一致";
  		String Change_Confirm_Password_blank = "Password and Confirm Password do not match.";
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.1.0.1']")));
  		String element6 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.1.0.1']")).getText();
  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	    if(Change_Confirm_Password_blank.equals(element6) == true){
  	    		System.out.println("6.Change Confirm Password: blank = pass");
  	    }else{
  	    		System.out.println("6.Change Confirm Password: blank = fail");	
  	    	 }
  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
  	  
  	//7.Change different Confirm Password: fail
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).sendKeys("888888II");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).sendKeys("888888ii");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    Thread.sleep(1000);
  		//String Change_Confirm_Password_fail = "密碼與確認密碼不一致";
  		String Change_Confirm_Password_fail = "Password and Confirm Password do not match.";
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.1.0.1']")));
  		String element7 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.1.0.1']")).getText();
  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	    if(Change_Confirm_Password_fail.equals(element7) == true){
  	    		System.out.println("7.Change different Confirm Password: fail = pass");
  	    }else{
  	    		System.out.println("7.Change different Confirm Password: fail = fail");	
  	    	 }
  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
  	  
  	//8.Keyin new password 1~7
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).sendKeys("1234567");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).sendKeys("1234567");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    Thread.sleep(1000);
  		//String Keyin_new_password_1_7 = "請使用8到20個字元之間的字母和數字組合來建立密碼";
  		String Keyin_new_password_1_7 = "Please make sure your password contains only letters and numbers and is between 8 and 20 characters long.";
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.0.0.1']")));
  		String element8 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.0.0.1']")).getText();
  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	    if(Keyin_new_password_1_7.equals(element8) == true){
  	    		System.out.println("8.Keyin new password 1~7 = pass");
  	    }else{
  	    		System.out.println("8.Keyin new password 1~7 = fail");	
  	    	 }
  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
  	  
  	//9.Keyin new password 1~8
	    Thread.sleep(1000);
	    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.cssSelector("div.device-container")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='root']/div/div[2]/div[1]/div/span[4]")).click();
	    Thread.sleep(10000); 
	    driverChrome.findElement(By.xpath("//div[@id='bind-camera-dialog']/div/div/div[2]/div/span/div/div/div/span[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.id("input-undefined")).sendKeys("1234567");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).click();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).clear();
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.xpath("(//input[@id='input-undefined'])[2]")).sendKeys("1234567");
	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.0.1.0.3.0.0']")).click();
	    Thread.sleep(1000);
  		//String Keyin_new_password_1_8 = "請使用8到20個字元之間的字母和數字組合來建立密碼";
  		String Keyin_new_password_1_8 = "Please make sure your password contains only letters and numbers and is between 8 and 20 characters long.";
  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.0.0.1']")));
  		String element9 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.1.0.1.0.0.1.0.0.0.1']")).getText();
  	    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	    if(Keyin_new_password_1_8.equals(element9) == true){
  	    		System.out.println("9.Keyin new password 1~8 = pass");
  	    }else{
  	    		System.out.println("9.Keyin new password 1~8 = fail");	
  	    	 }
  	  driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.0']")).click();
  	driverChrome.close();     
  	driverChrome.quit(); 
	}
}    
