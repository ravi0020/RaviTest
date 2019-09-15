package com.synchronisys.pages.login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.synchronisys.framework.utility.WebUtil;

public class LoginPage {


	public WebDriver driver;

	/******************* Enter UserName & Password 
	 * @throws InterruptedException *********************************************/

	public void login() {
		driver=WebUtil.driver;
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("ravibaghel306@gmail.com");
		WebElement Continue=driver.findElement(By.xpath("//span[text()='Continue']"));
		Continue.click();
		Continue.click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ravi@2020");

		/****************** Click On Login ***************************************************************/		

		WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();

	}

	public void LogOut(){
		driver.findElement(By.xpath("//*[@id='SW']/div[2]/div[1]//li[6]")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
	}

}
