package com.synchronisys.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synchronisys.framework.utility.WebUtil;
import com.synchronisys.pages.homepage.Homepage;
import com.synchronisys.pages.login.LoginPage;


public class SampleTestCase {

	@Parameters("BrowserName")			
	@Test
	public void Validate_Login(String BrowserName) throws InterruptedException{

		WebDriver driver=WebUtil.fn_OpenBrowser(BrowserName);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebUtil.fn_OpenUrl("https://www.makemytrip.com/");
		Homepage homepage=new Homepage();
		homepage.ClickOn_LoginOrCreate();
		LoginPage loginPage=new LoginPage();
		loginPage.login();
		Thread.sleep(4000);
		loginPage.LogOut();
		

	}

	@AfterTest
	public void close(){
		WebUtil.fn_CloseBrowser();
	}

}
