package testPackage1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cmPages.*;
import frameworkPackage.TestBase;

public class VerifyCustomerCreation extends TestBase
{

	public TestBase testBase = new TestBase();

	//Constructor to assign the class name to global variable
	public VerifyCustomerCreation()
	{
		testName_javaClass = this.getClass().getSimpleName();
	}
	
	@BeforeClass
	public void beforeTestClass() 
	{
		testBase.driver = driver;
		testBase.testdataHashMap = testdataHashMap;
		testBase.eTest = eTest;
	}
	
	
	// Test Methods
	
	@Test(priority=10)
	public void openURL_CM() throws Exception
	{
		new CmHomePage(testBase).openURL_CM();		
	}
	
	@Test(priority=20)
	public void cmLogin() throws Exception
	{
		new CmHomePage(testBase).cmLogin();
	}
	
	@Test(priority=30)
	public void customerCreation() throws Exception
	{
		new CustomerTab(testBase).customerCreation();
	}


}
