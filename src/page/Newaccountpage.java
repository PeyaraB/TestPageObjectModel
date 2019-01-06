package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Newaccountpage {
WebDriver driver;
	
	public Newaccountpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="account")
	WebElement accounttitle;
	
	@FindBy(how=How.ID,using="description")
	WebElement description;

	@FindBy(how=How.ID,using="balance")
	WebElement initialbalance;
	
	
	@FindBy(how=How.XPATH,using="//text()[contains(.,'Submit')]/ancestor::button[1]")
	WebElement submitbutton;
	
	
	

	
	
	public void addingnewaccount(){
		
		accounttitle.sendKeys("TommyCook");
		description.sendKeys("paycheck");
		initialbalance.sendKeys("50,000");
		submitbutton.click();
	}
	
    
}


