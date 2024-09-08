package com.selenium.cucumber.SeleniumCucumberProject;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginActions {
	LoginLocators logact;
	public LoginActions() {
		this.logact = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logact);
	}
	public void setEmail(String username) {
		logact.username.sendKeys(username);
	}
	public void setPassword(String password) {
		logact.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		logact.loginButton.click();
	}
	public String getVerifyText() {
		return logact.verifyText.getText();
	}
	public String getErrorText() {
		return logact.errorText.getText();
	}
	public void username(String username)
	{
		logact.username.sendKeys(username);
	}
	public void password(String password)
	{
		logact.password.sendKeys(password);
	}
	
	public void loginAccount(String username, String password) {
		setEmail(username);
		setPassword(password);
	}
	public void clicklogout() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(logact.userclick));
		logact.userclick.click();
		logact.logout.click();
	}

}