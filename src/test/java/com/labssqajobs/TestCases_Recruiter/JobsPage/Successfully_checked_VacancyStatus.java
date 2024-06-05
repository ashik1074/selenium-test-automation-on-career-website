package com.labssqajobs.TestCases_Recruiter.JobsPage;

import com.labssqajobs.PageObject.Jobs_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_checked_VacancyStatus extends TC_LoginPage
{
    @Test(priority = 4)
    public void Successfully_Checked_FullTime() throws InterruptedException {
        Jobs_Model Status1 = new Jobs_Model(driver);
        Status1.VacancyStatus1();
    }
    @Test(priority = 5)
    public void Successfully_Checked_Intern() throws InterruptedException {
        Jobs_Model Status2 = new Jobs_Model(driver);
        Status2.VacancyStatus2();
    }
    @Test(priority = 6)
    public void Successfully_Checked_Part_Time() throws InterruptedException {
        Jobs_Model Status3 = new Jobs_Model(driver);
        Status3.VacancyStatus3();
    }


}
