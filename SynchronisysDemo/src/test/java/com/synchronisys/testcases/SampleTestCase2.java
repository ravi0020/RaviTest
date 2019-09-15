package com.synchronisys.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.synchronisys.framework.utility.WebUtil;

public class SampleTestCase2 {

	@Parameters("Browsername")
	@Test
	public void testCase(String Browsername){
		
		WebDriver driver=WebUtil.fn_OpenBrowser(Browsername);
		WebUtil.fn_OpenUrl("www.gmail.com");
		driver.findElement(By.xpath("//"));
	}
	
	
	
}
