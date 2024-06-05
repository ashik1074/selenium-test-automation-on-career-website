package com.labssqajobs.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Model {

    private WebDriver driver;
    public Login_Model(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Locators
    @FindBy(xpath = "(//span[text()='Log In'])[1]")
    private WebElement loginFeature;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    // Constructor

    @FindBy(xpath = "(//*[text()=\"Login\"])[3]")
    private WebElement loginButton;

    // Enter email
    public void enterEmail(String email)
    {
        emailField.sendKeys(email);
    }

    // Enter password
    public void enterPassword(String password)
    {
        passwordField.sendKeys(password);
    }

    public void login(String email, String password) {
        loginFeature.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void login_Candidate(String email, String password) {
        loginFeature.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}