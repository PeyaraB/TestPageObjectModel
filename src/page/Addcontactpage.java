package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addcontactpage {
	WebDriver driver;
	
	public Addcontactpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="account")
	WebElement fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement companyname;

	@FindBy(how=How.ID,using="email")
	WebElement email;
	
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	
	@FindBy(how=How.ID,using="city")
	WebElement city;
	
	
	@FindBy(how=How.ID,using="state")
	WebElement state;
	
	
	@FindBy(how=How.ID,using="zip")
	WebElement zipcode;
	
	
	@FindBy(how=How.ID,using="submit")
	WebElement submitbutton;
	
	
	

	
	
	public void addingcontact(){
		
		fullname.sendKeys("Brad Pitt");
		companyname.sendKeys("Pretty Homes");
		email.sendKeys("brad.pitt@hotmail.com");
		phone.sendKeys("2129594456");
		address.sendKeys("456 Main Street");
		city.sendKeys("Raccoon");
		state.sendKeys("CA");
		zipcode.sendKeys("11599");
		submitbutton.click();
	}
	
    
}
