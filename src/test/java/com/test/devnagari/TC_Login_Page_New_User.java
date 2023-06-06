package com.test.devnagari;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.base.devnagari.Browser_Invocation;
import com.pom.devnagari.New_Registration;

public class TC_Login_Page_New_User extends Browser_Invocation {
	
	@Test
	public void LoginPage() throws InterruptedException {
		
		New_Registration lp= new New_Registration(driver);
		lp.Enter_First_Name();
		lp.Enter_Last_Name();
		lp.Enter_Email();
		Thread.sleep(3000);
		WebElement dropdown_country_code= driver.findElement(By.xpath("//select[@id='country_code']"));
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		String script = "arguments[0].value = '+91'";
	    jsExecutor1.executeScript(script, dropdown_country_code);
		lp.Enter_Mobile_Number();
		lp.Enter_Organization_Name();
		lp.Enter_Password();
		lp.Enter_Confirm_Password();
//		lp.Click_Register();
		WebElement elementToClick = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor jsExecutor2 = (JavascriptExecutor) driver;
		jsExecutor2.executeScript("arguments[0].click();", elementToClick);	

	}
//	@AfterMethod
//	public void tear_down() {
//		driver.quit();
//	}
//	

	

}
