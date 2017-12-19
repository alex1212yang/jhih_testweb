package junitpack;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

//	@Test
//	public void executeFirefoxDriver() throws InterruptedException, Exception {
//		this.execute(DesiredCapabilities.firefox());
//	}
	@Test
	public void executeInternetExplorerDriver() throws InterruptedException, Exception {
		this.execute(DesiredCapabilities.internetExplorer());
	}
//	@Test
//	public void executeChrome() throws InterruptedException, Exception {
//		this.execute(DesiredCapabilities.chrome());
//	}
	
	private void execute(final DesiredCapabilities capability) throws InterruptedException, Exception {
		WebDriver driverChrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		
		WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		//login
					driverChrome.manage().window().maximize();
					driverChrome.navigate().to("https://k2-alpha.kalay.us/");
					
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
				    Thread.sleep(2000);
				    
				    driverChrome.close();
				    driverChrome.quit();
				    Thread.sleep(1000);
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
}