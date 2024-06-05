package com.labssqajobs.TestCases_Recruiter.HomePage;

import com.labssqajobs.PageObject.Home_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successful_dropdownSelect extends TC_LoginPage
{
    @Test(priority = 2)

    public void SuccessfulDropdownSelect() throws InterruptedException
    {
        Home_Model dropdown = new Home_Model(driver);
        dropdown.selectOption("Barbados");
    }
}
