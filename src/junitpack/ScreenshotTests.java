package junitpack;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ScreenshotTests {


		@Test
		public void executeFirefoxDriver() throws InterruptedException, Exception {
			this.execute(DesiredCapabilities.firefox());
		}
		@Test
		public void executeInternetExplorerDriver() throws InterruptedException, Exception {
			this.execute(DesiredCapabilities.internetExplorer());
		}
		@Test
		public void executeChrome() throws InterruptedException, Exception {
			this.execute(DesiredCapabilities.chrome());
		}

		private void execute(final DesiredCapabilities capability) throws InterruptedException, Exception {
			WebDriver driverChrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//public void Account_Setting() throws Exception {
					//System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
					//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/workspace/junitproject_kalay_vsaas_3.0/IEDriverServer.exe");
					//System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/workspace/junitproject_kalay_vsaas_3.0/ChromeDriver.exe");
					//WebDriver driverChrome= new FirefoxDriver();
					//WebDriver driverChrome= new InternetExplorerDriver();
					//WebDriver driverChrome= new ChromeDriver();
					
					
					WebDriverWait wait = new WebDriverWait(driverChrome, 10);
					driverChrome.manage().window().maximize();
					driverChrome.navigate().to("https://alpha.kalay.us/");
					
					Thread.sleep(10000);
					File scrFile = ((TakesScreenshot)driverChrome).getScreenshotAs(OutputType.FILE);
					// Now you can do whatever you need to do with it, for example copy somewhere
					
					FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
					
					driverChrome.close();
					driverChrome.quit();
}
	}