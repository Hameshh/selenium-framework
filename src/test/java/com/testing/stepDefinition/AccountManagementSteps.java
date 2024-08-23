package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AccountManagementSteps {
    WebDriver driver = Hooks.driver;
    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterPasswordConfirmation(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.clickCreateAccountButton();
    }

    @Then("My account page is displayed")
    public void myAccountPageIsDisplayed() {
        String ExpectedResult = "My Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);

    }

    @Then("An error message saying Existing customer with an account error message should be displayed")
    public void anErrorMessageSayingExistingCustomerWithAnAccountErrorMessageShouldBeDisplayed() {
        String ExpectedResult = "Create New Customer Account";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

    @Given("I am on sign in page")
    public void iAmOnSignInPage() {
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickSignInLink();
    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.enterEmail(Email);
        signInPagePO.enterPassword(Password);
    }

    @And("I click on sign in")
    public void iClickOnSignIn() {
        SignInPagePO signInPagePO = new SignInPagePO(driver);
        signInPagePO.clickSignInButton();
    }

    @Then("Error message should be displayed")
    public void ErrorMessageShouldBeDisplayed() {
        String ExpectedResult = "Customer Login";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);
    }

}
