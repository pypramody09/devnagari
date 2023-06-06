package com.test.devnagari;
import org.testng.annotations.*;
import com.base.devnagari.Browser_Invocation;
import com.pom.devnagari.Existing_User;



public class TC_Login_Existing_User extends Browser_Invocation {
	
		
	@Test
	public void LoginForExistingUser() {
		Existing_User eu=new Existing_User(driver);
		eu.Click_Existing_User();
		eu.Enter_Email();
		eu.Enter_Password();
		eu.Click_Login();
		
	}
	@AfterMethod
	public void tear_down() {
		driver.quit();
	}
}
