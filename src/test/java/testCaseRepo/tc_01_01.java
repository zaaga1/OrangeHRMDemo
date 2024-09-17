package testCaseRepo;

import org.testng.annotations.Test;

import generic.BaseClass;
import objectRepo.HomePage;

public class tc_01_01 extends BaseClass {
	@Test
	public void Tc_01_01() throws Exception 
	{
		System.out.println(" hello "); 
		
		HomePage hm = new HomePage(driver);
		hm.getPIM();
		
		
				
	}
	

}
