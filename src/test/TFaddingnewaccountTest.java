package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Newaccountpage;
import page.TechFiosLogInpage;
import page.Techfioshomepage2;
import util.BrowserFactory;

public class TFaddingnewaccountTest {
	@Test
	public void AddaccountTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			
	TechFiosLogInpage loginPage = PageFactory.initElements(driver, TechFiosLogInpage.class);
			
				
	loginPage.login_demo();
	Techfioshomepage2 tfhomepage2 = PageFactory.initElements(driver, Techfioshomepage2.class);
	tfhomepage2.clickingbankandcashbuttons();
	
	Newaccountpage accountpage = PageFactory.initElements(driver, Newaccountpage.class);
	accountpage.addingnewaccount();
	
	

	
	driver.close();

	driver.quit();
				
		
	}
}


