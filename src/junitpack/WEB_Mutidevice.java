package junitpack;

import static org.junit.Assert.*;

import org.junit.Test;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class WEB_Mutidevice {
	
			@Test
			public void executeFirefoxDriver() throws MalformedURLException {
				this.execute(DesiredCapabilities.firefox());
				//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/IEDriverServer.exe");
			}

			
			public void executeChrome() throws MalformedURLException {
				this.execute(DesiredCapabilities.chrome());
			}
			
			private void execute(final DesiredCapabilities capability) throws MalformedURLException {
				WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability
				);
				//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/IEDriverServer.exe");
				driver.get("http://www.google.com/");
				//WebElement element = driver.findElement(By.name("s"));
				//element.sendKeys("selenuim");
				//element.submit();
				assertThat(
						driver.getTitle(),
						is("You searched for selenuim | Java Code Geeks")
				);
				
				//Thread.sleep(100000);
				driver.quit();
			}
		}
	

