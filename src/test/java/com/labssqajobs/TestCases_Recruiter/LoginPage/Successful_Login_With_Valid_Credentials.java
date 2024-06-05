package com.labssqajobs.TestCases_Recruiter.LoginPage;

import com.labssqajobs.PageObject.Login_Model;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import org.testng.annotations.Test;

public class Successful_Login_With_Valid_Credentials extends BaseClass {

    @Test
    public void SucessfulLogin_WithValidCredential()
    {
        driver.get(url);
        Login_Model login = new Login_Model(driver);
        login.login("tec@yopmail.com", "12345678");

    }
}
