package com.browserstack.examples.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class EchoPage extends BasePage {

    @AndroidFindBy (accessibility = "Echo Box") 
	@iOSXCUITFindBy (accessibility = "Echo Box")
	private MobileElement navigateEcho;

	@AndroidFindBy (accessibility = "messageInput") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeTextField[@name='messageInput']")
	private MobileElement textField;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc='messageSaveBtn']") 
	@iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name='messageSaveBtn'])[2]")
	private MobileElement submitButton;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc]")
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name='savedMessage']")
	private MobileElement successMssg;

    public EchoPage navigatePage() throws InterruptedException {
        navigateEcho.click();
        return this;
    
    }
    public EchoPage enterText(String text) throws InterruptedException {

        textField.sendKeys(new String []{text});
        return this;
    
    }

    public EchoPage pressSubmitButton() throws InterruptedException{
        submitButton.click();
        return this;
    
    }
    
    public EchoPage echo(String text) throws InterruptedException {
        enterText(text);
        return pressSubmitButton();
    }
    
    public String getSuccessMssg() {
        return successMssg.getText();
    }


    
}
