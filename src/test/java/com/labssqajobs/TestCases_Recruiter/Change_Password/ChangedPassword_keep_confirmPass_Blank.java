package com.labssqajobs.TestCases_Recruiter.Change_Password;

import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class ChangedPassword_keep_confirmPass_Blank extends TC_LoginPage

{
    @Test(priority = 2)
    public void Change_password_keepConfirmPassword_blank() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ChangePassword_Model ChangePass = new ChangePassword_Model(driver);
        ChangePass.NewPassword("12345678");

        WebElement errorMessageElement = driver.findElement(By.cssSelector(".error-message"));
        // Extract the text from the found element
        String actualErrorMessage = errorMessageElement.getText();
        String expectedErrorMessage = "Please fill out this field.";
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
    }
}
