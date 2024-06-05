package com.labssqajobs.TestCases_Recruiter.JobsPage;

import com.labssqajobs.PageObject.Jobs_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_searchJobs_usingCategory extends TC_LoginPage

{
    @Test(priority = 1)
public void Successfully_Search_Job_Using_Cayegory() throws InterruptedException {
    Jobs_Model categorySearch = new Jobs_Model(driver);
    categorySearch.selectCategory("Automation Tester");
}







}
