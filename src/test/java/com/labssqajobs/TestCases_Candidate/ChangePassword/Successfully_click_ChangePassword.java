package com.labssqajobs.TestCases_Candidate.ChangePassword;

import com.labssqajobs.PageObject.ChangePassword_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Successfully_click_ChangePassword extends TC_login {


    @Test(priority = 2)
    public void Successfully_Change_Password() throws InterruptedException{
        ChangePassword_Model changepass = new ChangePassword_Model(driver);
        changepass.ChangePassBtn();
    }





}
