package junitpack;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class junit_oauth_login {
	@Test
	public void Login() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:/Users/alexyang/Desktop/driver/geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/driver/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
//		IE
//		WebDriver driverChrome= new InternetExplorerDriver();
			
//		Firefox change language			
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("intl.accept_languages", "en");
//		WebDriver driverChrome = new FirefoxDriver(profile);
		
//      Chrome change language		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en");
		WebDriver driverChrome = new ChromeDriver(options);
		
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		// login
		//driverChrome.manage().window().maximize();
		//driverChrome.navigate().to("https://wr-qa-vsaas.kalay.us/");
		//driverChrome.navigate().to("https://stg-vsaas.kalayservice.com/");
		driverChrome.navigate().to("https://wr-qa-vsaas.kalay.us/");

		// 迴圈 for(int i = 0 ; i < 10; i++){
		Thread.sleep(10000);
		//driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).click();
		driverChrome.findElement(By.xpath("//*[@id='root']/div/section/form/div[3]/span")).click();
		//String test = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();
		Thread.sleep(10000);
		//System.out.println(test);
		driverChrome.findElement(By.id("id_email")).clear();
		//String test = driverChrome.findElement(By.id("id_email")).getText();
		//System.out.println(test);
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("c24571111@gmail.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("Alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(10000);
		//<span data-reactid=".0.0.0.0.1.$1.0.1">Hi! 0000000000000000000000000000000000000000000000000000000000!</span>
		
		
		// logout
		driverChrome.findElement(By.cssSelector("[class='navi_user list_icon']")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driverChrome.findElement(By.linkText("登出")).click();
		driverChrome.findElement(By.linkText("Log Out")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);

		// keyin Email address: Null
		driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).click();
		Thread.sleep(3000);
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("a13243537");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Null = "Please enter your email";
		//String Email_Null = "這個欄位是必須的。";
		// try{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		// }catch (Exception e){;}
		String element0 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Null.equals(element0) == true) {
			System.out.println("0.keyin Email address: Null = pass");
		} else {
			System.out.println("0.keyin Email address: Null = fail");
		}
		// keyin Password: Null
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Password_Null = "Please enter your password";
		//String Password_Null = "這個欄位是必須的。";
		// try{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password-help']/ul/li")));
		// }catch (Exception e){;}
		String element0_1 = driverChrome.findElement(By.xpath("//*[@id='password-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Password_Null.equals(element0_1) == true) {
			System.out.println("0_1.keyin Password: Null = pass");
		} else {
			System.out.println("0_1.keyin Password: Null = fail");
		}
		// keyin Email address: Abnormal a@a
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("a@a");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Abnormal = "Email or Password is not correct";
		// String Email_Abnormal = "輸入有效的電子郵件地址。";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element1 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Abnormal.equals(element1) == true) {
			System.out.println("1.keyin Email address: Abnormal a@a = pass");
		} else {
			System.out.println("1.keyin Email address: Abnormal a@a = fail");
		}
		// keyin Email address: Abnormal a@a.c
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("a@a.c");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Abnormal_1 = "Email or Password is not correct";
		// String Email_Abnormal_1 = "輸入有效的電子郵件地址。";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element1_1 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Abnormal_1.equals(element1_1) == true) {
			System.out.println("1_1.keyin Email address: Abnormal a@a.c = pass");
		} else {
			System.out.println("1_1.keyin Email address: Abnormal a@a.c = fail");
		}
		// keyin Email address: Abnormal a@@a.c2c
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("a@@a.c2c");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Abnormal_2 = "Email or Password is not correct";
		// String Email_Abnormal_1 = "輸入有效的電子郵件地址。";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element1_2 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Abnormal_2.equals(element1_2) == true) {
			System.out.println("1_2.keyin Email address: Abnormal a@@a.c2c = pass");
		} else {
			System.out.println("1_2.keyin Email address: Abnormal a@@a.c2c = fail");
		}
		// keyin Email address: Abnormal a@a@a.cc
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("a@a@a.cc");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Abnormal_3 = "Email or Password is not correct";
		// String Email_Abnormal_1 = "輸入有效的電子郵件地址。";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element1_3 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Abnormal_3.equals(element1_3) == true) {
			System.out.println("1_3.keyin Email address: Abnormal a@a@a.cc = pass");
		} else {
			System.out.println("1_3.keyin Email address: Abnormal a@a@a.cc = fail");
		}
		// keyin Email address: Abnormal aa.cc
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("aa.cc");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Abnormal_4 = "Email or Password is not correct";
		// String Email_Abnormal_1 = "輸入有效的電子郵件地址。";
		// try{
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element1_4 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Abnormal_4.equals(element1_4) == true) {
			System.out.println("1_4.keyin Email address: Abnormal aa.cc = pass");
		} else {
			System.out.println("1_4.keyin Email address: Abnormal aa.cc = fail");
		}

		// keyin Email address: Abnormal abcd
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("abcd");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String Email_Abnormal_5 = "Email or Password is not correct";
		// String Email_Abnormal_1 = "輸入有效的電子郵件地址。";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element1_5 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Email_Abnormal_5.equals(element1_5) == true) {
			System.out.println("1_5.keyin Email address: Abnormal abcd = pass");
		} else {
			System.out.println("1_5.keyin Email address: Abnormal abcd = fail");
		}

		// keyin error password
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String error_password = "Email or Password is not correct";
		// String error_password = "帳號或密碼錯誤";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element2 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (error_password.equals(element2) == true) {
			System.out.println("2.keyin error password = pass");
		} else {
			System.out.println("2.keyin error password = fail");
		}

		// keyin less than 8 characters password
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("alex245");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String less_than_8_characters = "Email or Password is not correct";
		// String error_password = "帳號或密碼錯誤";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element3 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (less_than_8_characters.equals(element3) == true) {
			System.out.println("3.keyin less than 8 characters password = pass");
		} else {
			System.out.println("3.keyin less than 8 characters password = fail");
		}

		// keyin 1~8 password
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("12345678");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String keyin_1to8_password = "Email or Password is not correct";
		// String error_password = "帳號或密碼錯誤";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element4 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (keyin_1to8_password.equals(element4) == true) {
			System.out.println("4.keyin 1~8 password = pass");
		} else {
			System.out.println("4.keyin 1~8 password = fail");
		}
		// keyin over 20 characters
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("8888888888iiiiiiiiii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String keyin_over_20_characters = "Email or Password is not correct";
		// String error_password = "帳號或密碼錯誤";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element5 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (keyin_over_20_characters.equals(element5) == true) {
			System.out.println("5.keyin over 20 characters = pass");
		} else {
			System.out.println("5.keyin over 20 characters = fail");
		}
		// The e-mail format incorrect
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_email")).sendKeys("12345678");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.id("id_password")).sendKeys("a13243537");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		String The_email_format_incorrect = "Email or Password is not correct";
		// String error_password = "帳號或密碼錯誤";
		// try{
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")));
		// }catch (Exception e){;}
		String element6 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[5]/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (The_email_format_incorrect.equals(element6) == true) {
			System.out.println("6.The e-mail format incorrect = pass");
		} else {
			System.out.println("6.The e-mail format incorrect = fail");
		}

		// Enter resend email page
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div[2]/form/div[6]/a")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Enter_resend_email_page = "Please enter your email address to reset password";
		// String Enter_resend_email_page = "請輸入您的電子郵件地址以重設密碼";
		// try{
		// }catch (Exception e){;}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='body-container']/div/div/form/p[2]")));
		String element7 = driverChrome.findElement(By.xpath("//*[@id='body-container']/div/div/form/p[2]")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page.equals(element7) == true) {
			System.out.println("7.Enter resend email page = pass");
		} else {
			System.out.println("7.Enter resend email page = fail");
		}

		// Enter resend email page - Null
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_Null = "Please enter your email";
		//String Enter_resend_email_page_Null = "這個欄位是必須的。";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element8 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_Null.equals(element8) == true) {
			System.out.println("8.Enter resend email page - Null = pass");
		} else {
			System.out.println("8.Enter resend email page - Null = fail");
		}
		// Enter resend email page - a@a
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.findElement(By.id("id_email")).sendKeys("a@a");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_0 = "The email is not valid";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element9 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_0.equals(element9) == true) {
			System.out.println("9.Enter resend email page - a@a = pass");
		} else {
			System.out.println("9.Enter resend email page - a@a = fail");
		}
		// Enter resend email page - a@a.c
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.findElement(By.id("id_email")).sendKeys("a@a.c");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_1 = "The email is not valid";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element9_1 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_1.equals(element9_1) == true) {
			System.out.println("9_1.Enter resend email page - a@a.c = pass");
		} else {
			System.out.println("9_1.Enter resend email page - a@a.c = fail");
		}
		// Enter resend email page - a@@a.c2c
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.findElement(By.id("id_email")).sendKeys("a@@a.c2c");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_3 = "The email is not valid";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element9_3 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_3.equals(element9_3) == true) {
			System.out.println("9_2.Enter resend email page - a@@a.c2c = pass");
		} else {
			System.out.println("9_2.Enter resend email page - a@@a.c2c = fail");
		}
		// Enter resend email page - a@a@a.cc
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.findElement(By.id("id_email")).sendKeys("a@a@a.cc");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_4 = "The email is not valid";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element9_4 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_4.equals(element9_4) == true) {
			System.out.println("9_3.Enter resend email page - a@a@a.cc = pass");
		} else {
			System.out.println("9_3.Enter resend email page - a@a@a.cc = fail");
		}
		// Enter resend email page - aa.cc
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.findElement(By.id("id_email")).sendKeys("aa.cc");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_5 = "The email is not valid";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element9_5 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_5.equals(element9_4) == true) {
			System.out.println("9_4.Enter resend email page - aa.cc = pass");
		} else {
			System.out.println("9_4.Enter resend email page - aa.cc = fail");
		}
		// Enter resend email page - abcd
		driverChrome.findElement(By.id("id_email")).clear();
		driverChrome.findElement(By.id("id_email")).sendKeys("abcd");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(1000);
		// String Enter_resend_email_page_Null = "Please enter your email
		// address to reset password";
		String Enter_resend_email_page_6 = "The email is not valid";
		// try{
		// }catch (Exception e){;}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email-help']/ul/li")));
		String element9_6 = driverChrome.findElement(By.xpath("//*[@id='email-help']/ul/li")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Enter_resend_email_page_6.equals(element9_6) == true) {
			System.out.println("9_5.Enter resend email page - abcd = pass");
		} else {
			System.out.println("9_5.Enter resend email page - abcd = fail");
		}
		// Enter resend email page - right account
				driverChrome.findElement(By.id("id_email")).clear();
				driverChrome.findElement(By.id("id_email")).sendKeys("alex_yang@tutk.com");
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
				Thread.sleep(5000);
				// String Enter_resend_email_page_Null = "Please enter your email
				// address to reset password";
				String Enter_resend_email_page_7 = "We've send you an email to reset your password.";
				// try{
				// }catch (Exception e){;}
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'text-center lead kfs-0 padding-top-2 padding-bottom-2')]")));
				String element9_7 = driverChrome.findElement(By.xpath("//p[contains(@class,'text-center lead kfs-0 padding-top-2 padding-bottom-2')]")).getText();
				driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				if (Enter_resend_email_page_7.equals(element9_7) == true) {
					System.out.println("10.Enter resend email page - right account = pass");
				} else {
					System.out.println("10.Enter resend email page - right account = fail");
				}
		
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(3000);
		// Forgot password back to Log in page
		//driverChrome.findElement(By.xpath("/html/body/div/div/div/form/div[2]/a")).click();
		
		
		// 迴圈 }
		driverChrome.close();  
	    driverChrome.quit();
		
	}
}