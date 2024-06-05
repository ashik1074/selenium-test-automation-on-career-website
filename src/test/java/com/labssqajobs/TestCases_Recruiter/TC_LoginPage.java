package com.labssqajobs.TestCases_Recruiter;
import com.labssqajobs.PageObject.Login_Model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class TC_LoginPage extends BaseClass {

    @Test
    public void SucessfulLogin_WithValidCredential() {

        driver.get(url);
        Login_Model login = new Login_Model(driver);
        login.login("tec@yopmail.com", "12345678");

    }
}
