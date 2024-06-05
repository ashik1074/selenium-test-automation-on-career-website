package com.labssqajobs.TestCases_Recruiter.HomePage;

import com.labssqajobs.PageObject.Home_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_see_JobDetails extends TC_LoginPage
{
    @Test(priority = 3)
    public void Jobdetails () throws InterruptedException
    {
        Home_Model search = new Home_Model(driver);
        search.JobDetails();
    }

}
