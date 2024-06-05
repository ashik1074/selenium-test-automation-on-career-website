package com.labssqajobs.TestCases_Candidate.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Candidate.TC_login;
import org.testng.annotations.Test;

public class Successfully_Update_ProfileInfo extends TC_login
{
    String imagePath = "C:\\Users\\Dell\\Downloads\\cry.jpg";
    @Test(priority = 2)
    public void Successfully_Update_Picture() {
        MyAcc_MyProfile_Model uploadPic = new MyAcc_MyProfile_Model(driver);
        uploadPic.updatePic_Candidate(imagePath);
    }
    @Test(priority = 3)
    public void Successfully_Update_CandidateInfo() {
        MyAcc_MyProfile_Model updateinfo = new MyAcc_MyProfile_Model(driver);
        updateinfo.UpdateInfo_Candidate("Labonno","Shanjida");
    }

}
