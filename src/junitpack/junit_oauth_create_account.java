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

public class junit_oauth_create_account {

	@Test
	public void Create_account() throws Exception {
				//System.setProperty("webdriver.gecko.driver", "C:/Users/alexyang/Desktop/driver/geckodriver.exe");
				//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/driver/IEDriverServer.exe");
				System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/Desktop/driver/ChromeDriver.exe");
				
//  			IE
				//WebDriver driverChrome= new InternetExplorerDriver();
				
//				Firefox change language			
//				FirefoxProfile profile = new FirefoxProfile();
//				profile.setPreference("intl.accept_languages", "en");
//				WebDriver driverChrome = new FirefoxDriver(profile);
				
//		      	Chrome change language		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--lang=en");
				WebDriver driverChrome = new ChromeDriver(options);
				
				WebDriverWait wait = new WebDriverWait(driverChrome, 10);
				driverChrome.manage().window().maximize();
				//driverChrome.navigate().to("https://vsaas.kalay.us/");
				//driverChrome.navigate().to("https://wr-qa-vsaas.kalay.us/");
				driverChrome.navigate().to("https://wr-qa-vsaas.kalay.us/");

				// 迴圈 for(int i = 0 ; i < 10; i++){
				Thread.sleep(5000);
				driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).click();
				Thread.sleep(5000);
		//Create_account-Email address:blank
				driverChrome.findElement(By.linkText("Sign Up")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				
				String Email_address_blank = "Please enter your email";
			    //String Email_address_blank = "請輸入您的電子郵件";
			    //  try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element1 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Email_address_blank.equals(element1) == true){
			    		System.out.println("1.Create_account-Email address:blank = pass");
			    }else{
			    		System.out.println("1.Create_account-Email address:blank = fail");	
			    	 }
			    
			    
		//Create_account-Enter incorrect email	    
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("a@a");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String Enter_incorrect_email = "The email is not valid";
			    //String Enter_incorrect_email = "電子郵件格式錯誤";
			    //  try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element2 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Enter_incorrect_email.equals(element2) == true){
			    		System.out.println("2.Create_account-Enter incorrect email = pass");
			    }else{
			    		System.out.println("2.Create_account-Enter incorrect email = fail");	
			    	 }
			     
		//Create_account-Enter Password : blank
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String Enter_Password_blank = "Please enter your password";
			    //String Enter_Password_blank = "請輸入您的密碼";
			    //  try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password1-help']/ul/li")));
			  //*[@id="password1-help"]/ul/li
			    // }catch (Exception e){;}
			    String element3 = driverChrome.findElement(By.xpath("//*[@id='password1-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Enter_Password_blank.equals(element3) == true){
			    		System.out.println("3.Create_account-Enter Password:blank = pass");
			    }else{
			    		System.out.println("3.Create_account-Enter Password:blank = fail");	
			    	 } 
			    
		//Create_account-Password: keyin over 20 characters	    
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("a@a");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("Aa1111111111111111111");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("Aa1111111111111111111");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String keyin_over_20_characters = "Please make sure your password contains 8 to 20 characters, at least 1 uppercase letter, 1 lowercase letter, and 1 number.";
			    //String keyin_over_20_characters = "請使用8到20個字元之間的字母和數字組合來建立密碼";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password1-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element4 = driverChrome.findElement(By.xpath("//*[@id='password1-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(keyin_over_20_characters.equals(element4) == true){
			    		System.out.println("4.Create_account-Password: keyin over 20 characters = pass");
			    }else{
			    		System.out.println("4.Create_account-Password: keyin over 20 characters = fail");	
			    	 }
			    
			    
		//Create_account-Password: keyin 1~8 number   
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("a@a");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("12345678");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("12345678");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String keyin_1to8_number = "Please make sure your password contains 8 to 20 characters, at least 1 uppercase letter, 1 lowercase letter, and 1 number.";
			    //String keyin_1to8_number = "請使用8到20個字元之間的字母和數字組合來建立密碼";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password1-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element5 = driverChrome.findElement(By.xpath("//*[@id='password1-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(keyin_1to8_number.equals(element5) == true){
			    		System.out.println("5.Create_account-Password: keyin 1~8 number = pass");
			    }else{
			    		System.out.println("5.Create_account-Password: keyin 1~8 number = fail");	
			    	 }	    
			    
		//Create_account-Password: keyin 1~7 characters   
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("a@a");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("1234567");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("1234567");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String keyin_1to7_characters = "Please make sure your password contains 8 to 20 characters, at least 1 uppercase letter, 1 lowercase letter, and 1 number.";
			    //String keyin_1to8_number = "請使用8到20個字元之間的字母和數字組合來建立密碼";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password1-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element6 = driverChrome.findElement(By.xpath("//*[@id='password1-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(keyin_1to7_characters.equals(element6) == true){
			    		System.out.println("6.Create_account-Password: keyin 1~7 characters = pass");
			    }else{
			    		System.out.println("6.Create_account-Password: keyin 1~7 characters = fail");	
			    	 }

//		//Create_account-Enter Captcha verification code : blank
//			    driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
//			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='root']/div/section/div[1]/span[2]")).click();
//			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			    driverChrome.findElement(By.id("input-email")).clear();
//			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.id("input-password")).sendKeys("888888ii");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.id("input-cfm-password")).sendKeys("888888ii");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.id("input-nickname")).sendKeys("alex");
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/form/div[6]/span")).click();
//			    String Enter_Captcha_verification_code_blank = "請填入驗證碼";
//			    //try{
//			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4.0.1']")));
//			    // }catch (Exception e){;}
//			    String element7 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.4.0.1']")).getText();
//			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			    if(Enter_Captcha_verification_code_blank.equals(element7) == true){
//			    		System.out.println("7.Create_account-Enter Captcha verification code : blank  = pass");
//			    }else{
//			    		System.out.println("7.Create_account-Enter Captcha verification code : blank  = fail");	
//			    	 }
			    
		//Create_account-Uncheck "Yes, I agree to the terms of use"
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String Uncheck_Yes_I_agree_to_the_terms_of_use= "Please check 'I agree to the Terms of Use' to sign up";
			    //String Uncheck_Yes_I_agree_to_the_terms_of_use= "請閱讀並同意註冊條款";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='agree-cb-help']")));
			    // }catch (Exception e){;}
			    String element9 = driverChrome.findElement(By.xpath("//*[@id='agree-cb-help']")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Uncheck_Yes_I_agree_to_the_terms_of_use.equals(element9) == true){
			    		System.out.println("9.Create_account-Uncheck \"Yes, I agree to the terms of use\" = pass");
			    }else{
			    		System.out.println("9.Create_account-Uncheck \"Yes, I agree to the terms of use\" = fail");	
			    	 }
			    
		//Create_account-Enter nickname : blank
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String Enter_nickname_blank = "Please enter your name";
			    //String Enter_nickname_blank = "請輸入您的暱稱";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element10 = driverChrome.findElement(By.xpath("//*[@id='username-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Enter_nickname_blank.equals(element10) == true){
			    		System.out.println("10.Create_account-Enter nickname : blank = pass");
			    }else{
			    		System.out.println("10.Create_account-Enter nickname : blank = fail");	
			    	 }	
			   
//			  //Create_account-Enter nickname over 128 characters
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
			    String Enter_nickname_over_128_characters = "Please make sure your name within 128 characters";
			    //String Enter_nickname_over_128_characters = "暱稱長度不能超過10個字元";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element11 = driverChrome.findElement(By.xpath("//*[@id='username-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Enter_nickname_over_128_characters.equals(element11) == true){
			    		System.out.println("11.Create_account-Enter nickname over 128 characters = pass");
			    }else{
			    		System.out.println("11.Create_account-Enter nickname over 128 characters = fail");	
			    	 }
			    
			    
			  //Create_account-Enter error cfm password  
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
//				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String Enter_error_cfm_password = "Password and Confirm Password do not match";
			    //String Enter_error_cfm_password = "密碼與確認密碼不一致";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password2-help']/ul/li")));
			    // }catch (Exception e){;}
			    String element17 = driverChrome.findElement(By.xpath("//*[@id='password2-help']/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Enter_error_cfm_password.equals(element17) == true){
			    		System.out.println("17.Create_account-Enter error cfm password = pass");
			    }else{
			    		System.out.println("17.Create_account-Enter error cfm password = fail");	
			    	 }
			    
//			  //Create_account-Enter Error Captcha verification email  
//			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password1")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_password2")).sendKeys("Aa13243537");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).clear();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("id_username")).sendKeys("alex_test");
				driverChrome.findElement(By.id("agree-cb")).click();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.id("submit")).click();
				String Enter_Error_Captcha_verification_email = "The account has already existed";
			    //String Enter_Error_Captcha_verification_email = "驗證碼錯誤,請再試一次";
			    //try{
			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signup-form']/div[1]/ul/li")));
			    // }catch (Exception e){;}
			    String element22 = driverChrome.findElement(By.xpath("//*[@id='signup-form']/div[1]/ul/li")).getText();
			    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if(Enter_Error_Captcha_verification_email.equals(element22) == true){
			    		System.out.println("22.Create_account-Enter Error Captcha verification email = pass");
			    }else{
			    		System.out.println("22.Create_account-Enter Error Captcha verification email = fail");	
			    	 }	    
			    
		//迴圈			}
			    driverChrome.close();  
				    driverChrome.quit();
				  
			}
		}