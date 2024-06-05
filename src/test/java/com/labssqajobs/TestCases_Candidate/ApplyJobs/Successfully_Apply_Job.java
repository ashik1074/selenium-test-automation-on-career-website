package com.labssqajobs.TestCases_Candidate.ApplyJobs;

import com.labssqajobs.PageObject.ApplyToJob_Model;
import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import com.labssqajobs.TestCases_Recruiter.BaseClass;
import org.testng.annotations.Test;

public class Successfully_Apply_Job extends TC_login {

    @Test(priority=2)
    public void Successfully_Apply_Job() throws InterruptedException {
        ApplyToJob_Model applyjob = new ApplyToJob_Model(driver);
        applyjob.Applyjob();
    }
}
