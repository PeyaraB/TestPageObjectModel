package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Techfioshomepage {
WebDriver driver;
	
	public Techfioshomepage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement crmlink;

	
	@FindBy(how=How.XPATH, using="//a[text()='Add Contact']")
	WebElement addcontactlink;
	@FindBy(how=How.XPATH, using="//div[@class='dropdown-backdrop']")
	WebElement profilename;
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Income Today')]")
	WebElement incometoday;
@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense Today')]")
WebElement expensetoday;
@FindBy(how=How.XPATH, using="//span[contains(text(),'Income This Month')]")
WebElement incomethismonth;
@FindBy(how=How.XPATH, using="//span[contains(text(),'Expense This Month')]")
WebElement expensethismonth;
@FindBy(how=How.XPATH, using="//input[@type='text'][@placeholder='Search Customers...']")
WebElement searchbox;
@FindBy(how=How.XPATH, using="//*[@class=' c3-event-rect c3-event-rect-7']")
WebElement incomeandexpensegraph;
@FindBy(how=How.XPATH, using="//*[@class=' c3-shape c3-shape c3-arc c3-arc-Income']")
WebElement incomevsexpensegraph;
@FindBy(how=How.XPATH, using="//h5[text()='Net Worth & Account Balances']")
WebElement networthtable;


public void validatetable() 
{
if (networthtable.isDisplayed())
System.out.println("networth table displays");
}
public void validateimage() 
{
if (incomevsexpensegraph.isDisplayed())
System.out.println("image is displayed");
}

public void validategraph() 
{
if (incomeandexpensegraph.isDisplayed())
 System.out.println("graph is showing"); 
}

public void validatesearchbox()
{
	searchbox.isDisplayed();
	System.out.println("searchbox shows");
}

public void validateincomeandexpenseboxes()
{
	incometoday.isDisplayed();
	expensetoday.isDisplayed();
	incomethismonth.isDisplayed();
	expensethismonth.isDisplayed();
	System.out.println("boxes are displayed properly");
}
	
	public void validateuser()
	{
		profilename.isDisplayed();
		System.out.println("login works and homepage opens");

	}
	
	public void clickingcontactbuttons(){
		
		crmlink.click();
		addcontactlink.click();
	}
}
	

