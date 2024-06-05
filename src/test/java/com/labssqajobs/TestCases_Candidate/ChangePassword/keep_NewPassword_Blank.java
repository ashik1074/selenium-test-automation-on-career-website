package com.labssqajobs.TestCases_Candidate.ChangePassword;

import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class keep_NewPassword_Blank extends TC_login {


    @Test(priority = 9)
    public void Keep_NewPassword_Blank() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ChangePassword_Model newpass = new ChangePassword_Model(driver);
        newpass.ConfirmPassword("12345678");

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
