package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.TechFiosLogInpage;
import util.BrowserFactory;

public class TechFiosLogInTest {
	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			
	TechFiosLogInpage loginPage = PageFactory.initElements(driver, TechFiosLogInpage.class);
			
				
	loginPage.login_demo();

	driver.close();

	driver.quit();
				
		
	}
	}


