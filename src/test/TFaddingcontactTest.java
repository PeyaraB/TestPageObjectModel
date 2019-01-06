package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Addcontactpage;
import page.TechFiosLogInpage;
import page.Techfioshomepage;
import util.BrowserFactory;

public class TFaddingcontactTest {
	@Test
	public void AddcontactTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			
	TechFiosLogInpage loginPage = PageFactory.initElements(driver, TechFiosLogInpage.class);
			
				
	loginPage.login_demo();
	Techfioshomepage homepage = PageFactory.initElements(driver, Techfioshomepage.class);
	homepage.clickingcontactbuttons();
	
	Addcontactpage addcontact = PageFactory.initElements(driver, Addcontactpage.class);
	addcontact.addingcontact();
	
	

	
	driver.close();

	driver.quit();
				
		
	}
}
