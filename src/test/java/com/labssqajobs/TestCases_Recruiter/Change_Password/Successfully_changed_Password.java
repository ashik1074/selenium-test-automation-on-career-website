package com.labssqajobs.TestCases_Recruiter.Change_Password;

import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Successfully_changed_Password extends TC_LoginPage {

    @Test(priority=1)
    public void successfulChangePassword() throws InterruptedException {

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ChangePassword_Model ChangePass = new ChangePassword_Model(driver);
        ChangePass.changePassword("12345678");

        WebElement successMessageElement = driver.findElement(By.cssSelector(".jet-form-builder-message.jet-form-builder-message--success"));
        // Extract the text from the found element
        String actualSuccessMessage = successMessageElement.getText();
        // Specify the expected success message
        String expectedSuccessMessage = "You have successfully changed your password.";

        try {
            Assert.assertEquals(expectedSuccessMessage, actualSuccessMessage);
            // If the assertion passes, this line will be executed
            System.out.println("Expected and actual messages meet: " + actualSuccessMessage);
        } catch (AssertionError e) {
            // This block will execute if the assertion fails
            System.out.println("Assertion failed. Expected: '" + expectedSuccessMessage + "', but got: '" + actualSuccessMessage + "'");
            // Optionally rethrow the assertion error if you want the test to fail
            throw e;
        }

    }





}
