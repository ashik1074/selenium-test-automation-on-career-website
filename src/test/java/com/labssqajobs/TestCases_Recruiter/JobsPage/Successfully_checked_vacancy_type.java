package com.labssqajobs.TestCases_Recruiter.JobsPage;

import com.labssqajobs.PageObject.Jobs_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Successfully_checked_vacancy_type extends TC_LoginPage
{
    @Test(priority = 2)
    public void Successfully_Onsite_Checkbox_checked() throws InterruptedException
    {
        Jobs_Model CheckBox2= new Jobs_Model(driver);
        CheckBox2.VacancyType2();
    }

    @Test(priority = 3)
    public void Successfully_Remote_Checkbox_checked() throws InterruptedException
    {
        Jobs_Model CheckBox= new Jobs_Model(driver);
        CheckBox.VacancyType1();
    }

}
