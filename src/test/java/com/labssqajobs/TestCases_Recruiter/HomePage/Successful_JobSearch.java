package com.labssqajobs.TestCases_Recruiter.HomePage;

import com.labssqajobs.PageObject.Home_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successful_JobSearch extends TC_LoginPage

{
    @Test(priority = 1)
    public void SuccessfulSearchTest() throws InterruptedException
    {
        // Login_Model l1 = new Login_Model(driver) ;
        Home_Model search = new Home_Model(driver);
        search.Search("Quality Assurance");
    }


}
