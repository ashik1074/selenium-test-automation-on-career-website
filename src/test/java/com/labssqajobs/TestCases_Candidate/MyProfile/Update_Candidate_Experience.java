package com.labssqajobs.TestCases_Candidate.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Update_Candidate_Experience extends TC_login
{
    @Test(priority = 5)
    public void Successfully_Update_Candidate_Experience() {
        MyAcc_MyProfile_Model updateExprnce = new MyAcc_MyProfile_Model(driver);
        updateExprnce.UpdateExperience_Candidate("3");
    }

}
