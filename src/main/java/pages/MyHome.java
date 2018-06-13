package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods{
	
	public MyHome() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	private WebElement eleleads;
	
	
    
	public MyLeads clickleads() {
		// TODO Auto-generated method stub
		click(eleleads);
		return new MyLeads();
	}


	
	
	
	
	
	
	

}
