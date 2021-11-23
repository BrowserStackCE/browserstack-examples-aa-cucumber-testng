package com.browserstack.examples.stepdefs;
import com.browserstack.examples.pages.LoginPage;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class LoginPageSteps {
    @Given("I am on the Base Page")
    public void checkBasePage() throws InterruptedException{
        
    }
    @When("I navigate to Login Page")
    public void navigateToLoginPage() throws InterruptedException {
        new LoginPage().navigatePage();
    }

    @When("I enter username as {string}")
    public void enterUsername(String username) throws InterruptedException {
        new LoginPage().enterUsername(username);
    }

    @When("I enter password as {string}")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @When("I login")
    public void Login() {
        new LoginPage().pressLoginButton();
    }

    @Then("I should see success message as {string}")
    public void loginShouldSucceed(String message) {
        Assert.assertEquals(new LoginPage().getSuccessMssg(), message);
    }

}
