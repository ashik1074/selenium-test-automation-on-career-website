package com.labssqajobs.TestCases_Recruiter.WhoApplied;

import com.labssqajobs.PageObject.WhoApplied_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_see_whoApplied extends TC_LoginPage
{
    @Test(priority = 1)

    public void Successfully_can_see_who_applied() throws InterruptedException
    {
        WhoApplied_Model candidate= new WhoApplied_Model(driver);
        candidate.WhoApplied();
    }


}
