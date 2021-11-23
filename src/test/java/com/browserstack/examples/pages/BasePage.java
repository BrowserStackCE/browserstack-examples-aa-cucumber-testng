package com.browserstack.examples.pages;

import com.browserstack.examples.tests.RunAppiumCucumberTests;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class BasePage {
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
    public AppiumDriver<?> getDriver(){
        return (AppiumDriver<?>)RunAppiumCucumberTests.getManagedWebDriver().getWebDriver();
    }
}
