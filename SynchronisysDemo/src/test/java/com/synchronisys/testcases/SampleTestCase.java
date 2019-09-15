package com.synchronisys.testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synchronisys.framework.utility.WebUtil;
import com.synchronisys.pages.homepage.Homepage;
import com.synchronisys.pages.login.LoginPage;


@Listeners(com.synchronisys.testng.listener.TestNgITestListener.class)

public class SampleTestCase {



	/************************** Validate Login ***********************************************/

	@Parameters("BrowserName")
	@Test(priority=1,enabled=true)
	public void Validate_Login(String BrowserName) throws InterruptedException {

		WebDriver driver=WebUtil.fn_OpenBrowser(BrowserName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebUtil.fn_OpenUrl("https://www.makemytrip.com/");
		Homepage homepage=new Homepage();
		homepage.ClickOn_LoginOrCreate();
		LoginPage loginPage=new LoginPage();
		loginPage.login();
		String actualText=homepage.getLoginText();
		String expText="Hey Ravi";
		assertEquals(actualText, expText);
		


	}

	/*************** Search Flight Details From Mumbai To Chennai ****************************/

	@Parameters("BrowserName")
	@Test(priority=2,enabled=true)
	public void Validate_FlightBooking(String BrowserName) throws InterruptedException{
		WebDriver driver=WebUtil.fn_OpenBrowser(BrowserName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebUtil.fn_OpenUrl("https://www.makemytrip.com/");
		Homepage homepage=new Homepage();
		homepage.ClickOn_LoginOrCreate();
		LoginPage loginPage=new LoginPage();
		loginPage.login();
		homepage.SearchFlight();
		

	}

	/************************ search Hotel In Mumbai City *********************************************/

	@Parameters("BrowserName")
	@Test(priority=4, enabled=true)
	public void Validate_HotelBooking(String BrowserName) throws InterruptedException{
		WebDriver driver=WebUtil.fn_OpenBrowser(BrowserName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebUtil.fn_OpenUrl("https://www.makemytrip.com/");
		Homepage homepage=new Homepage();
		homepage.ClickOn_LoginOrCreate();
		LoginPage loginPage=new LoginPage();
		loginPage.login();
		homepage.SearchHotel();
		

	}

	/********************* Search Bus From Goa To Mumbai *****************************************/

	@Parameters("BrowserName")
	@Test(priority=3,enabled=true)
	public void Validate_BusBooking(String BrowserName) throws InterruptedException{
		WebDriver driver=WebUtil.fn_OpenBrowser(BrowserName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebUtil.fn_OpenUrl("https://www.makemytrip.com/");
		Homepage homepage=new Homepage();
		homepage.ClickOn_LoginOrCreate();
		LoginPage loginPage=new LoginPage();
		loginPage.login();
		homepage.SearchBus();
		
	}


	/******************************* Close  Browser *************************************************/

	@AfterMethod
	public void close(){
		WebUtil.fn_CloseBrowser();
	}

}
