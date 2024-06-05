package com.labssqajobs.TestCases_Candidate.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Successfully_Update_contactInfo extends TC_login
{
    @Test(priority = 4)
    public void Successfully_Update_Candidate_ContactInfo() {
        MyAcc_MyProfile_Model updateContact = new MyAcc_MyProfile_Model(driver);
        updateContact.UpdateContact_Candidate("demo@yopmail.com","https://www.aarong.com");
    }
}
