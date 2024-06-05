package com.labssqajobs.TestCases_Candidate.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Can_see_Applied_jobs extends TC_login {

    @Test(priority=8)
    public void Successfully_can_see_Applied_Jobs()  {
        MyAcc_MyProfile_Model appliedjob= new MyAcc_MyProfile_Model(driver);
        appliedjob.AppliedJobs_Candidate();
    }





}
