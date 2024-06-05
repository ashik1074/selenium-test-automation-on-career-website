package com.labssqajobs.TestCases_Candidate.LoginPage;

import com.labssqajobs.PageObject.Login_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login_keep_password_field_blank extends BaseClass {

    @Test(priority = 4)
    public void Login_keep_password_blank() {
        driver.get(url);
        Login_Model login = new Login_Model(driver);

        login.login("demo@yopmail.com ", "");

        WebElement errorMessageElement = driver.findElement(By.cssSelector(".error-message"));
        // Get the text from the error message element
        String actualErrorMessage = errorMessageElement.getText();

        // Define the expected error message
        String expectedErrorMessage = "Please fill out with your password.";
        // Assert that the actual error message matches the expected error message
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
