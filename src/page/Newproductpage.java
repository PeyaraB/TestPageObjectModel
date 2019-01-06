package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Newproductpage {
WebDriver driver;
	
	public Newproductpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="name")
	WebElement name;
	
	@FindBy(how=How.ID,using="sales_price")
	WebElement salesprice;

	@FindBy(how=How.ID,using="item_number")
	WebElement itemnumber;
	@FindBy(how=How.ID,using="description")
	WebElement description;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submitbutton;
	
	
	

	
	
	public void addingnewproduct(){
		
		name.sendKeys("Queen Elizabeth");
		salesprice.sendKeys("100,000");
		itemnumber.sendKeys("500");
		submitbutton.click();
	}
	
    
}


