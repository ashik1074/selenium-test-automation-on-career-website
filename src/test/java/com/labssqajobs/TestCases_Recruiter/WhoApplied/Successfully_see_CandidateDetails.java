package com.labssqajobs.TestCases_Recruiter.WhoApplied;

import com.labssqajobs.PageObject.WhoApplied_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_see_CandidateDetails extends TC_LoginPage

{
    @Test(priority = 2)

    public void Successfully_Download_Candidate_Resume() throws InterruptedException
    {
        WhoApplied_Model CandidateDetails= new WhoApplied_Model(driver);
        CandidateDetails.CandidateDetails();
    }
}

