package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Newproductpage;
import page.TechFiosLogInpage;
import page.Techfioshomepage3;
import util.BrowserFactory;

public class TFaddnewproductTest {
	@Test 
	public  TFaddnewproductTest 
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/\r\n");
					
			
	TechFiosLogInpage loginPage = PageFactory.initElements(driver, TechFiosLogInpage.class);
			
				
	loginPage.login_demo();
	Techfioshomepage3 tfhomepage3 = PageFactory.initElements(driver, Techfioshomepage3.class);
	tfhomepage3.clickingproductsandservicesbuttons();
	
	Newproductpage productpage = PageFactory.initElements(driver, Newproductpage.class);
	productpage.addingnewproduct();
	
	

	
	driver.close();

	driver.quit();
				
		
	}
}




