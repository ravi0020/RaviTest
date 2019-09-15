package com.synchronisys.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.synchronisys.framework.utility.WebUtil;


public class Homepage {



	public WebDriver driver;
	Actions act=WebUtil.ActionObject();





	/***************** click On Login Create Button *********************************************/	

	public void ClickOn_LoginOrCreate(){
		driver=WebUtil.driver;
		driver.findElement(By.xpath("//*[text()=' Login or Create Account']")).click();


	}


	/*********************** Get Login User Text *********************************************/

	public String getLoginText() throws InterruptedException{
		Thread.sleep(4000);
		String loginText=driver.findElement(By.xpath("//*[@id='SW']//li[6]//p")).getText();
		return loginText;
	}


	/******************************** Search Flight Between Mumbai to Chennai ************************/

	public void SearchFlight() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		WebElement fromCity=driver.findElement(By.xpath("//*[@id='fromCity']"));
		act.sendKeys(fromCity,"mumbai").perform();
		act.sendKeys(fromCity, Keys.ARROW_DOWN).perform();
		act.sendKeys(fromCity, Keys.ENTER).perform();
		WebElement toCity=driver.findElement(By.xpath("//*[@id='toCity']"));
		act.sendKeys(toCity, "Chennai").perform();
		act.sendKeys(toCity, Keys.ARROW_DOWN).perform();
		act.sendKeys(toCity, Keys.ENTER).perform();
		try{
			driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		}
		catch(Exception e){}
		driver.findElement(By.xpath("//*[@aria-label='Wed Sep 25 2019']//p[text()='25']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}


	/************************* Search Hotel In Mumbai ******************************************/

	public void SearchHotel() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hotels']")).click();
		WebElement city=driver.findElement(By.xpath("//*[@id='city']"));
		act.sendKeys(city, "Mumbai").perform();
		act.sendKeys(city, Keys.ARROW_DOWN).perform();
		act.sendKeys(city, Keys.ENTER).perform();
		try{
			driver.findElement(By.xpath("//*[@class='hsw_inputBox dates  ']")).click();
		}catch(Exception e){}
		driver.findElement(By.xpath("//*[@aria-label='Fri Sep 27 2019']")).click();
		driver.findElement(By.xpath("//*[@aria-label='Sun Oct 27 2019']")).click();
		driver.findElement(By.xpath("//*[@id='hsw_search_button']")).click();

	}


	/************************** Search Buses Between Gao to Mumbai ***********************************/	

	public void SearchBus() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		WebElement fromcity=driver.findElement(By.xpath("//*[@id='fromCity']"));
		act.sendKeys(fromcity,"goa").perform();
		act.sendKeys(fromcity, Keys.ARROW_DOWN).perform();
		act.sendKeys(fromcity, Keys.ENTER).perform();
		WebElement toCity=driver.findElement(By.xpath("//*[@id='toCity']"));
		act.sendKeys(toCity,"Mumbai").perform();
		act.sendKeys(toCity, Keys.ARROW_DOWN).perform();
		act.sendKeys(toCity, Keys.ENTER).perform();
		try{
			driver.findElement(By.xpath("//*[@id='travelDate']")).click();
		}catch(Exception e){}

		driver.findElement(By.xpath("//*[@aria-label='Sun Oct 20 2019']")).click();
		driver.findElement(By.xpath("//*[@id='search_button']")).click();


	}

}






/****  Url: https://github.com/ravi0020/RaviTest.git  ******/