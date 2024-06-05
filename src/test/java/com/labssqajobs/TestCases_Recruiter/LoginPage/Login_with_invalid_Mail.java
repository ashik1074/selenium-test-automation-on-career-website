package com.labssqajobs.TestCases_Recruiter.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.labssqajobs.PageObject.Login_Model;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_with_invalid_Mail extends BaseClass
{
    @Test
    public void SucessfulLogin_WithValidCredential()
    {
        driver.get(url);
        Login_Model login = new Login_Model(driver);
        login.login("tech@yopmail.com", "12345678");

        WebElement errorMessageElement = driver.findElement(By.cssSelector(".jet-form-builder-message.jet-form-builder-message--error"));
// Get the text from the error message element
        String actualErrorMessage = errorMessageElement.getText();
        System.out.println(actualErrorMessage);
// Define the expected error message
        String expectedErrorMessage = "Unknown email address. Check again or try your username.";
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
