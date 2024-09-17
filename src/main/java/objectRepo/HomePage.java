package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath= "//a[@class='oxd-main-menu-item active']")
	private WebElement adminbutton;
	
	@FindBy (xpath="//a[@class='oxd-main-menu-item active']")
	private WebElement PIM;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPIM() {
		return PIM;
	}

	public WebElement getAdminbutton() {
		return adminbutton;
	}

	

	public void AdminButton()
	{
		getAdminbutton().click();
	}
	public void PIMButton()
	{
		getPIM().click();
	}
	

}
