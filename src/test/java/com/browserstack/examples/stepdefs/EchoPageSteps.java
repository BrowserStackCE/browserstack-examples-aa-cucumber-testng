package com.browserstack.examples.stepdefs;
import com.browserstack.examples.pages.EchoPage;
import com.browserstack.webdriver.testng.listeners.WebDriverListener;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.Listeners;


public class EchoPageSteps {
    @When("I navigate to Echo Box")
    public void navigateToLoginPage() throws InterruptedException {
        new EchoPage().navigatePage();
    }

    @When("I enter {string}")
    public void enterText(String text) throws InterruptedException {
        new EchoPage().enterText(text);
    }

    @When("I submit")
    public void Submit() throws InterruptedException {
        new EchoPage().pressSubmitButton();
    }

    @Then("it should pass and show message as {string}")
    public void echoShouldSucceed(String message) {
        Assert.assertEquals(new EchoPage().getSuccessMssg(), message);
    }

    @Then("it should fail and show message as {string}")
    public void echoShouldFail(String message) {
        Assert.assertEquals(new EchoPage().getSuccessMssg(), message);
    }
    
}
