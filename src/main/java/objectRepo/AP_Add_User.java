package objectRepo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AP_Add_User {
	Robot r= null;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement emplName;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[1]")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebutton;

	

	public AP_Add_User(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserRole() {
		return userRole;
	}

	public WebElement getEmplName() {
		return emplName;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void AddUser1(String empName,String username,String password, String confirmpassword) throws Exception
	{
		r= new Robot();
		getUserRole().click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		getEmplName().sendKeys(empName);
		getStatus().click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		getUserName().sendKeys(empName);
		getPassword().sendKeys(password);
		getConfirmPassword().sendKeys(confirmpassword);
		getSavebutton().click();
		
	}
	
	
	
}

