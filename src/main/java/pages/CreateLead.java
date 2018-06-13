package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement leadcname;
	
	
	public CreateLead leadcname() {
		type(leadcname, "Test Leaf");
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement leadfname;
	
	
	public CreateLead leadfname() {
		type(leadfname, "Biswajit");
		return this;			
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement leadlname;
	
	
	public CreateLead leadlname() {
		type(leadlname, "Sundara");
		return this;			
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement crlsub;
	
	
	public ViewLead clickLead() {
		click(crlsub);
		return new ViewLead();		
	}
	
	
	
	

}
