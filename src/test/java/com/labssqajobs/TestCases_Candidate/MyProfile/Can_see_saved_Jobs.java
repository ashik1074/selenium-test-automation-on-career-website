package com.labssqajobs.TestCases_Candidate.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Can_see_saved_Jobs extends TC_login {

    @Test(priority=7)
    public void Successfully_can_see_SavedJobs()  {
        MyAcc_MyProfile_Model saveJob= new MyAcc_MyProfile_Model(driver);
        saveJob.SavedJobs_Candidate();
    }
}
