package com.synchronisys.pages.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.synchronisys.framework.utility.WebUtil;
import com.synchronisys.pages.homepage.Homepage;

public class LoginPage {

	public WebDriver driver;

/******************* Enter UserName & Password *********************************************/
	
	public void login(){
		driver=WebUtil.driver;
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("ravibaghel306@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ravi@2020");
		
/****************** Click On Login ***************************************************************/		
		
		WebElement login=driver.findElement(By.xpath("//*[@id='SW']//div[4]//span[text()='Login']"));
		login.click();
		login.click();
	}

public void LogOut(){
	driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[1]//li[6]")).click();
	driver.findElement(By.xpath("//*[text()='Logout']")).click();
}

}
