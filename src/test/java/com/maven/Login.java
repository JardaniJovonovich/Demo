package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public Login(){
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(xpath="(//span[@class='nav-line-1'])[2]")
	public WebElement hellosignin;
	@FindBy(xpath="//div[@class='a-section a-padding-medium auth-workflow']")
	public WebElement clik;
	@FindBy(xpath="//a[@class='a-button-text']")
	public WebElement createAcc;
	@FindBy(xpath="//input[@id='ap_customer_name']")
	public WebElement name;
    @FindBy(xpath="//input[@id='ap_phone_number']")
	public WebElement phNum;
    @FindBy(xpath="//input[@id='ap_email']")
	public WebElement eMail;
    @FindBy(xpath="//input[@id='ap_password']")
	public WebElement passWord;
    @FindBy(xpath="//input[@id='continue']")
	public WebElement signUp;
	@FindBy(xpath="//a[@class='a-link-emphasis']")
    public WebElement signIn;
	@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	public WebElement emailorph;
	@FindBy(xpath="//span[contains(text(),'©')]")
	public WebElement getTxt;
    
    public WebElement getHellosignin() {
		return hellosignin;
	}
	public WebElement getClik() {
		return clik;
	}
	public WebElement getCreateAcc() {
		return createAcc;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getPhNum() {
		return phNum;
	}
	public WebElement geteMail() {
		return eMail;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getSignUp() {
		return signUp;
	}
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getEmailorph() {
		return emailorph;
	}
	public WebElement getGetTxt() {
		return getTxt;
	}

}
