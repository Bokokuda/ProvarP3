package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VeteranCarePortalHomePage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class VeteranCarePortalHomePage {

	@LinkType()
	@FindBy(xpath = "//community_navigation-global-navigation-item/a[normalize-space(.)='Home']")
	public WebElement headerHome;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Claims']")
	public WebElement headerClaims;
	@LinkType()
	@FindBy(xpath = "//community_navigation-global-navigation-item/a[normalize-space(.)='Profile']")
	public WebElement headerProfile;
	@LinkType()
	@FindBy(xpath = "//a[@aria-haspopup='true' and contains(@class,'trigger-link') and @role='button']")
	public WebElement HeaderUsernameDropdown;
	@LinkType()
	@FindBy(xpath = "//li/a[normalize-space(.)='Home']")
	public WebElement UsernameDropdownHome;
	@LinkType()
	@FindBy(xpath = "//li/a[contains(normalize-space(.),'Profile')]")
	public WebElement UsernameDropdownProfile;
	@TextType()
	@FindBy(xpath = "//input")
	public WebElement SearchBar;
			
}
