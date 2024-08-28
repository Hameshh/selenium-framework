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

import static com.testing.pageObject.SignInPagePO.*;

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

    @When("I repeat entering {string} {string} and Click Sign in four more times")
    public void iRepeatEnteringAndClickOnSignInButtonFourMoreTimes (String Email, String Password) {
        for (int i = 0; i < 5; i++) {

            SignInPagePO signInPagePO = new SignInPagePO(driver);
            signInPagePO.enterEmail(Email);
            signInPagePO.enterPassword(Password);
            signInPagePO.clickSignInButton();

            //clear fields before entering new data
            EmailField.clear();
            PasswordField.clear();

            EmailField.sendKeys(Email);
            PasswordField.sendKeys(Password);
            SignInButton.click();
        }

    }

    @Then("Account should be locked with an error message displayed")
    public void accountShouldBeLockedWithAnErrorMessageDisplayed() {
        String ExpectedResult = "Account Locked";
        String ActualResult = driver.getTitle();
        Assert.assertEquals(ExpectedResult, ActualResult);

    }


    @And("On my account page I click on What's New tab")
    public void onMyAccountPageIClickOnWhatSNewTab() {
    }

    @And("I click on product link Echo compression Fit short")
    public void iClickOnProductLinkEchoCompressionFitShort() {
    }

    @And("I click on product Size {int}")
    public void iClickOnProductSize(int arg0) {
    }

    @And("I click on colour black")
    public void iClickOnColourBlack() {
    }

    @And("I click on Add to cart button")
    public void iClickOnAddToCartButton() {
    }

    @And("I click on the cart icon")
    public void iClickOnTheCartIcon() {
    }

    @And("I click on the Proceed to checkout button")
    public void iClickOnTheProceedToCheckoutButton() {
    }

    @And("On Checkout Page I enter {string} {string} {string} {string}")
    public void onCheckoutPageIEnter(String arg0, String arg1, String arg2, String arg3) {
    }

    @And("I pick Flat rate")
    public void iPickFlatRate() {
    }

    @And("I click on Next Button")
    public void iClickOnNextButton() {
    }

    @When("I click on Place Order Button")
    public void iClickOnPlaceOrderButton() {
    }

    @And("I click on My Account from profile drop down menu")
    public void iClickOnMyAccountFromProfileDropDownMenu() {
    }

    @And("I click on My Orders")
    public void iClickOnMyOrders() {
    }

    @Then("Order History should be displayed")
    public void orderHistoryShouldBeDisplayed() {
    }
}
