package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VeteranManagementHomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class VeteranManagementHomePage {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='View All']")
	public WebElement AppLauncherViewAll;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='VeteranCare']")
	public WebElement veteranCareSiteCard;
			
}
