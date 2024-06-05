package com.labssqajobs.TestCases_Candidate;

import com.labssqajobs.PageObject.Login_Model;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import org.testng.annotations.Test;

public class TC_login extends BaseClass {

    @Test(priority = 1)
    public void SucessfulLogin_WithValidCredential() {

        driver.get(url);
        Login_Model login = new Login_Model(driver);
        login.login("demo@yopmail.com", "12345678");
    }



}
