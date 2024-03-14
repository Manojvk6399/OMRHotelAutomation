package com.omrbranchPages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(name="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//b[contains(text(),'Invalid Login')]")
	private WebElement txtErrorMsg;
	
	

	
	public WebElement getTxtErrorMsg() {
		return txtErrorMsg;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
		

	public void login(String username,String password) {
		sendText(getTxtUserName(), username);
		sendText(getTxtPassword(), password);
		click(getBtnLogin());
	}
	public void loginWithEnterKey(String username,String password) throws AWTException {
		sendText(getTxtUserName(), username);
		sendText(getTxtPassword(), password);
		implicitWait();
		enterKey();
	}
	public void getLoginErrorMsg(String username,String password) {
		sendText(getTxtUserName(), username);
		sendText(getTxtPassword(), password);
		click(getBtnLogin());
	}
	public String loginErrorMsg() {
		String InvalidLogin = getText(getTxtErrorMsg());
		return InvalidLogin;
	}
	
	
	
	
	

}
