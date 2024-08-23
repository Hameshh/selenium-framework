package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {
    //Element Locator

    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"send2\"]/span")
    public static WebElement SignInButton;


    //Initialise page element using selenium driver

    public SignInPagePO(WebDriver driver) { PageFactory.initElements(driver, this);}


    // Create Java Method for Actions to be Performed on Web Pages

    public void enterEmail(String Email) {EmailField.sendKeys(Email);}

    public void enterPassword(String Password) {PasswordField.sendKeys(Password);}

    public void clickSignInButton() {SignInButton.click();}
}
