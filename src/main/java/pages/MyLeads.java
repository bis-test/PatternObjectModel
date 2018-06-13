package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement crlead;
	
	
	
	public CreateLead clickcreatelead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(crlead);
		return new CreateLead();		
	}
	

	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement fleads;
	
	public FindLeads clickfindlead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(fleads);
		return new FindLeads();		
	}
	
	
	

}
