package com.labssqajobs.TestCases_Candidate.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Successfully_update_Candidate_CV extends TC_login
{
    String CVFile ="C:\\Users\\Dell\\Downloads\\selenium-note-2.pdf";
    @Test(priority = 6)
    public void Successfully_Update_Candidate_Resume() throws InterruptedException {
        MyAcc_MyProfile_Model uploadResume= new MyAcc_MyProfile_Model(driver);
        uploadResume.UpdateResume_Candidate(CVFile);
    }
}
