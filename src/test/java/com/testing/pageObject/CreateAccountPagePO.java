package com.testing.pageObject;

import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {
    // Element Locator
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;

    @FindBy(id = "lastname")
    public static WebElement LastNameField;

    @FindBy(id = "email_address")
    public static WebElement EmailField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button")
    public static WebElement CreateAnAccountButton;


    // Initialise Web Element Using Selenium Webdriver
    public CreateAccountPagePO(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    // Create Java Method for Actions to be Performed on Web Pages

    public void enterFirstName(String FirstName) {
        FirstNameField.sendKeys(FirstName);
    }

    public void enterLastName(String LastName) {
        LastNameField.sendKeys(LastName);
    }

    public void enterEmail(String Email) {
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void enterPasswordConfirmation(String ConfirmPassword) {
        ConfirmPasswordField.sendKeys(ConfirmPassword);
    }

    public void clickCreateAccountButton(){
        CreateAnAccountButton.click();
    }
}
