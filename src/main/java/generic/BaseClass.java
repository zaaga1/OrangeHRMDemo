package generic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.LogoutOfApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver = null;
	PropertyUtility putil = new PropertyUtility();
	SeleniumUtility sutil = new SeleniumUtility();
	
	@BeforeSuite
	public void dbConnection()
	{
		System.out.println("Db Connection successfull");
	}
	@BeforeClass
	public void launchbrowser() throws Exception
	{
		driver = new ChromeDriver();
		String Url = putil.getDataFromProperty("url");
		driver.get(Url);
		sutil.maximizeWindow(driver);
		sutil.implicitWaitTime(driver, 10);
		
		
		
	}
	@BeforeMethod
	public void loginToApp() throws Exception
	{
		
		String UN = putil.getDataFromProperty("username");
		String PW = putil.getDataFromProperty("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(UN, PW);
		HomePage hm = new HomePage(driver);
		hm.PIMButton();
	}
	@AfterMethod
	public void logoutofapp() 
	{
		LogoutOfApp lop = new LogoutOfApp(driver);
		lop.logoutOfApp();
	}
	
	
	

}
