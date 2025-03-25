package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VeteranCareClaimsPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class VeteranCareClaimsPage {

	@TextType()
	@FindBy(xpath = "//div[1]/c-claim-card/div")
	public WebElement DiabilityCompensationClaimCard;
	@ButtonType()
	@FindBy(xpath = "//div[1]/c-claim-card//button[normalize-space(.)='Start New Claim']")
	public WebElement DisabilityCompensationNewClaimButton;
	@TextType()
	@FindBy(xpath = "//div[2]/c-claim-card/div")
	public WebElement PensionClaimCard;
	@ButtonType()
	@FindBy(xpath = "//div[2]/c-claim-card//button[normalize-space(.)='Start New Claim']")
	public WebElement PensionNewClaimButton;
	@ButtonType()
	@FindBy(xpath = "//div[3]/c-claim-card//button[normalize-space(.)='Start New Claim']")
	public WebElement HealthcareBenefitsNewClaimButton;
	@TextType()
	@FindBy(xpath = "//div[3]/c-claim-card/div")
	public WebElement HealthcareBenefitsClaimCard;
	@TextType()
	@FindBy(xpath = "//div[4]/c-claim-card/div")
	public WebElement EducationAndTrainingClaimCard;
	@ButtonType()
	@FindBy(xpath = "//div[4]//button[normalize-space(.)='Start New Claim']")
	public WebElement EducationAndTrainingNewClaimButton;
	@TextType()
	@FindBy(xpath = "//div[5]/c-claim-card/div")
	public WebElement HousingAssistanceClaimCard;
	@ButtonType()
	@FindBy(xpath = "//div[5]//button[normalize-space(.)='Start New Claim']")
	public WebElement HousingAssistanceNewClaimButton;
			
}
