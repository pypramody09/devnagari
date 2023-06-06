package com.pom.devnagari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Registration {
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement txt_First_Name;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement txt_Last_Name;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txt_Email;

	@FindBy(xpath="//input[@id='phone']")
	private WebElement txt_Mobile_Number;
	
	@FindBy(xpath="//input[@id='organization_name']")
	private WebElement txt_Organization_Name;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txt_Password;
	
	@FindBy(xpath="//input[@id='password_confirmation']")
	private WebElement txt_Confirm_Password;
	
//	@FindBy(xpath="//button[@type='submit']")
//	private WebElement button_Register;
	
	public New_Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Enter_First_Name() {
		txt_First_Name.sendKeys("Pramod");
	}
	public void Enter_Last_Name() {
		txt_Last_Name.sendKeys("Yadav");
	}
	public void Enter_Email() {
		txt_Email.sendKeys("pypramody88@gmail.com");
	}
	public void Enter_Mobile_Number() {
		txt_Mobile_Number.sendKeys("8668478188");
	}
	public void Enter_Organization_Name() {
		txt_Organization_Name.sendKeys("Devnagari");
	}
	public void Enter_Password() {
		txt_Password.sendKeys("Pramod@12345");
	}
	public void Enter_Confirm_Password() {
		txt_Confirm_Password.sendKeys("Pramod@12345");
	}
//	public void Click_Register() {
//		txt_Last_Name.click();
//	}
	
}
