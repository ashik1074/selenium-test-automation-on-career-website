package com.labssqajobs.TestCases_Recruiter.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_update_CompanyAbout extends TC_LoginPage
{

    @Test(priority = 7)
    public void successfulEditCompanyAbout() throws InterruptedException {

        MyAcc_MyProfile_Model EditCompanyAbout = new MyAcc_MyProfile_Model(driver);
        EditCompanyAbout.editCompanyDescription(" QA HArbor is a software testing service provider." +
                "Very friendly work environment");
    }
}
