package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.SeMethods;

public class HomePage extends SeMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Welcome')]")
	private WebElement eleLoggedName;
	
	public HomePage verifyLoggedName(String data)
	{
		verifyPartialText(eleLoggedName, data);
		return this;
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement elecrmsfa;
	
	public MyHome clickcrmsfa() {
		click(elecrmsfa);
		return new MyHome();		
	}
	
	
	
	
	
	
	

}
