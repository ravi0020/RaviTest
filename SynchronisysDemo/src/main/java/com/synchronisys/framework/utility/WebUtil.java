package com.synchronisys.framework.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class WebUtil {

	public static WebDriver driver;
	public static Actions Action;
	/*************************** Click On element **********************************************************************/


	public static void fn_Click(WebElement we){
		we.click();
	}

	/**************************** Enter TextBox Value ******************************************************************/	

	public static void fn_SendKeys(WebElement we, String enterValue){
		we.sendKeys(enterValue);

	}

	/****************************** Browser Open ***********************************************************************/

	public static WebDriver fn_OpenBrowser( String Browsername){

		if(Browsername.contains("ie")){
			System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			System.out.println("Browser Name: "+Browsername+"");
		}else if(Browsername.contains("firefox")){

			System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("Browser Name: "+Browsername+"");
		}else if(Browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Browser Name: "+Browsername+"");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	/********************* Naviagte Url *********************************************************************************/	

	public static void fn_OpenUrl(String Url){

		driver.get(Url);
		System.out.println("Url: "+Url+"" );
	}

	/********************* Get Action Class Object **********************************************/	

	public static Actions ActionObject(){
		Action=null;
		if(Action==null){
			Action=new Actions(driver);
		}else {
			System.out.println("action object already created");
		}


		return Action;

	}

	/******************** close  browser ******************************************************/

	public static void fn_CloseBrowser(){

		driver.close();
	}




}