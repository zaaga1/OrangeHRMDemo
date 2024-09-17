package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutOfApp {
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement logout;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbutton;

	public LogoutOfApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	public void logoutOfApp()
	{
		getLogout().click();
		getLogoutbutton().click();
	}
	
	
	

}
