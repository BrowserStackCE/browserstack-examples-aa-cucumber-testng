package com.browserstack.examples.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class LoginPage extends BasePage {

    @AndroidFindBy (accessibility = "Login Screen") 
	@iOSXCUITFindBy (accessibility = "//XCUIElementTypeOther[@name='Login Screen']")
	private MobileElement navigateLogin;

	@AndroidFindBy (accessibility = "username") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeTextField[@name='username']")
	private MobileElement usernameField;
	
	@AndroidFindBy (accessibility = "password") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeSecureTextField[@name='password']")
	private MobileElement passwordField;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc='loginBtn']") 
	@iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name='loginBtn'])[2]")
	private MobileElement loginButton;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.TextView[2]") 
	@iOSXCUITFindBy (accessibility = "//XCUIElementTypeStaticText[@name='You are logged in as alice']")
	private MobileElement successMssg;



public LoginPage navigatePage() throws InterruptedException {
    navigateLogin.click();
    return this;

}
public LoginPage enterUsername(String username) throws InterruptedException {

	usernameField.sendKeys(new String []{"alice"});
	return this;

}

public LoginPage enterPassword(String password) {

	passwordField.sendKeys(new String []{"mypassword"});
	return this;

}

public LoginPage pressLoginButton(){

    loginButton.click();
	return this;

}

public LoginPage login(String username, String password) throws InterruptedException {
	enterUsername(username);
	enterPassword(password);
	return pressLoginButton();
}

public String getSuccessMssg() {
	return successMssg.getText();
}
    
}
