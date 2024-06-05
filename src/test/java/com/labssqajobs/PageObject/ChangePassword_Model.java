package com.labssqajobs.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ChangePassword_Model {
    private WebDriver driver;
    public ChangePassword_Model (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//span[@class='elementor-button-text'])[1]")
    private WebElement ChangePassBtn;
    @FindBy(id = "new_password")
    private WebElement NewPassBtn;
    @FindBy(id = "confirm_password")
    private WebElement ConPassBtn;
    @FindBy(css = "button.jet-form-builder__action-button.submit-type-reload")
    private WebElement UpdatePass;

    public void changePassword(String text) throws InterruptedException {
        Thread.sleep(1000);
        ChangePassBtn.click();
        Thread.sleep(1000);
        NewPassBtn.sendKeys(text);
        ConPassBtn.sendKeys(text);
        UpdatePass.click();
    }

    public void ChangePassBtn()
    {
        ChangePassBtn.click();
    }
    public void NewPassword(String text) throws InterruptedException {
        ChangePassBtn.click();
        Thread.sleep(1000);
        NewPassBtn.sendKeys(text);
        UpdatePass.click();
    }

    public void ConfirmPassword(String text) throws InterruptedException {
        ChangePassBtn.click();
        Thread.sleep(1000);
        ConPassBtn.sendKeys(text);
        UpdatePass.click();
    }
    public void MismatchPassword(String text,String text2) throws InterruptedException {
        ChangePassBtn.click();
        Thread.sleep(1000);
        NewPassBtn.sendKeys(text);
        ConPassBtn.sendKeys(text2);
        UpdatePass.click();
    }
    public void lessCharacter(String text) throws InterruptedException {
        ChangePassBtn.click();
        Thread.sleep(1000);
        NewPassBtn.sendKeys(text);

    }




}
