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

public class junit_add_camera {

	@Test
	public void Add_Camera() throws Exception {
		int remove_device = 1;
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
		 
		
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		driverChrome.manage().window().maximize();
		/*
		 * driverChrome.navigate().to("https://alpha.kalay.us/"); //迴圈 for(int i
		 * = 0 ; i < 10; i++){
		 * driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
		 * 
		 * //Add Camera driverChrome.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS);
		 * driverChrome.findElement(By.id("input-email")).clear();
		 * driverChrome.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS);
		 * driverChrome.findElement(By.id("input-email")).sendKeys(
		 * "b24571111@gmail.com");
		 * driverChrome.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS);
		 * driverChrome.findElement(By.id("input-password")).clear();
		 * driverChrome.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS);
		 * driverChrome.findElement(By.id("input-password")).sendKeys("alex2457"
		 * ); driverChrome.manage().timeouts().implicitlyWait(30,
		 * TimeUnit.SECONDS); driverChrome.findElement(By.xpath(
		 * "//*[@id='root']/div/section/form/div[3]/span")).click();
		 */
		driverChrome.navigate().to("https://wr-qa-vsaas.kalay.us/");

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
		driverChrome.findElement(By.id("id_password")).sendKeys("Alex2457");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='submit']")).click();
		Thread.sleep(12000);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input"))
				.sendKeys("EBUABT7CZV3M2H6GU1Z1");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input"))
				.sendKeys("888888ii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='pickColorModal']/div/div/div[3]/div/div[2]/span")).click();
		Thread.sleep(3000);
		String Add_Camera = "auto_test";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element1 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera.equals(element1) == true) {
			System.out.println("1.Add_Camera = pass");
		} else {
			System.out.println("1.Add_Camera = fail");
		}
		//*[@id="root"]/div/div[2]/div[2]/div[1]/div/div[1]/span
		// Delete camera
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[3]/label/input"))
				.click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[4]/div[2]/div/span"))
				.click();
		Thread.sleep(5000);
		// Add Camera-default color green
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input"))
				.sendKeys("EBUABT7CZV3M2H6GU1Z1");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input"))
				.sendKeys("888888ii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='pickColorModal']/div/div/div[3]/div/div[1]/span")).click();
		Thread.sleep(3000);
		String Add_Camera_default_color_green = "auto_test";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element2 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera_default_color_green.equals(element2) == true) {
			System.out.println("2.Add Camera-default color green = pass");
		} else {
			System.out.println("2.Add Camera-default color green = fail");
		}
		Thread.sleep(3000);
		// Delete camera
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[3]/label/input"))
				.click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[4]/div[2]/div/span"))
				.click();

		// Add Camera-UID Number: blank
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input"))
				.sendKeys("888888ii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		Thread.sleep(3000);
		//String Add_Camera_UID_Number_blank = "請輸入所有欄位";
		String Add_Camera_UID_Number_blank = "Please fill in all the fields.";
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")));
		String element4 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera_UID_Number_blank.equals(element4) == true) {
			System.out.println("4.Add Camera-UID Number: blank = pass");
		} else {
			System.out.println("4.Add Camera-UID Number: blank = fail");
		}
		Thread.sleep(3000);
		// Add Camera-UID Password: blank
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/span")).click();
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input"))
				.sendKeys("EBUABT7CZV3M2H6GU1Z1");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).sendKeys("888888ii");
		// driverChrome.manage().timeouts().implicitlyWait(30,
		// TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		Thread.sleep(1000);
		//String Add_Camera_UID_Password_blank = "請輸入所有欄位";
		String Add_Camera_UID_Password_blank = "Please fill in all the fields.";
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")));
		String element5 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera_UID_Password_blank.equals(element5) == true) {
			System.out.println("5.Add Camera-UID Password: blank = pass");
		} else {
			System.out.println("5.Add Camera-UID Password: blank = fail");
		}

		// Add Camera-Device Name: blank
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/span")).click();
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input"))
				.sendKeys("EBUABT7CZV3M2H6GU1Z1");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input"))
				.sendKeys("888888ii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).sendKeys("auto_test");
		// driverChrome.manage().timeouts().implicitlyWait(30,
		// TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		Thread.sleep(1000);
		//String Add_Camera_Device_Name_blank = "請輸入所有欄位";
		String Add_Camera_Device_Name_blank = "Please fill in all the fields.";
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")));
		String element6 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera_Device_Name_blank.equals(element6) == true) {
			System.out.println("6.Add Camera-Device Name: blank = pass");
		} else {
			System.out.println("6.Add Camera-Device Name: blank = fail");
		}

		// *為了case.7新增ipcam
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/span")).click();
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input"))
				.sendKeys("EBUABT7CZV3M2H6GU1Z1");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input"))
				.sendKeys("888888ii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='pickColorModal']/div/div/div[3]/div/div[2]/span")).click();
		// *
		Thread.sleep(5000);
		// Add Camera-keyin already "UID Number"
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]/div")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[1]/input"))
				.sendKeys("EBUABT7CZV3M2H6GU1Z1");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[2]/input"))
				.sendKeys("888888ii");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input")).clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[2]/div/div[3]/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/div/div/div[3]/div/div/span")).click();
		Thread.sleep(1000);
		//String Add_Camera_keyin_already_UID_Number = "此設備已被其他人使用,請確認後再試";
		String Add_Camera_keyin_already_UID_Number = "You cannot add this device because this UID has been used.";
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")));
		String element7 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.0.3']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera_keyin_already_UID_Number.equals(element7) == true) {
			System.out.println("7.Add Camera-keyin already \"UID Number\" = pass");
		} else {
			System.out.println("7.Add Camera-keyin already \"UID Number\" = fail");
		}
		// Edit camera-keyin new camera name
		Thread.sleep(3000);
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='addDeviceModal']/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.sendKeys("keyin_new_camera_name");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(3000);
		String Edit_camera_keyin_new_camera_name = "keyin_new_camera_name";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element10 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Edit_camera_keyin_new_camera_name.equals(element10) == true) {
			System.out.println("10.Edit camera-keyin new camera name = pass");
		} else {
			System.out.println("10.Edit camera-keyin new camera name = fail");
		}

		// Edit camera-keyin new camera name spec
		Thread.sleep(3000);
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.sendKeys("_-@/:;'\".,");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(3000);
		String Edit_camera_keyin_new_camera_name_spec = "_-@/:;'\".,";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element11 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Edit_camera_keyin_new_camera_name_spec.equals(element11) == true) {
			System.out.println("11.Edit camera-keyin new camera name spec = pass");
		} else {
			System.out.println("11.Edit camera-keyin new camera name spec = fail");
		}

		// Add Camera-keyin new camera name MAX
		Thread.sleep(3000);
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.sendKeys("0123456789012345678901234");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(1000);
		String Add_Camera_keyin_new_camera_name_MAX = "0123456789012345678901234";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element12 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Add_Camera_keyin_new_camera_name_MAX.equals(element12) == true) {
			System.out.println("12.Add Camera-keyin new camera name MAX = pass");
		} else {
			System.out.println("12.Add Camera-keyin new camera name MAX = fail");
		}

		// *改變device name為auto_test
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.sendKeys("auto_test");
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		// *

		// Device info-show message 設備名稱
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		//*[@id="root"]/div/div[2]/div[2]/div[1]/div/div[1]/span
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String Device_info_show_message_device_name = "設備名稱";
		String Device_info_show_message_device_name = "Device Name";
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.1.0']")));
		String element15_1 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.1.0']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Device_info_show_message_device_name.equals(element15_1) == true) {
			System.out.println("15_1.Device info-show message = pass");
		} else {
			System.out.println("15_1.Device info-show message = fail");
		}

		// Device info-show message EBUABT7CZV3M2H6GU1Z1
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Device_info_show_message_UID = "EBUABT7CZV3M2H6GU1Z1";
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.1.3']")));
		String element15_2 = driverChrome.findElement(By.cssSelector("div[data-reactid='.0.3.1.1.0.1.1.3']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Device_info_show_message_UID.equals(element15_2) == true) {
			System.out.println("15_2.Device info-show message = pass");
		} else {
			System.out.println("15_2.Device info-show message = fail");
		}

		// Device info-show message 移除設備
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String Device_info_show_message_remove_device = "移除設備";
		String Device_info_show_message_remove_device = "Remove Device";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.3.1.1.0.2.0.0.1']")));
		String element15_3 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.3.1.1.0.2.0.0.1']"))
				.getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Device_info_show_message_remove_device.equals(element15_3) == true) {
			System.out.println("15_3.Device info-show message = pass");
		} else {
			System.out.println("15_3.Device info-show message = fail");
		}

		// Device info-Click "X" in the upper right
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(1000);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(1000);
		String Device_info_Click_X_in_the_upper_right = "auto_test";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element16 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Device_info_Click_X_in_the_upper_right.equals(element16) == true) {
			System.out.println("16.Device info-Click \"X\" in the upper right = pass");
		} else {
			System.out.println("16.Device info-Click \"X\" in the upper right = fail");
		}

		// Device info-Device name: blank
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/div/input"))
				.clear();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(1000);
		String Device_info_Device_name_blank = "auto_test";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element17 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Device_info_Device_name_blank.equals(element17) == true) {
			System.out.println("17.Device info-Device name: blank = pass");
		} else {
			System.out.println("17.Device info-Device name: blank = fail");
		}

		// Remove camera-Click Remove Cancel button
		Thread.sleep(3000);
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[3]/label/input"))
				.click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[4]/div[1]/div/span"))
				.click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/span")).click();
		Thread.sleep(1000);
		String Remove_camera_Click_Remove_Cancel_button = "auto_test";
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		String element21 = driverChrome
				.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (Remove_camera_Click_Remove_Cancel_button.equals(element21) == true) {
			System.out.println("21.Remove camera-Click Remove Cancel button = pass");
		} else {
			System.out.println("21.Remove camera-Click Remove Cancel button = fail");
		}

		// Remove camera success
		Thread.sleep(3000);
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div[1]/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[3]/div/div/span")).click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[3]/label/input"))
				.click();
		driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driverChrome.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div/div/div[2]/div[4]/div[2]/div/span"))
				.click();
		Thread.sleep(5000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")));
		try {
			String element22 = driverChrome
					.findElement(By.cssSelector("div[data-reactid='.0.1.1.0:$EBUABT7CZV3M2H6GU1Z1.0.1']")).getText();
			Thread.sleep(1000);
		} catch (Exception e) {
			remove_device = 0;
			// TODO Auto-generated catch block
		}
		if (remove_device == 0) {
			System.out.println("22.Remove camera success = pass");
		} else {
			System.out.println("22.Remove camera success = fail");
		}
		driverChrome.close();
		driverChrome.quit();

	}

}
