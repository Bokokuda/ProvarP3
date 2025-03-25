package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VeteranCareProfilePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class VeteranCareProfilePage {

	@TextType()
	@FindBy(xpath = "//c-profile-page/div[1]/div[1]/div/div[1]")
	public WebElement EmailField;
	@TextType()
	@FindBy(xpath = "//c-profile-page//div[1]/div/div[2]")
	public WebElement Phone;
	@TextType()
	@FindBy(xpath = "//c-profile-page//div[1]/div/div[3]")
	public WebElement DOB;
	@TextType()
	@FindBy(xpath = "//c-profile-page//div[1]/div/div[4]")
	public WebElement SSN;
	@TextType()
	@FindBy(xpath = "//div/div[5]")
	public WebElement CreditScore;
	@TextType()
	@FindBy(xpath = "//c-profile-page/div[1]/div[2]/div/div[1]")
	public WebElement Branch;
	@TextType()
	@FindBy(xpath = "//div[1]/div[2]/div/div[2]")
	public WebElement DischargePercentage;
	@TextType()
	@FindBy(xpath = "//div[1]/div[2]/div/div[3]")
	public WebElement StartDate;
	@TextType()
	@FindBy(xpath = "//div[2]/div/div[4]")
	public WebElement EndDate;
	@TextType()
	@FindBy(xpath = "//div[1]/div[3]/div/div[1]")
	public WebElement PrimaryDoctor;
	@TextType()
	@FindBy(xpath = "//div[3]/div/div[2]")
	public WebElement DoctorsOffice;
			
}
