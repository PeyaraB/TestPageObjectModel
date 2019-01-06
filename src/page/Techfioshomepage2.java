package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfioshomepage2 {
WebDriver driver;
	
	public Techfioshomepage2(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Bank & Cash']")
	WebElement bankandcashlink;

	
	@FindBy(how=How.XPATH, using="//a[text()='New Account']")
	WebElement newaccountlink;
	
	
	
	
	public void clickingbankandcashbuttons(){
		
	bankandcashlink.click();
	newaccountlink.click();
	}
}
	



