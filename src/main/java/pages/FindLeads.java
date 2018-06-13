package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement leadfname;
	
	public FindLeads leadfname(String data) {
		type(leadfname, data);
		return this;		
	}

	
	@FindBy(how=How.NAME,using="lastName")
	private WebElement leadlname;
	
	public FindLeads leadlname(String data) {
		type(leadlname, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH ,using="//button[text()='Find Leads']")
	private WebElement eleflead;
	
	public FindLeads findleads() {
		click(eleflead);
		return this;		
	}
	
	@FindBy(how=How.XPATH ,using="//a[text()='10217']")
	private WebElement elelid;
	
	public FindLeads clickleadid() {
		click(elelid);
		return this;		
	}

}
