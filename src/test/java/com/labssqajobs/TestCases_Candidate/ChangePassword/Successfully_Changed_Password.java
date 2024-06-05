package com.labssqajobs.TestCases_Candidate.ChangePassword;

import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_Changed_Password extends TC_login {

    @Test(priority = 3)
    public void Successfully_Change_Password() throws InterruptedException{
        ChangePassword_Model changepass = new ChangePassword_Model(driver);
        changepass.changePassword("12345678");
    }

}
