package com.labssqajobs.TestCases_Recruiter.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class SuccessfullyUpload_Profile_picture extends TC_LoginPage
{
    String imagePath = "C:\\Users\\Dell\\Downloads\\TechSavvy.jpg";
    @Test(priority = 1)
    public void Successfully_Picture_Upload()
    {
        MyAcc_MyProfile_Model uploadPic = new MyAcc_MyProfile_Model(driver);
        uploadPic.uploadPicture(imagePath);
    }



}




