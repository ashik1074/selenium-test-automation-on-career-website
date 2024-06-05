package com.labssqajobs.TestCases_Recruiter.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Sucessfully_Edit_Posted_Job extends TC_LoginPage
{
    @Test(priority = 8)
    public void Successfully_Picture_Upload() throws InterruptedException
    {
        MyAcc_MyProfile_Model editpostedjob = new MyAcc_MyProfile_Model(driver);
      editpostedjob.editPostedJob("Junior QA Engineer");
    }

}
