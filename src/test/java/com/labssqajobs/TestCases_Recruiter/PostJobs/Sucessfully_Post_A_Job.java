package com.labssqajobs.TestCases_Recruiter.PostJobs;

import com.labssqajobs.PageObject.PostJob_Model;
import com.labssqajobs.PageObject.WhoApplied_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Sucessfully_Post_A_Job extends TC_LoginPage {

    @Test(priority = 2)

    public void Successfully_input_title() throws InterruptedException
    {
        PostJob_Model postjob = new PostJob_Model(driver);
        postjob.Successjobpost("Senior Software Engineer","Mobile desktop application Quality Assure","70000","Dhaka","03","04-05-02024");
    }



}
