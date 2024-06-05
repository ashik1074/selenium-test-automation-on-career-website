package com.labssqajobs.TestCases_Recruiter.WhoApplied;

import com.labssqajobs.PageObject.WhoApplied_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_Download_Resume extends TC_LoginPage

{
    @Test(priority = 3)

    public void Successfully_Download_Candidate_Resume() throws InterruptedException
    {
        WhoApplied_Model CVdownload= new WhoApplied_Model(driver);
        CVdownload.Download();
    }
}
