package com.labssqajobs.TestCases_Candidate.ChangePassword;

import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingLess_Characters_ToChangePassword extends TC_login {

    @Test(priority = 4)
    public void Changing_Password_using_lessthan_8_Characters() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ChangePassword_Model ChangePass = new ChangePassword_Model(driver);
        ChangePass.lessCharacter("1234");

        WebElement errorMessageElement = driver.findElement(By.cssSelector(".error-message"));
        // Extract the text from the found element
        String actualErrorMessage = errorMessageElement.getText();
        // Specify the expected error message
        String expectedErrorMessage = "Please increase the password length to at least 8 characters (you are currently using 4 characters).";

        try {
            Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
            // If the assertion passes, this line will be executed
            System.out.println("Expected and actual messages meet: " + actualErrorMessage);
        } catch (AssertionError e) {
            // This block will execute if the assertion fails
            System.out.println("Assertion failed. Expected: '" + expectedErrorMessage + "', but got: '" + actualErrorMessage + "'");
            // Optionally rethrow the assertion error if you want the test to fail
            throw e;
        }
}}
