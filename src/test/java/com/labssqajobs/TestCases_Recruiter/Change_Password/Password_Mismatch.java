package com.labssqajobs.TestCases_Recruiter.Change_Password;
import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Password_Mismatch extends TC_LoginPage
{
    @Test(priority = 3)
    public void Changing_Password_Mismatched_NewPass_ConfirmPass() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ChangePassword_Model ChangePass = new ChangePassword_Model(driver);
        ChangePass.MismatchPassword("12345678","87654321");

        WebElement errorMessageElement = driver.findElement(By.cssSelector(".jet-form-builder-message--error"));
        // Extract the text from the found element
        String actualErrorMessage = errorMessageElement.getText();
        // Specify the expected error message
        String expectedErrorMessage = "Passwords don't match.";

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







