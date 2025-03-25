package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VeteranCareMedicalHistoryPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class VeteranCareMedicalHistoryPage {

	@TextType()
	@FindBy(xpath = "//div[@id='medicalHistoryInformation-24']/div[2]/div[1]")
	public WebElement PrimaryCarePhysician;
	@TextType()
	@FindBy(xpath = "//div[@id='medicalHistoryInformation-24']/div[2]/div[2]")
	public WebElement DoctorsOffice;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Done']")
	public WebElement doneButton;
			
}
