package com.synchronisys.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synchronisys.framework.utility.WebUtil;


public class Homepage {
	public WebDriver driver;
	
/***************** click On Login Create Button *********************************************/	
	
	public void ClickOn_LoginOrCreate(){
		driver=WebUtil.driver;
		driver.findElement(By.xpath("//*[text()=' Login or Create Account']")).click();
		
	}
	
	
}
