package com.labssqajobs.TestCases_Recruiter.LoginPage;

import com.labssqajobs.PageObject.Login_Model;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class Login_keep_email_field_blank extends BaseClass {

    @Test
    public void Login_keep_email_blank() throws InterruptedException {
        driver.get(url);
        Login_Model login = new Login_Model(driver);

        login.login(" ", "12345678");

        WebElement errorMessageElement = driver.findElement(By.xpath("//*[text()='Validation error']"));
// Get the text from the error message element
        String actualErrorMessage = errorMessageElement.getText();
// Define the expected error message
        System.out.println(actualErrorMessage);

        String expectedErrorMessage = "Validation error";
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




}}
