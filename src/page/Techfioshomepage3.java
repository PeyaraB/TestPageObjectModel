package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfioshomepage3 {
WebDriver driver;
	
	public Techfioshomepage3(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Products & Services']")
	WebElement productsandserviceslink;

	
	@FindBy(how=How.XPATH, using="//a[text()='New Product']")
	WebElement newproductlink;
	
	
	
	
	public void clickingproductsandservicesbuttons(){
		
	productsandserviceslink.click();
	newproductlink.click();
	}
}
	




