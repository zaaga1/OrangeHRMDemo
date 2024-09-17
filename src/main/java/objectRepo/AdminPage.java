package objectRepo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	Robot r=null;
	
	@FindBy(xpath= "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	private WebElement addButton;
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']")
	private WebElement username;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userRole;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement empName;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	private WebElement resetButton;

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserRole() {
		return userRole;
	}

	public WebElement getEmpName() {
		return empName;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}
	
	public void searchUsers(String username,String empName) throws Exception
	{
		 r = new Robot();
		getUsername().sendKeys(username);
		getUserRole().click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		getEmpName().sendKeys(empName);
		getStatus().click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		getSearchButton().click();
	}
	public void resetUser()
	{
		getResetButton().click();
	}
	
	public void AddUser() throws Exception
	{
		getAddButton().click();
		
	}

}
