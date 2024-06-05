package com.labssqajobs.TestCases_Recruiter.PostJobs;

import com.labssqajobs.PageObject.PostJob_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Keep_Category_blank extends TC_LoginPage {

    @Test(priority = 11)

    public void KeepCategory_Blank() throws InterruptedException
    {
        PostJob_Model Category= new PostJob_Model(driver);
        Category.CategoryBlank("Senior Software Engineer","Mobile desktop application Quality Assure","70000","Dhaka","03","04-05-02024");

        WebElement errorMessageElement = driver.findElement(By.cssSelector("div.error-message"));
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

