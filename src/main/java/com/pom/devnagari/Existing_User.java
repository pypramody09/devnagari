package com.pom.devnagari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Existing_User {
	
	@FindBy(xpath="//*[contains(text(),'Existing user')]")
	private WebElement button_Existing_User;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	private WebElement txt_Email;
	
	@FindBy(xpath="(//input[@id='password'])[1]")
	private WebElement txt_Password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement button_Login;
	
	public Existing_User(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Click_Existing_User() {
		button_Existing_User.click();
	}
	public void Enter_Email() {
		txt_Email.sendKeys("pypramody09@gmail.com");
	}
	public void Enter_Password() {
		txt_Password.sendKeys("Pramod@12345");
	}
	public void Click_Login() {
		button_Login.click();
	}

}
