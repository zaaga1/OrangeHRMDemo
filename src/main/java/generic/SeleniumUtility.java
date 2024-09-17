package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	
	Actions a = null; 
	Select sc = null;
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void implicitWaitTime(WebDriver driver, int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public void moveToSpecificElement(WebDriver driver , WebElement element)
	{
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void rightClickActiononElement(WebDriver driver , WebElement element)
	{
		a = new Actions(driver);
		a.contextClick(element).perform();
	}
}
